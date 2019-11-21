package com.sapient.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sapient.springboot.dao.repo.DepartmentDaoImpl;
import com.sapient.springboot.jpa.JpaDepartment;
import com.sapient.springboot.model.Department;

import ma.glasnost.orika.MapperFacade;

@Service("DepartmentService")
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDaoImpl DepartmentDao;

	@Autowired
	private MapperFacade orikaModelMapper;

	public DepartmentServiceImpl() {
		super();
	}

	@Override
	public Department addDepartment(Department department) {
		JpaDepartment jpaDepartment = DepartmentDao.makePersistent(modelToEntity(department));
		return entityToModel(jpaDepartment);
	}

	@Override
	public Department getById(String id) {
		return entityToModel(DepartmentDao.getById(id));
	}

	@Override
	public Department updateDepartmentById(String id, Department department) {
		JpaDepartment jpaDepartment = DepartmentDao.updateDepartmentById(modelToEntity(department));
		return entityToModel(jpaDepartment);
	}

	@Override
	public Department deleteDepartment(String id) {
		JpaDepartment jpaDepartment = DepartmentDao.getById(id);
		DepartmentDao.deleteDepartment(jpaDepartment);
		return entityToModel(jpaDepartment);
	}

	@Override
	public List<Department> findAllDepartments() {
		List<JpaDepartment> departments = DepartmentDao.findAllDepartments();
		List<Department> depts = new ArrayList<>();
		for (JpaDepartment department : departments) {
			depts.add(entityToModel(department));
		}

		return depts;
	}

	private Department entityToModel(JpaDepartment jpaDepartment) {
		return orikaModelMapper.map(jpaDepartment, Department.class);
	}

	private JpaDepartment modelToEntity(Department department) {
		return orikaModelMapper.map(department, JpaDepartment.class);
	}
}
