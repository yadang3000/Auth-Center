package com.atom.group.authcenter.core.utils;

import com.google.gson.Gson;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-15 17:50
 **/
public class GsonUtils {

    private static final GsonUtils GSON_UTILS = new GsonUtils();

    private static final Gson GSON = new Gson();

    public static GsonUtils getInstance() {
        return GSON_UTILS;
    }

    public String toJson(final Object object) {
        return GSON.toJson(object);
    }

    public <T> T fromJson(final String json, final Class<T> tClass) {
        try{
            return GSON.fromJson(json, tClass);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}