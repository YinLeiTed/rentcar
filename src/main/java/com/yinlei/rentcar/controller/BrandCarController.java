package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.BrandCarTable;
import com.yinlei.rentcar.service.BrandCarTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/BrandCarTable")
public class BrandCarController {
    @Autowired
    private BrandCarTableService service;


    @RequestMapping(value = "/getBrandCar",method = RequestMethod.GET)
    public Map register(BrandCarTable brand){
        Map<String,Object> map=new HashMap<>();
        map.put("all",service.getAll());
        return map;
    }

}
