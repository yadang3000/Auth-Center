package com.atom.group.authcenter.core.validation;

import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-29 15:17
 **/
public class VerifyChain {

    private Map<BaseValidator,Boolean> chain;

    public void put(BaseValidator validator,Boolean compare){
        if (chain ==null){
            synchronized (this){
                if(chain==null){
                    chain = new LinkedHashMap<>();
                }
            }
        }
        chain.put(validator,compare);
    }


    public Boolean executeChain(){
        if (chain == null){
            return false;
        }
        if (CollectionUtils.isEmpty(chain.keySet())){
            return false;
        }

        Iterator<BaseValidator> iterator = chain.keySet().iterator();
        while (iterator.hasNext()){
            BaseValidator validator = iterator.next();
            Boolean res = validator.check();
            if (!res.equals(chain.get(validator))){
                return false;
            }
        }
        return true;
    }
}
