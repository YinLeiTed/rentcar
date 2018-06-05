package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.UserTable;
import com.yinlei.rentcar.service.UserTableService;
import com.yinlei.rentcar.tools.EmailUtils;
import com.yinlei.rentcar.tools.MyUrl;
import com.yinlei.rentcar.tools.PhoneUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
        //System.out.println("\n\n"+user);
        Map<String, Object> map=new HashMap<>();
        if(service.existUser(user)>0)
        {
            if(service.existPhone(user.getPhoneUser())>0)
                map.put("msg","手机号已注册");
            else
                map.put("msg","身份证已注册");
        }
        else{
            user.setAmountUser(0);
            user.setCrimeUser(1);
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
            if(u.getCrimeUser()==1) {
                map.put("msg","用户正在审核中。请稍等。");
            }
            else if(user.getPasswordUser().equals(u.getPasswordUser()))
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
        else{
            String result=MyUrl.getUrlContent("http://api.jisuapi.com/idcard/query?appkey=e72629ac6bb44f25&idcard="+idcardUser);
            if(result=="")
                map.put("msg","身份证不存在。");
            else
                map.put("data",result);
        }
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

    @RequestMapping(value = "/insertUser",method = RequestMethod.POST)
    public Map insertUser(UserTable user){
        Map<String, Object> map=new HashMap<>();
        if(service.existUser(user)>0)
        {
            if(service.existPhone(user.getPhoneUser())>0)
                map.put("msg","手机号已注册");
            else if(service.existIdcard(user.getIdcardUser())>0)
                map.put("msg","身份证已注册");
            else
                map.put("msg","邮箱已存在");
        }
        else{
            user.setAmountUser(0);
            user.setCrimeUser(0);
            service.insert(user);
        }
        return map;
    }

    @RequestMapping(value = "/deleteUser/{id}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id")Integer id){
        //Sout.print("u",u);
        service.delete(id);
    }

    @RequestMapping(value = "/getUsers",method = RequestMethod.GET)
    public Map getUsers(Integer page,Integer limit){
        Map<String, Object> map=new HashMap<>();
        map.put("code","0");
        Page<UserTable> list = service.getByPage(page,limit);
        map.put("data",list.getContent());
        map.put("count",list.getTotalElements());
        return map;
    }

    @RequestMapping(value = "/queryUsers",method = RequestMethod.GET)
    public Map queryUsers(UserTable u){
        Map<String, Object> map=new HashMap<>();
        map.put("code","0");
        List<UserTable> list = service.getUser(u);
        map.put("data",list);
        map.put("count",list.size());
        return map;
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.PUT)
    public void updateUser(UserTable u){
        service.update(u);
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
