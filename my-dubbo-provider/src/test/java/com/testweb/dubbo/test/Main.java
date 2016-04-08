package com.testweb.dubbo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by MENGHUCHENG012 on 2016/4/7.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationProvider.xml"});
            context.start();
            System.out.println("dubbo provider starting!");
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
