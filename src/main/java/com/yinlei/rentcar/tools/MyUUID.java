package com.yinlei.rentcar.tools;

import java.util.UUID;

public class MyUUID {
    //获取16位uuid
    public static String getUUID(){
        UUID uuid=UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr=str.replace("-", "");
        return uuidStr;
    }
    //获取指定位uuid
    public static String getUUID(Integer length){
        UUID uuid=UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr=str.replace("-", "");
        return uuidStr.substring(0,length);
    }
}
