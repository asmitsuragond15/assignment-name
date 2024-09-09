package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.revature.model.Employee;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/emp")
public class RestController {

    static List<Employee> empList;
    
    static {
        empList = new ArrayList<>();
        Employee e1 = new Employee(1, "Shraddha");
        empList.add(e1);
        empList.add(new Employee(2, "Asmit"));  
    }
	
	@GetMapping("/employees")
	public List getAllEMployees()
	{
		return empList;
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id")int id)
	{
		Employee emp=empList.get(id-1);
		return emp;
	}
	@DeleteMapping("employee/{id}")
	public void deleteEmployeeId(@PathVariable("id")int id)
	{
	empList.remove(id-1);
	}
//	@PutMapping("employee/{id}")
//	public void updateEmployeeId(@PathVariable("id")int id)
//	{
//		Employee existingEmployee = empList.get(id - 1);
//        // Update employee details
//        existingEmployee.setName(updatedEmployee.getName());
//        // Add any other fields to update, like age, role, etc.
//
//        return "Employee updated successfully!";
//    } else {
//        return "Invalid employee ID!";
//    }
	
}
