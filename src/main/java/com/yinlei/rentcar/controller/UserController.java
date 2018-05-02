package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.User_table_yinlei;
import com.yinlei.rentcar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        return "/index";
    }

    @RequestMapping(value="/get/{id}", method=RequestMethod.GET)
    public User_table_yinlei get(@PathVariable("id") Integer id){
       /* System.out.println(id);
        System.out.println(service.getCount());
        User_table_yinlei u=new User_table_yinlei("ted");
        service.insert(u);
        System.out.println("id:"+service.getById(1));
        System.out.println("name:"+service.getByName("te"));
        System.out.println("names:"+service.getAllByName("te"));
        Page<User_table_yinlei> byPage = service.getByPage(1, 3);
        System.out.println("page:"+byPage.getTotalPages()+" "+byPage.getTotalElements());
        System.out.println(byPage.getContent());*/
        System.out.println("1111");
        return service.getById(id);
    }
}
