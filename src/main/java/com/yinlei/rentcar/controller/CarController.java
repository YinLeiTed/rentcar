package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.service.CarTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/CarTable")
public class CarController {
    @Autowired
    private CarTableService service;


    @RequestMapping(value = "/getCar/{id}",method = RequestMethod.GET)
    public List getCarByCarStore(@PathVariable("id") Integer id){
        return service.getByIdCarStore(id);
    }

}
