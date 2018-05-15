package com.yinlei.rentcar.tools;

import com.yinlei.rentcar.bean.LocationTable;

import java.util.ArrayList;
import java.util.List;

public class MyLocation {
    //获取16位uuid
    public static List<Object> alterLocations(Iterable<LocationTable> list){
        List<Object> mylists=new ArrayList<>();

        for (LocationTable l:list) {
            List<Double> mylist=new ArrayList<>();
            mylist.add(l.getLongitudeLocation());
            mylist.add(l.getLatitudeLocation());
            mylists.add(mylist);
        }
        return mylists;
    }
}
