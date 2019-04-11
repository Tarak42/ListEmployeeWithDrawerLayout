package model;

import java.io.Serializable;

public abstract class Employee implements Serializable {
    protected String employeeId;
    private String employeeName;
    private String employeeJob;

    public Employee(String employeeId, String employeeName, String employeeJob) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeJob = employeeJob;
    }

    public abstract String getEmployeeId();

    public String getEmployeeName(){
        return employeeName;
    }

    public String getEmployeeJob(){
        return employeeJob;
    }

    @Override
    public String toString() {
        return "\t" + employeeName;

    }
}
