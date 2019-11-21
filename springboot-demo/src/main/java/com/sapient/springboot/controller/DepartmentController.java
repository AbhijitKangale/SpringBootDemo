package com.sapient.springboot.controller;

import java.util.List;

import com.sapient.springboot.model.Department;

public interface DepartmentController {

	public Department create(Department department);

	public Department retrieve(String id);

	public Department update(String id, Department department);

	public Department delete(String id);

	public List<Department> retrieveAll();
}
