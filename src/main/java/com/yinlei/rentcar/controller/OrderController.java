package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.OrderTable;
import com.yinlei.rentcar.bean.OrderToolsTable;
import com.yinlei.rentcar.bean.UserTable;
import com.yinlei.rentcar.service.CarTableService;
import com.yinlei.rentcar.service.OrderTableService;
import com.yinlei.rentcar.service.OrderToolsTableService;
import com.yinlei.rentcar.service.UserTableService;
import com.yinlei.rentcar.tools.MyUUID;
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
@RequestMapping("/OrderTable")
public class OrderController {
    @Autowired
    private OrderTableService service;

    @Autowired
    private CarTableService carService;

    @Autowired
    private UserTableService userService;

    @Autowired
    private OrderToolsTableService tools;

    @RequestMapping(value = "/saveOrder",method = RequestMethod.POST)
    public Map saveOrder(OrderTable order){
        Map<String,Object> map=new HashMap<>();
        String my=MyUUID.getUUID();
        order.setOrderIdOrder(my);
        service.insert(order);
        carService.updateState(1,order.getIdCarOrder());

        //更新用户总金额
        UserTable user=userService.getById(order.getIdUserOrder());
        user.setAmountUser(user.getAmountUser()+order.getPriceOrder());
        userService.update(user);

        //Sout.print("order",order);
        map.put("uuid",my);
        return map;
    }
    @RequestMapping(value = "/deleteOrder/{id}",method = RequestMethod.DELETE)
    public Map deleteOrder(@PathVariable("id")Integer id){
        Map<String,Object> map=new HashMap<>();
        OrderTable order = service.getById(id);
        order.setStateOrder("已删除");
        service.update(order);
        map.put("msg","订单已删除");
        return map;
    }

    @RequestMapping(value = "/deleteOrder2/{id}",method = RequestMethod.DELETE)
    public void deleteOrder2(@PathVariable("id")Integer id){
        //Sout.print("u",u);
        service.delete(id);
    }

    @RequestMapping(value = "/getOrders",method = RequestMethod.GET)
    public Map getOrders(Integer page,Integer limit){
        Map<String, Object> map=new HashMap<>();
        map.put("code","0");
        Page<OrderTable> list = service.getByPage(page,limit);
        map.put("data",list.getContent());
        map.put("count",list.getTotalElements());
        return map;
    }

    @RequestMapping(value = "/queryOrders/{orderid}",method = RequestMethod.GET)
    public Map queryUsers(@PathVariable("orderid")String orderid){
        Map<String, Object> map=new HashMap<>();
        map.put("code","0");
        List<OrderTable> list = service.findAllByOrderIdOrder(orderid);
        map.put("data",list);
        map.put("count",list.size());
        return map;
    }

    @RequestMapping(value = "/updateOrder",method = RequestMethod.PUT)
    public void updateUser(OrderTable u){
        service.update(u);
    }


    @RequestMapping(value = "/getUserOrder/{userid}",method = RequestMethod.GET)
    public Map getUserOrder(@PathVariable("userid") Integer userid,Integer page,Integer limit){
        Map<String,Object> map=new HashMap<>();
        Page<OrderToolsTable> list = tools.findAllByIdUserOrderOrderByIdOrderDesc(userid,page-1,limit);
        map.put("data",list.getContent());
        map.put("counts",list.getTotalElements());
        return map;
    }
}
