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


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
