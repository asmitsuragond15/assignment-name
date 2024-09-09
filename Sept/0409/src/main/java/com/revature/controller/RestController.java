package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.revature.model.Employee;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    static List<Employee> empList;
    
    static {
        empList = new ArrayList<>();
        Employee e1 = new Employee(1, "Shraddha");
        empList.add(e1);
        empList.add(new Employee(2, "Asmit"));  // Fixed the typo
    }
	
	@GetMapping("/employees")
	public List getAllEMployees()
	{
		return empList;
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(int id)
	{
		Employee emp=empList.get(id-1);
		return emp;
	}
	@DeleteMapping("employee/{id}")
	public void deleteEmployeeId(@PathVariable("id")int id)
	{
	empList.remove(id-1);
	}
	
}
