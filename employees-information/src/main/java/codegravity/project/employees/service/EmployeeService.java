package codegravity.project.employees.service;

import codegravity.project.employees.dto.EmployeeDto;
import codegravity.project.employees.entity.EmployeeInfo;

public interface EmployeeService {

EmployeeDto createEmployee(EmployeeDto employeeDto);

EmployeeDto getEmployeeById(Long id);


    EmployeeInfo updateEmployee(Long id, EmployeeInfo updatedEmployee);

    void deleteEmployee(Long id);
}
