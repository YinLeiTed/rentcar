package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.BrandCarTable;
import com.yinlei.rentcar.service.BrandCarTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
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


    @RequestMapping(value = "/insertBrandCar",method = RequestMethod.POST)
    public void insertBrandCar(BrandCarTable user){
            service.insert(user);
    }

    @RequestMapping(value = "/deleteBrandCar/{id}",method = RequestMethod.DELETE)
    public void deleteBrandCar(@PathVariable("id")Integer id){
        service.delete(id);
    }

    @RequestMapping(value = "/getBrandCars",method = RequestMethod.GET)
    public Map getBrandCars(Integer page,Integer limit){
        Map<String, Object> map=new HashMap<>();
        map.put("code","0");
        Page<BrandCarTable> list = service.getByPage(page,limit);
        map.put("data",list.getContent());
        map.put("count",list.getTotalElements());
        return map;
    }

    @RequestMapping(value = "/updateBrandCar",method = RequestMethod.PUT)
    public void updateBrandCar(BrandCarTable u){
        service.update(u);
    }
}
