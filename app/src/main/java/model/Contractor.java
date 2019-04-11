package model;

public class Contractor extends Employee {

    private String startDate;
    private String endDate;
    private float hourSalary;
    private float numberHoursPerWeek;


    public Contractor(String employeeId, String employeeName, String employeeJob, String startDate, String endDate, float hourSalary, float numberHoursPerWeek) {
        super(employeeId, employeeName, employeeJob);
        this.startDate = startDate;
        this.endDate = endDate;
        this.hourSalary = hourSalary;
        this.numberHoursPerWeek = numberHoursPerWeek;
    }

    @Override
    public String getEmployeeId() {
        return null;
    }
}
