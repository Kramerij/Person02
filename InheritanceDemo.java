import java.util.ArrayList;
import java.util.Iterator;

public class InheritanceDemo {
    /*1. Create 3 workers and 3 salaryWorker instances and add them to an ArrayList<Worker>.
     Pick reasonable hourly rates for the workers and reasonable salary rates for the salaryworkers.
     Of course all workers have names, ids, and YOBs.

*/

    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        double hoursWorked;
        Worker John = new Worker("john", "Smith", "Mr.", "0001", 2001, 25.00);
        SalaryWorker Tim = new SalaryWorker("Tim", "Shoe", "Mr.", "0002", 2001, 0.0,  50000);
        Worker Sue = new Worker("Sue", "Peterson", "Ms.", "0002", 2002, 23.00);
        Worker Tamy = new Worker("Tamy", "Griffin", "Ms.", "0004", 2004, 24.00);
        SalaryWorker Jeff = new SalaryWorker("Jeff", "Bezos", "Mr.", "0005", 1964, 0.0,  47000);
        SalaryWorker Connor = new SalaryWorker("Connor", "Shoe", "Mr.", "0006", 2003, 0.0,  56000);

        ArrayList<String> payList = new ArrayList<>();
        ArrayList<String> week1 = new ArrayList<>();
        ArrayList<String> week2 = new ArrayList<>();
        ArrayList<String> week3 = new ArrayList<>();
    /* 2. Week 1 is a 40 hour week.
    For week 2  assume it is crunch time and everyone worked 50 hours.
    Week 3 is back to normal with 40 hours.
    Generate a display showing the weekly pay for each of the workers for each week in a reasonable tabular format.*/

    int week = 1;
    while(week == 1) {
        week1.add(John.calculateWeeklyPay(40));
        week1.add(Tim.calculateWeeklyPay(40));
        week1.add(Sue.calculateWeeklyPay(40));
        week1.add(Tamy.calculateWeeklyPay(40));
        week1.add(Jeff.calculateWeeklyPay(40));
        week1.add(Connor.calculateWeeklyPay(40));
        week++;
    } while (week == 2) {
            week2.add(John.calculateWeeklyPay(50));
            week2.add(Tim.calculateWeeklyPay(50));
            week2.add(Sue.calculateWeeklyPay(50));
            week2.add(Tamy.calculateWeeklyPay(50));
            week2.add(Jeff.calculateWeeklyPay(50));
            week2.add(Connor.calculateWeeklyPay(50));
            week++;
        } while(week == 3){

        week3.add(John.calculateWeeklyPay(40));
        week3.add(Tim.calculateWeeklyPay(40));
        week3.add(Sue.calculateWeeklyPay(40));
        week3.add(Tamy.calculateWeeklyPay(40));
        week3.add(Jeff.calculateWeeklyPay(40));
        week3.add(Connor.calculateWeeklyPay(40));
        week++;
}
        System.out.println("Weeks   John    Tim    Sue    Tamy    Jeff   Connor");
        System.out.printf("\nWeek1 " + week1);
        System.out.printf("\n---------------","----------");
        System.out.println("\nWeek2 " + week2);
        System.out.printf("\n---------------","----------");
        System.out.println("\nWeek3 " + week3);
        System.out.printf("\n---------------","----------");
    }
}
