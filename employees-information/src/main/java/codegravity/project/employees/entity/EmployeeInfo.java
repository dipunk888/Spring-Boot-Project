package codegravity.project.employees.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//Create getter, setter method and constructor
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

//Assigning a table name
@Table(name="Employees Details")
@Entity
public class EmployeeInfo {

//    Now let's create a primary key for our table and make it increase automatically
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long employeeId;
    @Column(name = "Emp_First_Name")
private String first_Name;
    @Column(name = "Emp_Last_Name")
private String last_Name;
@Column(name = "Emp_Date_of_Birth")
private String dateOfBirth;
@Column(name = "Last_4_Digit_Of_SSN")
private int last4Ssn;


}
