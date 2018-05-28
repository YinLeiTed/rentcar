package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.OtherServiceTable;
import com.yinlei.rentcar.service.OtherServiceTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/OtherServiceTable")
public class OtherServiceController {
    @Autowired
    private OtherServiceTableService service;


    @RequestMapping(value = "/getOtherService",method = RequestMethod.GET)
    public List<OtherServiceTable> getAll(){
        //Sout.print("advise",advise);
        return (List<OtherServiceTable>) service.getAll();
    }

}
