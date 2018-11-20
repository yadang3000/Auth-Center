package com.atom.group.authcenter.core.code;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.atom.group.authcenter.core.code.CodeEntity;
import com.atom.group.authcenter.core.code.persistence.CodePersistence;
import com.atom.group.authcenter.core.config.AliyunSMSConfig;
import com.atom.group.authcenter.core.context.CodePersistenceHolder;
import com.atom.group.authcenter.core.utils.SMSUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 10:56
 **/
@Service
@Slf4j
public class CodeSendService implements InitializingBean {

    @Autowired
    private AliyunSMSConfig aliyunSMSConfig;

    private IClientProfile aliyunClientProfile;

    public Boolean sendCode(CodeEntity codeEntity){

        IAcsClient acsClient = new DefaultAcsClient(aliyunClientProfile);

        //组装请求对象
        SendSmsRequest request = new SendSmsRequest();

        //使用post提交
        request.setMethod(MethodType.POST);

        //必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式；发送国际/港澳台消息时，接收号码格式为00+国际区号+号码，如“0085200000000”
        request.setPhoneNumbers(SMSUtil.convertMobileNumber(codeEntity.getId()));

        //必填:短信签名-可在短信控制台中找到
        request.setSignName(aliyunSMSConfig.getSignName());

        //必填:短信模板-可在短信控制台中找到，发送国际/港澳台消息时，请使用国际/港澳台短信模版
        request.setTemplateCode(codeEntity.getCodeType().getTemplateCode());

        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为

        // todo 这里需优化
        //友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
        request.setTemplateParam("{\"code\":\""+ codeEntity.getCode() +"\"}");

        //可选-上行短信扩展码(扩展码字段控制在7位或以下，无特殊需求用户请忽略此字段)

        //request.setSmsUpExtendCode("90997");

        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者

        //request.setOutId("yourOutId");

        //请求失败这里会抛ClientException异常

        SendSmsResponse sendSmsResponse = null;
        try {
            sendSmsResponse = acsClient.getAcsResponse(request);
        } catch (ClientException e) {
            log.error("阿里云短息发送异常",e);
        }

        if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")){

            CodePersistence codePersistence = CodePersistenceHolder.getCodePersistence();
            codePersistence.save(codeEntity);

            return true;
        }else{
            return false;
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        //设置超时时间-可自行调整
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化ascClient,暂时不支持多region（请勿修改）
        aliyunClientProfile = DefaultProfile.getProfile(
                aliyunSMSConfig.getRegion(),
                aliyunSMSConfig.getAccessKeyId(),
                aliyunSMSConfig.getAccessKeySecret()
        );

        DefaultProfile.addEndpoint(
                aliyunSMSConfig.getEndpointName(),
                aliyunSMSConfig.getRegion(),
                aliyunSMSConfig.getProduct(),
                aliyunSMSConfig.getDomain()
        );

    }
}
