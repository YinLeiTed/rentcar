package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.UserTable;
import com.yinlei.rentcar.service.UserTableService;
import com.yinlei.rentcar.tools.EmailUtils;
import com.yinlei.rentcar.tools.PhoneUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
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
    @RequestMapping(value = "/identity",method = RequestMethod.GET)
    public Map identity(String idcardUser){
        //0代表注册，其他为修改
        Map<String, Object> map=new HashMap<>();

        if(service.existIdcard(idcardUser)==1)
            map.put("msg","身份证已注册。");

        return map;
    }
    @RequestMapping(value = "/email/{length}",method = RequestMethod.GET)
    public Map email(@PathVariable("length")Integer length,String emailUser){
        //0代表注册，其他为修改
        Map<String, Object> map=new HashMap<>();
        if(length==0)
        {
            if(service.existEmail(emailUser)==1)
                map.put("msg","邮箱已注册。");
            else{
                String code=EmailUtils.sendEmail(emailUser);
                map.put("code",code);
            }
        }else{
            if(service.existEmail(emailUser)==0)
                map.put("msg","邮箱不存在，请先注册。");
            else{
                String code=EmailUtils.sendEmail(emailUser);
                map.put("code",code);
            }
        }
        return map;
    }
    @RequestMapping(value = "/phone/{length}",method = RequestMethod.GET)
    public Map phone(@PathVariable("length")Integer length,String phoneUser){
        //Sout.print("phone",emailUser);
        //如果length为0，代表注册请求
        Map<String, Object> map=new HashMap<>();
        if(length==0)
        {
            if(service.existPhone(phoneUser)==1)
                map.put("msg","手机号已注册。");
            else
                map.put("code",PhoneUtils.sendPhoneCode(phoneUser,6));
        }
        else{
            if(service.existPhone(phoneUser)==0)
                map.put("msg","手机号不存在，请先注册。");
            else
                map.put("code",PhoneUtils.sendPhoneCode(phoneUser,6));
        }
        return map;
    }

    @RequestMapping(value = "/resetPassword",method = RequestMethod.PUT)
    public void resetPassword(@RequestParam Map<String, Object> map){
        //Sout.print("map",map);
        UserTable u=new UserTable();
        u.setPhoneUser((String)map.get("phone"));
        u.setEmailUser((String)map.get("email"));
        u=service.login(u);
        //Sout.print("user",u);
        u.setPasswordUser((String)map.get("mypassword1"));
        service.update(u);
        //Sout.print("user",u);
    }
    @RequestMapping(value = "/alterUser",method = RequestMethod.PUT)
    public void alterUser(UserTable u){
        //Sout.print("u",u);
        service.update(u);
    }

    @RequestMapping(value = "/getAllTableColumnName",method = RequestMethod.GET)
    public List<String> findAllTableColumnName(String tableName){
        return service.findAllTableColumnName(tableName,"rent_car");
    }

    @RequestMapping(value = "/getAllTableName",method = RequestMethod.GET)
    public List<String> findAllTableName(){
        return service.findAllTableName("rent_car");
    }
}
