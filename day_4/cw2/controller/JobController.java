package com.example.day4_2.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4_2.model.Job;
import com.example.day4_2.service.JobService;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @PostMapping("/jobpost")
        public Job addjob(@RequestBody Job j)
        {
            return jobService.addjob(j);
        }
    @GetMapping("/jobget")
    public List<Job> findjob()
    {
        return jobService.getjob();
    }
    @GetMapping("/job/{jobId}")
        public Optional<Job> getJobById(@PathVariable int jobId)
        {
            return jobService.getjobById(jobId);
        }
}
