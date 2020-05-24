package com.app.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.model.EmployerPrfl;
import com.app.model.JobPosting;


@Repository
public interface JobPostingRepository extends JpaRepository<JobPosting, Long>{

//	@Query("SELECT scl FROM School scl  WHERE scl.schoolName=(:companyname)")
//    List<EmployerPrfl> getJobsByEmployer(@Param("companyname") String companyname);
//	
//	@Query("SELECT scl FROM School scl  WHERE scl.schoolName=(:companyname)")
//    List<JobPosting> getJobsDetails(@Param("jobid") int jobid);

}
