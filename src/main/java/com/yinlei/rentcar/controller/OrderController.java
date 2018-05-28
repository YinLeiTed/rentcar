package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.OrderTable;
import com.yinlei.rentcar.service.CarTableService;
import com.yinlei.rentcar.service.OrderTableService;
import com.yinlei.rentcar.tools.MyUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/OrderTable")
public class OrderController {
    @Autowired
    private OrderTableService service;

    @Autowired
    private CarTableService carService;

    @RequestMapping(value = "/saveOrder",method = RequestMethod.POST)
    public Map saveOrder(OrderTable order){
        Map<String,Object> map=new HashMap<>();
        String my=MyUUID.getUUID();
        order.setOrderIdOrder(my);
        service.insert(order);
        carService.updateState(1,order.getIdCarOrder());
        //Sout.print("order",order);
        map.put("uuid",my);
        return map;
    }

}
