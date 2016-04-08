package com.mhc.dubbo.facade.service.impl;

import com.mhc.dubbo.facade.service.DemoService;

/**
 * Created by MENGHUCHENG012 on 2016/4/8.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public void print(String name) {
        System.out.println("This is menghucheng!");
        System.out.println("Hello:"+name);
    }
}
