package com.yinlei.rentcar.controller;


import com.yinlei.rentcar.bean.ShareTable;
import com.yinlei.rentcar.service.ShareTableService;
import com.yinlei.rentcar.tools.MyImage;
import com.yinlei.rentcar.tools.MyUUID;
import com.yinlei.rentcar.tools.Sout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/ShareTable")
public class ShareTableController {
    @Autowired
    private ShareTableService service;

    private static List<String> filenames=new ArrayList<>();
    @RequestMapping(value = "/addShare",method = RequestMethod.POST)
    public Map addShare(ShareTable share){
        Map<String, Object> map=new HashMap<>();
        if(share.getContentShare()==null)
        {
            map.put("msg","false");
            return map;
        }
        share.setTimeShare(new Date(new java.util.Date().getTime()));
        share.setImagesShare(MyImage.createImageName(filenames));
        filenames.clear();
        service.insert(share);
        map.put("msg","success");
        return map;
    }

    @RequestMapping(value = "/getShare{id}/{page}",method = RequestMethod.GET)
    public Map getShares(@PathVariable("id") Integer userid,@PathVariable("page")Integer page){
        Map<String, Object> map=new HashMap<>();
        if(userid==0)
        {
            map.put("all",service.getAllByPage(page,5));
        }
        else {
            map.put("user",service.getAllByPageAndUserId(page,5,userid));
        }
        return map;
    }

    @RequestMapping("/upload")
    public Map fileUpload(@RequestParam("images") MultipartFile file){
        Map<String, Object> map=new HashMap<>();
        if(file.isEmpty()){
            map.put("code",1);
        }
        String fileName = file.getOriginalFilename();
//        int size = (int) file.getSize();
//        System.out.println(fileName + "-->" + size);

        String path = "C:/Users/TED/Pictures/myimages" ;
        String fileName2=MyUUID.getUUID(32)+"."+fileName.split("\\.")[1];
        filenames.add(fileName2);

        Sout.print("file",fileName2);
        File dest = new File(path + "/" + fileName2);
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            map.put("code",0);
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
}
