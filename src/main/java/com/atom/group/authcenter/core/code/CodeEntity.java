package com.atom.group.authcenter.core.code;

import com.atom.group.authcenter.core.code.enums.CodeType;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-15 16:18
 **/
public class CodeEntity implements Comparable<CodeEntity>{

    private String id;

    private String code;

    private CodeType codeType;

    private Long expires;

    private Long ttl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CodeType getCodeType() {
        return codeType;
    }

    public void setCodeType(CodeType codeType) {
        this.codeType = codeType;
    }

    public Long getExpires() {
        return expires;
    }

    public Long getTtl() {
        return ttl;
    }

    public void setTtl(Long ttl) {
        this.ttl = ttl;
        this.expires = System.currentTimeMillis()+ttl.longValue();
    }

    @Override
    public int compareTo(CodeEntity o) {
        long cur = System.currentTimeMillis();
        if (this.id.equals(o.id)
                && this.code.equals(o.code)
                && this.codeType.getCodeType()==o.codeType.getCodeType()
                && this.expires.longValue()>=cur+ttl
                ){
            return 1;
        }
        return -1;
    }
}
