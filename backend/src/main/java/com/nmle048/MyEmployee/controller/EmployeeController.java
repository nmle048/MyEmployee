package com.nmle048.MyEmployee.controller;

import com.nmle048.MyEmployee.entity.EmployeeEntity;
import com.nmle048.MyEmployee.model.EmployeeModel;
import com.nmle048.MyEmployee.serviceImpl.EmployeeServiceImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Data
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping("/employees")
    public ResponseEntity<?> createEmployee(@RequestBody EmployeeEntity employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/employees")
    public ResponseEntity<CollectionModel<EmployeeModel>> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeModel> getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }
}
