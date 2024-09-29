package com.ust.JobNotificationApplication.controller;

import com.ust.JobNotificationApplication.model.Jobinfo;
import com.ust.JobNotificationApplication.service.JobNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ust")

public class JobNotificationController {

    @Autowired
    private JobNotificationService service;

    @PostMapping("/addjobdetails")
    public Jobinfo addjobdetails(@RequestBody Jobinfo info){
        return service.addjobdetails(info);
    }

    @GetMapping("/getjobinfo")
    public List<Jobinfo> getjobinfo(){
        return service.getjobinfo();
    }

    @GetMapping("/getjobinfo/{id}")
    public Jobinfo getjobinfobyid(@PathVariable int id){
        return service.getjobinfobyid(id);
    }
}
