package week5.hotel;

import java.time.LocalDateTime;

public class Employee {

    private String name;
    private String employeeID;
    private String department;
    private double payRate;
    private int hoursWorked;
    private double startTime;

    public Employee(String name, String employeeID, String department, double payRate, int hoursWorked) {
        this.name = name;
        this.employeeID = employeeID;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getRegularHours() {
        return hoursWorked <= 40 ? hoursWorked : 40;
    }

    public int getOvertimeHours() {
        return hoursWorked > 40 ? hoursWorked - 40 : 0;
    }

    public double getTotalPay(){
       return getPayRate() * getRegularHours() + getPayRate() * 1.5 * getOvertimeHours();
    }

    public void punchIn(double time){
        startTime = time;
    }

    public void punchout(double time){
        hoursWorked += time - startTime;
    }

    public void punchIn(){
        int hours = LocalDateTime.now().getHour();
        double minutes = LocalDateTime.now().getMinute() / 60.0;
        startTime = hours + minutes;
    }

    public void punchout(){
        int hours = LocalDateTime.now().getHour();
        double minutes = LocalDateTime.now().getMinute() / 60.0;
        double endTime = hours + minutes;
        hoursWorked += endTime- startTime;
    }

    @Override
    public String toString(){
        return "====Employee Information====\n" +
                "Employee Name: " + name + "\n" +
                "Employee ID: " + employeeID + "\n" +
                "Department: " + department + "\n" +
                "Pay Rate: $" + String.format("%.2f" , payRate) + "/hr\n" +
                "Hours Worked: " + hoursWorked + "\n" +
                "Total Pay: $" + String.format("%.2f", getTotalPay()) + "\n";
    }
}
