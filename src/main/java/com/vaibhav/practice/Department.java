package com.vaibhav.practice;

public class Department {
    private String departmentName;
    private Integer departmentId;
    private String collegeName;

    public Department(String departmentName, Integer departmentId, String collegeName) {
        this.departmentName = departmentName;
        this.departmentId = departmentId;
        this.collegeName = collegeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", departmentId=" + departmentId +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}
