package model;

public class FullTime extends Employee {

    private String startDate;
    private float salary;

    public FullTime(String employeeId, String employeeName, String employeeJob, String startDate, float salary) {
        super(employeeId, employeeName, employeeJob);
        this.startDate = startDate;
        this.salary = salary;
    }

    @Override
    public String getEmployeeId() {
        return null;
    }
}
