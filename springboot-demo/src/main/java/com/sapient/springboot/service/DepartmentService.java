package com.sapient.springboot.service;

import java.util.List;

import com.sapient.springboot.model.Department;

public interface DepartmentService {

	public Department addDepartment(Department department);

	public Department getById(String id);

	public Department updateDepartmentById(String id, Department department);

	public Department deleteDepartment(String id);
	
	public List<Department> findAllDepartments ();
}
