package codegravity.project.employees.mapper;

import codegravity.project.employees.dto.EmployeeDto;
import codegravity.project.employees.entity.EmployeeInfo;

public class EmployeeMapper {

    public static EmployeeInfo mapToEmployeeInfo(EmployeeDto employeeDto) {

EmployeeInfo employeeInfo=new EmployeeInfo(
        employeeDto.getEmployeeId(),
        employeeDto.getFirst_Name(),
        employeeDto.getLast_Name(),
        employeeDto.getDateOfBirth(),
        employeeDto.getLast4Ssn());
        return employeeInfo;
    }

    public static EmployeeDto mapToEmployeeDto(EmployeeInfo employeeInfo){
        EmployeeDto employeeDto=new EmployeeDto(
                employeeInfo.getEmployeeId(),
                employeeInfo.getFirst_Name(),
                employeeInfo.getLast_Name(),
                employeeInfo.getDateOfBirth(),
                employeeInfo.getLast4Ssn()
        );
        return employeeDto;
    }


}
