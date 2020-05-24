package com.app.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.model.EmployerPrfl;



@Repository
public interface EmployerPrfllRepository extends JpaRepository<EmployerPrfl, Long>{
//
//	@Query("SELECT prfl FROM EmployerPrfl prfl  WHERE prfl.prfl=(:companyName)")
//    List<EmployerPrfl> getEmployerDetails(@Param("companyName") String companyName);


}
