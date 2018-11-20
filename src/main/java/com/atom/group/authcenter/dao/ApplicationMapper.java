package com.atom.group.authcenter.dao;

import com.atom.group.authcenter.entity.Application;
import com.atom.group.authcenter.entity.ApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationMapper {
    long countByExample(ApplicationExample example);

    int deleteByExample(ApplicationExample example);

    int insert(Application record);

    int insertSelective(Application record);

    List<Application> selectByExample(ApplicationExample example);

    int updateByExampleSelective(@Param("record") Application record, @Param("example") ApplicationExample example);

    int updateByExample(@Param("record") Application record, @Param("example") ApplicationExample example);
}