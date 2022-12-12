package com.vaibhav.practice;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {

    public List<Department> getAllDepartments(){
        List<Department> depList = new ArrayList<>();
        depList.add(new Department("Computer Science", 100, "Gurukul Kangri"));
        depList.add(new Department("Electrical", 101, "Gurukul Kangri"));
        depList.add(new Department("Electronics", 102, "Gurukul Kangri"));
        depList.add(new Department("Civil", 103, "Gurukul Kangri"));
        depList.add(new Department("Electrical", 100, "IITK"));
        depList.add(new Department("Electronics", 101, "IITK"));
        depList.add(new Department("Civil", 102, "IITK"));
       // depList.add(new Department("Computer Science", 103, "IITK"));
        return depList;
    }


}
