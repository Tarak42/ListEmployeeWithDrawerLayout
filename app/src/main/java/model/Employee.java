package model;

public abstract class Employee {
    private String employeeId;
    private String employeeName;
    private String employeeJob;

    public Employee(String employeeId, String employeeName, String employeeJob) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeJob = employeeJob;
    }

    public abstract String getEmployeeId();

}
