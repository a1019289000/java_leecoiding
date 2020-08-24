package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args){
        int a = 100;
        System.out.println("aaa");
        try {
            aa();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("bbb");
    }

    public static void aa() throws Exception {
        System.out.println("cccccccc");
        if (true){
            throw new Exception("xxx");

        }
        System.out.println("dddddd");

    }
}
