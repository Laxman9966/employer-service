package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.JobPosting;
import com.app.repository.JobPostingRepository;

@RestController
@RequestMapping("jobposting")
public class JobPostingController {
	
	@Autowired
	JobPostingRepository repository;

	
	@RequestMapping(value = "/getalljobs", method = RequestMethod.GET)
	public List<JobPosting> getalljobs() {
		return repository.findAll();
	}
	
	@RequestMapping(value = "/getjobs/{companyname}", method = RequestMethod.GET)
	public List<JobPosting> getjobs(@PathVariable("companyname") String companyname) {
		return repository.findAll();
	}
	
	@RequestMapping(value = "/getjobdetails/{id}", method = RequestMethod.GET)
	public JobPosting getjobdetails(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@RequestMapping(value = "/createJobPosting", method = RequestMethod.POST)
	public JobPosting createJobPosting(@RequestBody JobPosting jobPost) {
		System.out.println("***************   "+ jobPost);
		return repository.save(jobPost);
	}

	@RequestMapping( value = "/updateJobPosting/{id}" , method=RequestMethod.PUT)
	public JobPosting updateJobPosting(@PathVariable Long id, @RequestBody JobPosting jobPost) {
		JobPosting job = repository.findById(id).get();
		if(job !=null) {
			//job.setJobtitle(jobPost.getJobtitle());
			job.setKeyskills(jobPost.getKeyskills());
			return repository.save(job);
		}
		return null;
	}

	@DeleteMapping("/deleteJobPosting/{id}")
	public void deleteSchool(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
	
	
	
}
