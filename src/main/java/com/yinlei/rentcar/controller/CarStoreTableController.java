package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.CarStoreTable;
import com.yinlei.rentcar.bean.LocationTable;
import com.yinlei.rentcar.service.CarStoreTableService;
import com.yinlei.rentcar.service.LocationTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/CarStoreTable")
public class CarStoreTableController {
    @Autowired
    private CarStoreTableService service;

    @Autowired
    private LocationTableService locationTableService;

    @RequestMapping(value = "/getlocations/{address}",method = RequestMethod.GET)
    public Map getLocations(@PathVariable("address") String address){
        return service.getLocations(address);
    }

    @RequestMapping(value = "/getCarStore/{id}",method = RequestMethod.GET)
    public Map getLocations(@PathVariable("id") Integer id){
        return service.getCarStores(service.getById(id).getAddressCarStore());
    }

    @RequestMapping(value = "/getCarStoreTable/{address}",method = RequestMethod.GET)
    public Map getCarStore(@PathVariable("address") String address){
        return service.getCarStores(address);
    }


    @RequestMapping(value = "/insertCarStore",method = RequestMethod.POST)
    public void insertCarStore(CarStoreTable user){
            service.insert(user);
    }

    @RequestMapping(value = "/deleteCarStore/{id}",method = RequestMethod.DELETE)
    public void deleteCarStore(@PathVariable("id")Integer id){
        service.delete(id);
    }

    @RequestMapping(value = "/getCarStores2",method = RequestMethod.GET)
    public Map getCarStores(Integer page,Integer limit){
        Map<String, Object> map=new HashMap<>();
        map.put("code","0");
        Page<CarStoreTable> list = service.getByPage2(page,limit);
        map.put("data",list.getContent());
        map.put("count",list.getTotalElements());
        return map;
    }

    @RequestMapping(value = "/queryCarStores/{address}",method = RequestMethod.GET)
    public Map queryCarStores(@PathVariable("address") String address){
        Map<String, Object> map=new HashMap<>();
        map.put("code","0");
        List<CarStoreTable> list = service.getCarStores2(address);
        map.put("data",list);
        map.put("count",list.size());
        return map;
    }

    @RequestMapping(value = "/updateCarStore",method = RequestMethod.PUT)
    public void updateCarStore(CarStoreTable u){
        service.update(u);
    }

    @RequestMapping(value = "/insertCarStoreLocation",method = RequestMethod.POST)
    public Integer updateCarStore(LocationTable l){
        Page<LocationTable> byPage = locationTableService.getByPage(1, 2);
        l.setIdLocation((int)byPage.getTotalElements()+1);
        locationTableService.insert(l);
        return (int)byPage.getTotalElements()+1;
    }
}
