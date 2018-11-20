package com.atom.group.authcenter.core.code.persistence.impl;

import com.atom.group.authcenter.core.code.CodeEntity;
import com.atom.group.authcenter.core.code.persistence.CodePersistence;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-15 15:19
 **/
public class MySqlCodePersistence implements CodePersistence {


    @Override
    public void save(CodeEntity codeEntity) {

    }

    @Override
    public Boolean match(CodeEntity codeEntity) {
        return null;
    }

    @Override
    public String policy() {
        return null;
    }
}
