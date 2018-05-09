package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.User;
import com.yinlei.rentcar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;


    @RequestMapping(value="/get/{id}", method=RequestMethod.GET)
    public User get(@PathVariable("id") Integer id){
        System.out.println(id);
        System.out.println(service.getCount());
//        User u=new User("ted",18);
//        service.insert(u);
        System.out.println("id:"+service.getById(1));
//        System.out.println("name:"+service.getByName("ted"));
        System.out.println("names:"+service.getAllByName("ted"));
        System.out.println("namelikes:"+service.getByNameLike("ted%"));
        System.out.println("agebetween:"+service.getByAgeBetween(18,20));
        Page<User> byPage = service.getByPage(0, 3);
        System.out.println("page:"+byPage.getTotalPages()+" "+byPage.getTotalElements());
        System.out.println(byPage.getContent());
        System.out.println("1111");
        return service.getById(id);
    }
}
