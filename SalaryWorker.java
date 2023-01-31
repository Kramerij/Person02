import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SalaryWorker extends Worker {
    private static final DecimalFormat dfSharp = new DecimalFormat("#.##");
    /*Files: SalaryWorker.java SalaryWorkerTest.java
Fields:
double annualSalary

Methods:
The constructor for SalaryWorker should use super() to call the constructor for Worker
double calculateWeeklyPay(double hoursWorked)
Override calculateWeeklyPay and displayWeeklyPay calculateWeeklyPay returns the pay total. Note that the parameter hoursWorked is not used here but is retained for polymorphism.  Take the annualSalary and divide by 52 to get the weekly pay.
displayWeeklyPay should indicate that the weekly pay is a fraction of the yearly salary.
*/
    private double yearlySalary;

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public SalaryWorker(String firstname, String lastname, String title, String ID, int YOB, double hourlyPayRate, double yearlySalary) {
        super(firstname, lastname, title, ID, YOB, hourlyPayRate);
        this.yearlySalary = yearlySalary;
    }

   public SalaryWorker(Person p, double hourlyPayRate, double hoursWorked, double yearlySalary) {
        super(p, hourlyPayRate, hoursWorked);
        this.yearlySalary = yearlySalary;
    }



    //calculate weekly pay
    public String calculateWeeklyPay(double hoursWorked){

    double weeklyPay;
    String Pay = "";
    weeklyPay = yearlySalary/52;

    Pay = dfSharp.format(weeklyPay);
        return Pay;
}
//display weekly pay
public String displayWeeklyPay(double hoursWorked){
    double weeklyPay;
    String displayPay;
    weeklyPay = yearlySalary/52;
    displayPay = "the weekly pay (that is a fraction of " + yearlySalary + " is " + weeklyPay;
    return displayPay;

}

}
