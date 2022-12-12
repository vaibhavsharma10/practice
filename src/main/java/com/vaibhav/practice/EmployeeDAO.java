package com.vaibhav.practice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public List<Employee> getAllEmpList(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(6660, "Vaibhav", "Gurukul Kangri", 100 ));
        empList.add(new Employee(6661, "Akshya", "Gurukul Kangri", 101 ));
        empList.add(new Employee(6662, "Manuj", "Gurukul Kangri", 102 ));
        empList.add(new Employee(6663, "Lokesh", "Gurukul Kangri", 103 ));
        empList.add(new Employee(6664, "Jhon", "IITK", 100 ));
        empList.add(new Employee(6650, "Kepller", "IITK", 101 ));
        empList.add(new Employee(6666, "Raghu", "IITK", 102 ));
        empList.add(new Employee(6667, "Ranjan", "IITK", 103 ));
        return empList;

    }
}
