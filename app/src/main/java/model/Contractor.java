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
        return employeeId;
    }



    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public float getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(float hourSalary) {
        this.hourSalary = hourSalary;
    }

    public float getNumberHoursPerWeek() {
        return numberHoursPerWeek;
    }

    public void setNumberHoursPerWeek(float numberHoursPerWeek) {
        this.numberHoursPerWeek = numberHoursPerWeek;
    }
}
