package com.ust.JobNotificationApplication.repo;

import com.ust.JobNotificationApplication.model.Jobinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Jobrepo extends JpaRepository<Jobinfo,Integer> {

}
