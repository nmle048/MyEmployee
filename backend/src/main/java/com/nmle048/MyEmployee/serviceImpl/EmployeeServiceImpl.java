package com.nmle048.MyEmployee.serviceImpl;

import com.nmle048.MyEmployee.assembler.EmployeeModelAssembler;
import com.nmle048.MyEmployee.entity.EmployeeEntity;
import com.nmle048.MyEmployee.model.EmployeeModel;
import com.nmle048.MyEmployee.repository.EmployeeRepository;
import com.nmle048.MyEmployee.service.EmployeeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeModelAssembler employeeModelAssembler;

    @Override
    public ResponseEntity<?> createEmployee(EmployeeEntity employee) {
        EmployeeEntity newEmployee = new EmployeeEntity();

        if (employeeRepository.existsByPersonId(employee.getPersonId())) {
            return ResponseEntity.badRequest().body("Person ID already exists");
        }

        newEmployee.setFullName(employee.getFullName());
        newEmployee.setMale(employee.isMale());
        newEmployee.setDob(employee.getDob());
        newEmployee.setNativePlace(employee.getNativePlace());
        newEmployee.setPermanentPlace(employee.getPermanentPlace());
        newEmployee.setIssueDate(employee.getIssueDate());
        newEmployee.setIssuePlace(employee.getIssuePlace());
        newEmployee.setStartDate(employee.getStartDate());
        newEmployee.setDepartmentEntity(employee.getDepartmentEntity());
        newEmployee.setPositionEntity(employee.getPositionEntity());

        employeeRepository.save(newEmployee);

        return new ResponseEntity<>(employeeModelAssembler.toModel(newEmployee), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<CollectionModel<EmployeeModel>> getAllEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        return new ResponseEntity<>(employeeModelAssembler.toCollectionModel(employeeEntities),
                HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EmployeeModel> getEmployeeById(int id) {
        return employeeRepository.findById(id)
                .map(employeeModelAssembler::toModel)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
