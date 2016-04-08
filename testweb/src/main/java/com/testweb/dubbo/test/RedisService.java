package com.testweb.dubbo.test;

import java.util.Set;

/**
 * Created by MENGHUCHENG012 on 2016/4/7.
 */
public interface RedisService {

    void del(byte[] key);

    void del(String key);

    void set(byte [] key,byte [] value,int liveTime);

    void set(String key,String value,int liveTime);

    void set(String key,String value);

    void set(byte [] key,byte [] value);

    String get(String key);

    byte[] get(byte [] key);

    Set<String> keys(String pattern);

    boolean exists(String key);

    String flushDB();

    long dbSize();

    String ping();

}
