package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CabDriver;
@Repository
public interface ICabDriver extends JpaRepository<CabDriver, Integer> {

	
}
