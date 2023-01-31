

public class Worker extends Person {
    /*double hourlyPayRate
Methods:
double calculateWeeklyPay(double hoursWorked)
String displayWeeklyPay(double hoursWorked)
The constructor for Worker should use super() to call the constructor for Person and then go on to set the rest of the fields.
calculateWeeklyPay should return the pay total. Hours under 40 are at the HourlyRate, hours above 40 are at time and a half (1.5)
displayWeeklyPay should indicate the number of hours of regular pay (40) and the total and the number of hours of overtime pay and the total as well as the total combined pay.
*/
    private double hourlyPayRate;

    public Worker(String firstname, String lastname, String title, String ID, int YOB, double hourlyPayRate) {
        super(firstname, lastname, title, ID, YOB);
        this.hourlyPayRate = hourlyPayRate;

    }

    public Worker(Person p, double hourlyPayRate, double hoursWorked) {
        super(p.getFirstname(), p.getLastname(), p.getTitle(), p.getID(), p.getYOB());
        this.hourlyPayRate = hourlyPayRate;

    }

    public String calculateWeeklyPay(double hoursWorked) {
        Double normalPay;
        Double overtimePay;
        Double payTotal = 0.0;
        Double overtimeHours;
        String Pay = "";
        if (hoursWorked <= 40){
            normalPay = hourlyPayRate * hoursWorked;
            payTotal = normalPay;
        } else {
            overtimeHours = hoursWorked - 40;
            overtimePay = overtimeHours * hourlyPayRate*1.5;
            payTotal = hourlyPayRate * 40 + overtimePay;

        }
        Pay = "" + payTotal;
        return Pay;
    }


    public String displayWeeklyPay(double hoursWorked) {
        Double normalPay = 0.0;
        Double normalHours = 0.0;
        Double overtimePay = 0.0;
        Double payTotal = 0.0;
        Double overtimeHours = 0.0;
        String Display = "";
        if (hoursWorked <= 40){
            normalPay = hourlyPayRate * hoursWorked;
            overtimeHours = 0.0;
            normalHours = hoursWorked - overtimeHours;
        } else {
            overtimeHours = hoursWorked - 40;
            normalHours = hoursWorked - overtimeHours;
            normalPay = normalHours * hourlyPayRate;
            overtimePay = overtimeHours * hourlyPayRate*1.5;
            payTotal = hourlyPayRate * 40 + overtimePay;
        }
        Display = "Normal Pay: " + normalPay + "  Normal Hours: " + normalHours + "  Overtime Pay: " + overtimePay + "  Overtime Hours: " + overtimeHours + "  Total Pay: " + payTotal;
        return Display;
    }

}
