package com.vaibhav.practice;

import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
    private EmployeeDAO empDao = new EmployeeDAO();
    private DepartmentDAO deptDao = new DepartmentDAO();

    public static void main(String args[]){
        MainClass obj = new MainClass();
        obj.testUnderstanding();
    }

    private void testUnderstanding(){
        List<Employee> empList = empDao.getAllEmpList();
        List<Department> deptList = deptDao.getAllDepartments();

        List<Employee> filteredList = empList.stream()
                .filter(emp -> deptList.stream()
                        .anyMatch(dept ->
                                emp.getCollegeName().equalsIgnoreCase(dept.getCollegeName())
                        && emp.getDepartmentId().equals(dept.getDepartmentId())))
                .collect(Collectors.toList());

        filteredList.stream().forEach(s -> System.out.println(s));
    }
}
