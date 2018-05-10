package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.User;
import com.yinlei.rentcar.bean.UserTable;
import com.yinlei.rentcar.service.UserService;
import com.yinlei.rentcar.tools.MyUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/uuid")
    public String getUUID(){
        return MyUUID.getUUID(32);
    }

    @RequestMapping("/register")
    public String register(UserTable user){
        System.out.println("\n\nuser:"+user+"\n\n");
        return user.toString();
    }

    @RequestMapping(value="/get/{id}", method=RequestMethod.GET)
    public User get(@PathVariable("id") Integer id){
        System.out.println(id);
        System.out.println(service.getCount());
        User u=new User(18,"tedd");
        service.insert(u);
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
