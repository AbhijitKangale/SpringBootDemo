package com.sapient.springboot.dao.repo;

import java.util.List;

import com.sapient.springboot.jpa.JpaDepartment;

public interface DepartmentDao {

	public JpaDepartment makePersistent(JpaDepartment jpaDepartment);

	public JpaDepartment getById(String id);

	public JpaDepartment updateDepartmentById(JpaDepartment jpaDepartment);

	public void deleteDepartment(JpaDepartment jpaDepartment);

	public List<JpaDepartment> findAllDepartments();
}
