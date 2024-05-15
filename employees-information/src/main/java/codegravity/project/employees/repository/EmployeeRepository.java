package codegravity.project.employees.repository;

import codegravity.project.employees.entity.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeInfo,Long> {
}
