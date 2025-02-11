package com.tns.ifet.collegemodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.ifet.collegemodule.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
}
