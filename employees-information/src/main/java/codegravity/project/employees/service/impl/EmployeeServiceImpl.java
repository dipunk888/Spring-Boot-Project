package codegravity.project.employees.service.impl;

import codegravity.project.employees.dto.EmployeeDto;
import codegravity.project.employees.entity.EmployeeInfo;
import codegravity.project.employees.mapper.EmployeeMapper;
import codegravity.project.employees.repository.EmployeeRepository;
import codegravity.project.employees.service.EmployeeService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        EmployeeInfo employeeInfo= EmployeeMapper.mapToEmployeeInfo(employeeDto);
        EmployeeInfo savedEmployeeInfo = employeeRepository.save(employeeInfo);
        return EmployeeMapper.mapToEmployeeDto(savedEmployeeInfo);
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        EmployeeInfo employeeInfo =employeeRepository.findById(id).orElseThrow(() ->new RuntimeException("Employee does not exist"));
        return EmployeeMapper.mapToEmployeeDto(employeeInfo);
    }


    public EmployeeInfo updateEmployee(Long id, EmployeeInfo updatedEmployee) {
        EmployeeInfo employeeInfo = employeeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employee not found with id: " + id));

        // Update employee fields
        employeeInfo.setLast_Name(updatedEmployee.getLast_Name());

        employeeInfo.setLast4Ssn(updatedEmployee.getLast4Ssn());

        // Set other fields as needed

        return employeeRepository.save(employeeInfo);
    }


    public void deleteEmployee(Long id) {
        EmployeeInfo employeeInfo = employeeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employee not found with id: " + id));

        // Delete employee fields
        employeeRepository.deleteById(id);


    }
}



