package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.UserTable;
import com.yinlei.rentcar.service.UserTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/UserTable")
public class UserTableController {
    @Autowired
    private UserTableService service;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Map register(UserTable user){
        System.out.println("\n\n"+user);
        Map<String, Object> map=new HashMap<>();
        if(service.existUser(user)>0)
        {
            if(service.existPhone(user.getPhoneUser())>0)
                map.put("msg","手机号已注册");
            else
                map.put("msg","身份证已注册");
        }
        else{
            service.insert(user);
        }
        return map;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Map login(UserTable user){
        Map<String, Object> map=new HashMap<>();
        if(service.existUser(user)<=0)
        {
            map.put("msg","用户不存在");
        }
        else{
            UserTable u=service.login(user);
            if(user.getPasswordUser().equals(u.getPasswordUser()))
                map.put("user",service.login(user));
            else
                map.put("msg","密码错误");
        }
        return map;
    }


}
