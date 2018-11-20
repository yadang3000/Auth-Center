package com.atom.group.authcenter.dao;

import com.atom.group.authcenter.entity.ThirdUser;
import com.atom.group.authcenter.entity.ThirdUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThirdUserMapper {
    long countByExample(ThirdUserExample example);

    int deleteByExample(ThirdUserExample example);

    int insert(ThirdUser record);

    int insertSelective(ThirdUser record);

    List<ThirdUser> selectByExample(ThirdUserExample example);

    int updateByExampleSelective(@Param("record") ThirdUser record, @Param("example") ThirdUserExample example);

    int updateByExample(@Param("record") ThirdUser record, @Param("example") ThirdUserExample example);
}