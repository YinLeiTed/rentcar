package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.CarStoreTable;
import com.yinlei.rentcar.service.CarStoreTableService;
import com.yinlei.rentcar.tools.MyUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/CarStoreTable")
public class CarStoreTableController {
    @Autowired
    private CarStoreTableService service;

    @RequestMapping(value = "/getlocations/{address}",method = RequestMethod.GET)
    public Map getLocations(@PathVariable("address") String address){
        return service.getLocations(address);
    }


}
