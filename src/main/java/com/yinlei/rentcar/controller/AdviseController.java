package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.AdviseTable;
import com.yinlei.rentcar.service.AdviseTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/AdviseTable")
public class AdviseController {
    @Autowired
    private AdviseTableService service;


    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public void register(AdviseTable advise){
        //Sout.print("advise",advise);
        service.insert(advise);
    }

}
