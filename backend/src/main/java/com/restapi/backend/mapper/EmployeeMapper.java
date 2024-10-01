package com.restapi.backend.mapper;

import com.restapi.backend.dto.EmployeeDto;
import com.restapi.backend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
               employee.getId(),
                employee.getFirstname(),
                employee.getLastName(),
                employee.getEmail()
        );
    }


    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
