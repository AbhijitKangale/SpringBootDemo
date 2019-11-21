package com.sapient.springboot.dao.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sapient.springboot.jpa.JpaDepartment;

@Repository("DepartmentDao")
public class DepartmentDaoImpl implements DepartmentDao {

	@Autowired
	DepartmentRepository departmentRepository;

	public DepartmentDaoImpl() {
		super();
	}

	@Override
	public JpaDepartment makePersistent(JpaDepartment jpaDepartment) {
		return departmentRepository.save(jpaDepartment);
	}

	@Override
	public JpaDepartment getById(String id) {
		return departmentRepository.getOne(Long.valueOf(id));
	}

	@Override
	public JpaDepartment updateDepartmentById(JpaDepartment jpaDepartment) {
		return departmentRepository.save(jpaDepartment);
	}

	@Override
	public void deleteDepartment(JpaDepartment jpaDepartment) {
		departmentRepository.delete(jpaDepartment);
	}

	@Override
	public List<JpaDepartment> findAllDepartments() {
		return departmentRepository.findAll();
	}
}
