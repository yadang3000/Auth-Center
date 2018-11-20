package com.atom.group.authcenter.core.code.persistence;

import com.atom.group.authcenter.core.code.CodeEntity;

/**
 * @program: auth-center
 * @description: 验证码持久化
 * @author: Maxxx.Yg
 * @create: 2018-09-29 11:24
 **/
public interface CodePersistence {

    void save(CodeEntity codeEntity);

    Boolean match(CodeEntity codeEntity);

    String policy();

}
