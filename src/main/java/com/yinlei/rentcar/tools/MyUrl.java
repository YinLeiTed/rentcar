package com.yinlei.rentcar.tools;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MyUrl {
    //访问第三方地址，将json数据以字符串方式返回
    public static String getUrlContent(String address){
        String result="";
        try {
            URL url = new URL(address);
            //打开连接，获取返回信息。
            URLConnection context = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    context.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
