package com.atom.group.authcenter.core.jedis;

import com.google.common.base.Splitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import redis.clients.jedis.*;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-16 11:30
 **/
@Configuration
public class JedisStarter {

    private static final Logger logger = LoggerFactory.getLogger(JedisStarter.class);
    
    @Bean
    public JedisClient jedisClient(JedisProperties jedisProperties)
    {
        JedisClient jedisClient = null;
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(jedisProperties.getMaxIdle());
        config.setMinIdle(jedisProperties.getMinIdle());
        config.setMaxTotal(jedisProperties.getMaxTotal());
        config.setMaxWaitMillis(jedisProperties.getMaxWaitMillis());
        config.setTestOnBorrow(jedisProperties.getTestOnBorrow());
        config.setTestOnReturn(jedisProperties.getTestOnReturn());
        config.setTestWhileIdle(jedisProperties.getTestWhileIdle());
        config.setMinEvictableIdleTimeMillis(jedisProperties.getMinEvictableIdleTimeMillis());
        config.setSoftMinEvictableIdleTimeMillis(jedisProperties.getSoftMinEvictableIdleTimeMillis());
        config.setTimeBetweenEvictionRunsMillis(jedisProperties.getTimeBetweenEvictionRunsMillis());
        config.setNumTestsPerEvictionRun(jedisProperties.getNumTestsPerEvictionRun());
        JedisPool jedisPool;
        if (jedisProperties.getCluster()) {
            logger.info("build redis cluster ............");
            final String clusterUrl = jedisProperties.getClusterUrl();
            final Set<HostAndPort> hostAndPorts =
                    Splitter.on(";")
                            .splitToList(clusterUrl)
                            .stream()
                            .map(HostAndPort::parseString).collect(Collectors.toSet());
            JedisCluster jedisCluster = new JedisCluster(hostAndPorts, config);
            jedisClient = new JedisClientCluster(jedisCluster);
        } else if (jedisProperties.getSentinel()) {
            logger.info("build redis sentinel ............");
            final String sentinelUrl = jedisProperties.getSentinelUrl();
            final Set<String> hostAndPorts =
                    new HashSet<>(Splitter.on(";")
                            .splitToList(sentinelUrl));

            JedisSentinelPool pool =
                    new JedisSentinelPool(jedisProperties.getMasterName(), hostAndPorts,
                            config, jedisProperties.getTimeOut(), jedisProperties.getPassword());
            jedisClient = new JedisClientSentinel(pool);
        } else {
            if (!StringUtils.isEmpty(jedisProperties.getPassword())) {
                jedisPool = new JedisPool(config, jedisProperties.getHostName(), jedisProperties.getPort(), jedisProperties.getTimeOut(), jedisProperties.getPassword());
            } else {
                jedisPool = new JedisPool(config, jedisProperties.getHostName(), jedisProperties.getPort(), jedisProperties.getTimeOut());
            }
            jedisClient = new JedisClientSingle(jedisPool);
        }
        return jedisClient;
    }    
}
