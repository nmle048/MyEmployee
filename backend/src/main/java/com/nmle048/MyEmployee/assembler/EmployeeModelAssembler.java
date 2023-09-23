package com.nmle048.MyEmployee.assembler;

import com.nmle048.MyEmployee.controller.EmployeeController;
import com.nmle048.MyEmployee.entity.DepartmentEntity;
import com.nmle048.MyEmployee.entity.EmployeeEntity;
import com.nmle048.MyEmployee.entity.PositionEntity;
import com.nmle048.MyEmployee.model.DepartmentModel;
import com.nmle048.MyEmployee.model.EmployeeModel;
import com.nmle048.MyEmployee.model.PositionModel;
import jakarta.annotation.Nonnull;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class EmployeeModelAssembler extends RepresentationModelAssemblerSupport<EmployeeEntity, EmployeeModel> {
    public EmployeeModelAssembler() {
        super(EmployeeController.class, EmployeeModel.class);
    }

    @Override
    @Nonnull
    public EmployeeModel toModel(@Nonnull EmployeeEntity entity) {

        EmployeeModel employeeModel = instantiateModel(entity);

        employeeModel.add(linkTo(
                methodOn(EmployeeController.class)
                        .getEmployeeById(entity.getId())
        )
                .withSelfRel());

        employeeModel.setId(entity.getId());
        employeeModel.setFullName(entity.getFullName());
        employeeModel.setMale(entity.isMale());
        employeeModel.setDob(entity.getDob());
        employeeModel.setNativePlace(entity.getNativePlace());
        employeeModel.setPermanentPlace(entity.getPermanentPlace());
        employeeModel.setIssueDate(entity.getIssueDate());
        employeeModel.setIssuePlace(entity.getIssuePlace());
        employeeModel.setStartDate(entity.getStartDate());
        employeeModel.setDepartmentModel(toDepartmentModel(entity.getDepartmentEntity()));
        employeeModel.setPositionModel(toPositionModel(entity.getPositionEntity()));
        
        return employeeModel;
    }

    @Override
    @Nonnull
    public CollectionModel<EmployeeModel> toCollectionModel(@Nonnull Iterable<? extends EmployeeEntity> entities) {
        CollectionModel<EmployeeModel> employeeModels = super.toCollectionModel(entities);

        employeeModels.add(linkTo(methodOn(EmployeeController.class).getAllEmployees()).withSelfRel());

        return employeeModels;
    }

    private DepartmentModel toDepartmentModel(DepartmentEntity departmentEntity) {
        DepartmentModel departmentModel = new DepartmentModel();

        departmentModel.setId(departmentEntity.getId());
        departmentModel.setName(departmentEntity.getName());

        return departmentModel;
    }

    private PositionModel toPositionModel(PositionEntity positionEntity) {
        PositionModel positionModel = new PositionModel();

        positionModel.setId(positionEntity.getId());
        positionModel.setName(positionEntity.getName());

        return positionModel;
    }
}
