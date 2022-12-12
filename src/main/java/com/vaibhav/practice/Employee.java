package com.vaibhav.practice;

public class Employee {
    private Integer employeeId;
    private String employeeName;
    private String collegeName;
    private Integer departmentId;

    public Employee(Integer employeeId, String employeeName, String collegeName, Integer departmentId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.collegeName = collegeName;
        this.departmentId = departmentId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}
