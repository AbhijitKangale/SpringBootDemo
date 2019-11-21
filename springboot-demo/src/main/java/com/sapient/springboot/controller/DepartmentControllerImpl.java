package com.sapient.springboot.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.sapient.springboot.model.Department;
import com.sapient.springboot.service.DepartmentService;

@RestController
@RequestMapping("/sapient")
public class DepartmentControllerImpl implements DepartmentController {

	@Autowired
	DepartmentService departmentService;

	public DepartmentControllerImpl() {
		super();
	}

	@RequestMapping(value = "/department", method = { RequestMethod.POST })
	@ResponseStatus(HttpStatus.CREATED)
	@Override
	public Department create(@RequestBody Department department) {
		return departmentService.addDepartment(department);
	}

	@RequestMapping(value = "/department/{id}", method = { RequestMethod.GET })
	@ResponseStatus(HttpStatus.OK)
	@Override
	public Department retrieve(@PathVariable(name = "id") String id) {
		return departmentService.getById(id);
	}

	@RequestMapping(value = "/department/udate/{id}", method = { RequestMethod.PUT })
	@ResponseStatus(HttpStatus.OK)
	@Override
	public Department update(@PathVariable(name = "id") String id, @RequestBody Department department) {
		return departmentService.updateDepartmentById(id, department);
	}

	@RequestMapping(value = "/department/delete/{id}", method = { RequestMethod.DELETE })
	@ResponseStatus(HttpStatus.OK)
	@Override
	public Department delete(@PathVariable(name = "id") String id) {
		return departmentService.deleteDepartment(id);
	}

	@RequestMapping(value = "/department/findAll", method = { RequestMethod.GET })
	@ResponseStatus(HttpStatus.OK)
	@Override
	public List<Department> retrieveAll() {
		return departmentService.findAllDepartments();
	}

	@RequestMapping(value = "/user", method = { RequestMethod.GET })
	@ResponseBody
	public Principal getUser(Principal principal) {
		return principal;
	}
}
