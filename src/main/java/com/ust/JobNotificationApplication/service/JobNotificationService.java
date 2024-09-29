package com.ust.JobNotificationApplication.service;

import com.ust.JobNotificationApplication.model.Jobinfo;
import com.ust.JobNotificationApplication.repo.Jobrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobNotificationService {

    @Autowired
    private Jobrepo repo;
    public Jobinfo addjobdetails(Jobinfo info) {
        return repo.save(info);
    }

    public List<Jobinfo> getjobinfo(){
        return repo.findAll();
    }

    public Jobinfo getjobinfobyid(int id) {
        return repo.findById(id).orElse(null);
    }
}
