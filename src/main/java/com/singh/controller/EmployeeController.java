package com.singh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singh.DAO.DAO;
import com.singh.model.Emp;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	@Autowired
	DAO dao;

	@PostMapping(value = "/save")
	public void saveEmployee(@RequestBody Emp employee) {

		dao.saveEmployee(employee);
	}

}
