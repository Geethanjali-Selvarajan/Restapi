package com.example.day4_2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day4_2.model.Job;
import com.example.day4_2.repository.JobRepo;


@Service
public class JobService {
    
    @Autowired
    JobRepo jobRepo;
    public Job addjob(Job j)
    {
        return jobRepo.save(j);
    }
    public List<Job> getjob()
    {
        return jobRepo.findAll();
    }
    public Optional<Job> getjobById(int id)
    {
        return jobRepo.findById(id);
    }
}
