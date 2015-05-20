package com.lgq.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.lgq.entity.EmployeeEntity;
import com.lgq.service.EmployeeManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class EditEmployeeAction extends ActionSupport implements Preparable	
{
	private static final long serialVersionUID = 1L;
	
	//Logger configured using log4j
	private static final Logger logger = Logger.getLogger(EditEmployeeAction.class);
	private List<EmployeeEntity> employees;
	private EmployeeEntity employee;
	private EmployeeManager employeeManager;

	public String listEmployees() {
		logger.info("listEmployees method called");
		employees = employeeManager.getAllEmployees();
		return SUCCESS;
	}

	public String addEmployee() {
		logger.info("addEmployee method called");
		employeeManager.addEmployee(employee);
		return SUCCESS;
	}

	public String deleteEmployee() {
		logger.info("deleteEmployee method called");
		employeeManager.deleteEmployee(employee.getId());
		return SUCCESS;
	}
	
	//This method will be called before any of Action method is invoked;
	//So some pre-processing if required.
	@Override
	public void prepare() throws Exception {
		employee = null;
	}

	public void setEmployeeManager(EmployeeManager employeeManager) {
		this.employeeManager = employeeManager;
	}

	public List<EmployeeEntity> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeEntity> employees) {
		this.employees = employees;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}
}
