package codegravity.project.employees.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeDto {

    private long employeeId;

    private String first_Name;

    private String last_Name;

    private String dateOfBirth;

    private int last4Ssn;


}
