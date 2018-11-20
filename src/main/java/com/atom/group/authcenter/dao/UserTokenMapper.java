package com.atom.group.authcenter.dao;

import com.atom.group.authcenter.entity.UserToken;
import com.atom.group.authcenter.entity.UserTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTokenMapper {
    long countByExample(UserTokenExample example);

    int deleteByExample(UserTokenExample example);

    int insert(UserToken record);

    int insertSelective(UserToken record);

    List<UserToken> selectByExample(UserTokenExample example);

    int updateByExampleSelective(@Param("record") UserToken record, @Param("example") UserTokenExample example);

    int updateByExample(@Param("record") UserToken record, @Param("example") UserTokenExample example);
}