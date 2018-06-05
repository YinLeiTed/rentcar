package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.CarTable;
import com.yinlei.rentcar.service.CarTableService;
import com.yinlei.rentcar.tools.MyUUID;
import com.yinlei.rentcar.tools.Sout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/CarTable")
public class CarController {
    @Autowired
    private CarTableService service;


    @RequestMapping(value = "/getCar/{id}",method = RequestMethod.GET)
    public List getCarByCarStore(@PathVariable("id") Integer id){
        return service.getByIdCarStore(id);
    }

    @RequestMapping(value = "/insertCar",method = RequestMethod.POST)
    public void insertCar(CarTable user){
          user.setUsingCar(0);
          service.insert(user);
    }

    @RequestMapping(value = "/deleteCar/{id}",method = RequestMethod.DELETE)
    public void deleteCar(@PathVariable("id")Integer id){
        service.delete(id);
    }

    @RequestMapping(value = "/getCars",method = RequestMethod.GET)
    public Map getCars(Integer page,Integer limit){
        Map<String, Object> map=new HashMap<>();
        map.put("code","0");
        Page<CarTable> list = service.getByPage(page,limit);
        map.put("data",list.getContent());
        map.put("count",list.getTotalElements());
        return map;
    }

    @RequestMapping(value = "/queryCars/{name}",method = RequestMethod.GET)
    public Map queryCars(@PathVariable("name")String license){
        Map<String, Object> map=new HashMap<>();
        map.put("code","0");
        List<CarTable> list = service.findAllByLicenseCar(license);
        map.put("data",list);
        map.put("count",list.size());
        return map;
    }

    @RequestMapping("/upload")
    public Map uploadCarImage(@RequestParam("images") MultipartFile file){
        Map<String, Object> map=new HashMap<>();
        if(file.isEmpty()){
            map.put("code",1);
        }
        String fileName = file.getOriginalFilename();

        String path = "C:/Users/TED/Pictures/myimages" ;
        String fileName2=MyUUID.getUUID(32)+"."+fileName.split("\\.")[1];

        Sout.print("file",fileName2);
        File dest = new File(path + "/" + fileName2);
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            map.put("code",0);
            map.put("filename","../myimages/"+fileName2);
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            map.put("code",1);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            map.put("code",1);
        }
        return map;
    }

    @RequestMapping(value = "/updateCar",method = RequestMethod.PUT)
    public void updateCar(CarTable u){
        service.update(u);
    }
}
