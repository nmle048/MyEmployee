package com.nmle048.MyEmployee.ModelTests;

import com.nmle048.MyEmployee.entity.EmployeeEntity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

public class EmployeeEntityTests {

    @Test
    public void testEmployeeGetterAndSetter() {
        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setFullName("Lê Văn A");
        employeeEntity.setMale(true);
        employeeEntity.setPersonId("123456789");
        LocalDate dob = LocalDate.of(2000,8,4);
        employeeEntity.setDob(dob);

        assertEquals("Lê Văn A", employeeEntity.getFullName());
        assertTrue(employeeEntity.isMale());
        assertEquals("123456789", employeeEntity.getPersonId());
        assertEquals(LocalDate.of(2000,8,4), employeeEntity.getDob());
    }
}
