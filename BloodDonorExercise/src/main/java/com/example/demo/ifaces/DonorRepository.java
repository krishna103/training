package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BloodDonor;

@Repository
public interface DonorRepository extends JpaRepository<BloodDonor, Integer> {

	List<BloodDonor> findByBloodGroup(String bloodGroup);
	
	// @Query for custom query
	//List<BloodDonar> findAllByBloodGroup(String bloodGroup)
}
