package com.atom.group.authcenter.dao;

import com.atom.group.authcenter.entity.ThirdSystem;
import com.atom.group.authcenter.entity.ThirdSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThirdSystemMapper {
    long countByExample(ThirdSystemExample example);

    int deleteByExample(ThirdSystemExample example);

    int insert(ThirdSystem record);

    int insertSelective(ThirdSystem record);

    List<ThirdSystem> selectByExample(ThirdSystemExample example);

    int updateByExampleSelective(@Param("record") ThirdSystem record, @Param("example") ThirdSystemExample example);

    int updateByExample(@Param("record") ThirdSystem record, @Param("example") ThirdSystemExample example);
}