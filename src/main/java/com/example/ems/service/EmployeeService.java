package com.example.ems.service;

import com.example.ems.entity.Employee;
import com.example.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long Id){
        return employeeRepository.findById(Id).orElseThrow(() -> new RuntimeException("Employee not found by id:"));
    }

    public Employee updateEmployee(Long Id, Employee updatedEmployee){
        Employee existing=getEmployeeById(Id);
        existing.setDepartment(updatedEmployee.getDepartment());
        existing.setName(updatedEmployee.getName());
        existing.setSalary(updatedEmployee.getSalary());
        return employeeRepository.save(existing);

    }

    public Employee createEmplopyee(Employee employee){
        return employeeRepository.save(employee);

    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }


}
