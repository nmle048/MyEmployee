package com.nmle048.MyEmployee.service;

import com.nmle048.MyEmployee.entity.EmployeeEntity;
import com.nmle048.MyEmployee.model.EmployeeModel;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmployeeService {

    ResponseEntity<?> createEmployee(@RequestBody EmployeeEntity employee);
    ResponseEntity<CollectionModel<EmployeeModel>> getAllEmployees();
    ResponseEntity<EmployeeModel> getEmployeeById(@PathVariable int id);
}
