package codegravity.project.employees.controller;

import codegravity.project.employees.dto.EmployeeDto;
import codegravity.project.employees.entity.EmployeeInfo;
import codegravity.project.employees.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeeInfo")

public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

//   Add EmployeeInfo REST API ( Create operation)

    @PostMapping
    public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employeeDto){
        return new ResponseEntity<>(employeeService.createEmployee(employeeDto), HttpStatus.CREATED);
    }

//    Get EmployeeInfo REST API(Reading Operation)

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto>getEmployeeById(@PathVariable Long id){
        EmployeeDto employeeDto=employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employeeDto);
    }

//    Update REST API (Upadate Operation)

    @PutMapping("/{id}/update")
    public ResponseEntity<EmployeeInfo> updateEmployee(@PathVariable Long id, @RequestBody EmployeeInfo updatedEmployee) {
        EmployeeInfo employeeInfo = employeeService.updateEmployee(id, updatedEmployee);
        return ResponseEntity.ok(employeeInfo);
    }

//    Delete REST API (Delete Operation)

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok().build();
    }
}

