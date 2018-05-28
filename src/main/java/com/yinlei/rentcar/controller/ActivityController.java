package com.yinlei.rentcar.controller;

import com.yinlei.rentcar.bean.ActivityTable;
import com.yinlei.rentcar.service.ActivityTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/ActivityTable")
public class ActivityController {
    @Autowired
    private ActivityTableService service;


    @RequestMapping(value = "/getActivity",method = RequestMethod.GET)
    public List<ActivityTable> getAll(){
        //Sout.print("advise",advise);
        return (List<ActivityTable>) service.getAll();
    }

}
