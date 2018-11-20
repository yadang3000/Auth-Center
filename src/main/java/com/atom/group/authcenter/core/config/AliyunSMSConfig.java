package com.atom.group.authcenter.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 11:23
 **/
@Component
@ConfigurationProperties(prefix = "sms.aliyun")
public class AliyunSMSConfig {

    private String accessKeyId;

    private String accessKeySecret;

    private String signName;
    /**
     * 短信API产品名称（短信产品名固定，无需修改）
     */
    private final String product = "Dysmsapi";

    /**
     * 短信API产品域名（接口地址固定，无需修改）
     */
    private final String domain = "dysmsapi.aliyuncs.com";

    private final String region = "cn-hangzhou";

    private final String endpointName = "cn-hangzhou";


    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public String getProduct() {
        return product;
    }

    public String getDomain() {
        return domain;
    }

    public String getRegion() {
        return region;
    }

    public String getEndpointName() {
        return endpointName;
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }
}
