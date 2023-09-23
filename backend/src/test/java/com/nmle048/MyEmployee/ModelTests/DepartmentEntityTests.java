package com.nmle048.MyEmployee.ModelTests;

import com.nmle048.MyEmployee.entity.DepartmentEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartmentEntityTests {

    @Test
    public void testDepartmentGetterAndSetter() {
        DepartmentEntity departmentEntity = new DepartmentEntity();

        departmentEntity.setName("HR");

        assertEquals("HR", departmentEntity.getName());
    }
}
