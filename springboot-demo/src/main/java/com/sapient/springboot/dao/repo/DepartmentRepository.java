package com.sapient.springboot.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.springboot.jpa.JpaDepartment;

public interface DepartmentRepository extends JpaRepository<JpaDepartment, Long> {

}
