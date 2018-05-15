package com.yinlei.rentcar.tools;

import java.util.List;

public class MyImage {
    public static String createImageName(List<String> list){
        String name="";
        String address="../myimages/";
        for (int i=0;i<list.size();i++)
        {
            if(i==list.size()-1)
                name+=address+list.get(i)+" ";
            else
                name+=address+list.get(i)+" ";
        }
        return name;
    }
}
