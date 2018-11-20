package com.atom.group.authcenter.dao;

import com.atom.group.authcenter.entity.ApplicationUser;
import com.atom.group.authcenter.entity.ApplicationUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationUserMapper {
    long countByExample(ApplicationUserExample example);

    int deleteByExample(ApplicationUserExample example);

    int insert(ApplicationUser record);

    int insertSelective(ApplicationUser record);

    List<ApplicationUser> selectByExample(ApplicationUserExample example);

    int updateByExampleSelective(@Param("record") ApplicationUser record, @Param("example") ApplicationUserExample example);

    int updateByExample(@Param("record") ApplicationUser record, @Param("example") ApplicationUserExample example);
}