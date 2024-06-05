package com.sharathinfotech.Employee_info.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    public int id;
    public String employeeId;
    public String image;
    public String name;
    public String department;
    public String designation;
    public String email;
    public String phone;
    public String address;
    public String salary;

}
