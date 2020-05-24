package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.exceptions.JobFoundException;
import com.app.model.EmployerPrfl;
import com.app.repository.EmployerPrfllRepository;

@RestController
@RequestMapping("employer")
public class EmplrPrflController {
	
	@Autowired
	private EmployerPrfllRepository repository;
	
	@RequestMapping(value="/getMesssage", method = RequestMethod.GET)
	public EmployerPrfl getMesssage() {
		EmployerPrfl employerPrfl = new EmployerPrfl();
		employerPrfl.setCompanyName("This text is from employer service hardcorded text");
		return employerPrfl;
	}

	@RequestMapping(value="/getEmployers" , method= RequestMethod.GET)
	public Iterable<EmployerPrfl> getEmployers() {
		return repository.findAll();
	}	

	@RequestMapping(value="/getEmployerDetails/{id}", method = RequestMethod.GET)
	public EmployerPrfl getEmployerDetails(@PathVariable("id") Long id) {
		return repository.findById(id).get();
	}
	
	@RequestMapping(value = "/addEmployer", method = RequestMethod.POST)
	public EmployerPrfl addEmployer(@RequestBody EmployerPrfl employerPrfl) {
		System.out.println("***************   "+ employerPrfl);
		return repository.save(employerPrfl);
	}

	@RequestMapping( value = "/updateEmployer/{id}" , method=RequestMethod.PUT)
	public EmployerPrfl updateEmployer(@PathVariable Long id, @RequestBody EmployerPrfl employerPrfl) {
		//Optional<EmployerPrfl> employerProfile = repository.findById(id);
		EmployerPrfl employerProfile = repository.findById(id).get();
		if(employerProfile!=null) {
			employerProfile.setCompanyName(employerPrfl.getCompanyName());
			employerProfile.setCity(employerPrfl.getCity());
			employerProfile.setEmail(employerPrfl.getEmail());
			return repository.save(employerProfile);
		}
		return null;
		
	}

	@DeleteMapping("/deleteEmployer/{id}")
	public void deleteEmployer(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
