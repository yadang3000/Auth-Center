package com.atom.group.authcenter.core.code.enums;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-29 11:25
 **/
public enum CodeType {

    Register(1,"注册验证码","SMS_146804593"),

    Login(2,"登录验证码","SMS_146804593"),

    ForgetPassword(3,"忘记密码验证码","SMS_146804593");

    private int codeType;

    private String codeDescription;

    private String templateCode;

    CodeType(int codeType, String codeDescription, String templateCode) {
        this.codeType = codeType;
        this.codeDescription = codeDescription;
        this.templateCode = templateCode;
    }

    public int getCodeType() {
        return codeType;
    }

    public void setCodeType(int codeType) {
        this.codeType = codeType;
    }

    public String getCodeDescription() {
        return codeDescription;
    }

    public void setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }
}
