package com.atom.group.authcenter.dao;

import com.atom.group.authcenter.entity.ApplicationClient;
import com.atom.group.authcenter.entity.ApplicationClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationClientMapper {
    long countByExample(ApplicationClientExample example);

    int deleteByExample(ApplicationClientExample example);

    int insert(ApplicationClient record);

    int insertSelective(ApplicationClient record);

    List<ApplicationClient> selectByExample(ApplicationClientExample example);

    int updateByExampleSelective(@Param("record") ApplicationClient record, @Param("example") ApplicationClientExample example);

    int updateByExample(@Param("record") ApplicationClient record, @Param("example") ApplicationClientExample example);
}