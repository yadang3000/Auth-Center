package com.atom.group.authcenter.core.code.enums;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-15 17:10
 **/
public enum CodePersistencePolicy {

    LOCAL("local"),
    MYSQL("mysql"),
    REDIS("redis");

    private String policy;

    CodePersistencePolicy(String policy) {
        this.policy = policy;
    }

    public String getPolicy() {
        return policy;
    }

    public static CodePersistencePolicy acquire(final String policy) {
        Optional<CodePersistencePolicy> repositorySupportEnum =
                Arrays.stream(CodePersistencePolicy.values())
                        .filter(v -> Objects.equals(v.getPolicy(), policy))
                        .findFirst();
        return repositorySupportEnum.orElse(CodePersistencePolicy.LOCAL);
    }
}
