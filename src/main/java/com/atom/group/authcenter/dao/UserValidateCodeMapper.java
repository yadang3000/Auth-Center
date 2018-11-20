package com.atom.group.authcenter.dao;

import com.atom.group.authcenter.entity.UserValidateCode;
import com.atom.group.authcenter.entity.UserValidateCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserValidateCodeMapper {
    long countByExample(UserValidateCodeExample example);

    int deleteByExample(UserValidateCodeExample example);

    int insert(UserValidateCode record);

    int insertSelective(UserValidateCode record);

    List<UserValidateCode> selectByExample(UserValidateCodeExample example);

    int updateByExampleSelective(@Param("record") UserValidateCode record, @Param("example") UserValidateCodeExample example);

    int updateByExample(@Param("record") UserValidateCode record, @Param("example") UserValidateCodeExample example);
}