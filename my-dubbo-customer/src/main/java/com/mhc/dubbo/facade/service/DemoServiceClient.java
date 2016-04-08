package com.mhc.dubbo.facade.service;

import com.mhc.dubbo.facade.service.impl.DemoServiceImpl;

/**
 * Created by MENGHUCHENG012 on 2016/4/8.
 */
public class DemoServiceClient {
    private  DemoService demoService;

//    替代注入
    public DemoServiceClient(){
        demoService = new DemoServiceImpl();
    }
}
