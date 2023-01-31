import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;
class SalaryWorkerTest {
    private static final DecimalFormat dfSharp = new DecimalFormat("#.##");
    private double yearlySalary;
    SalaryWorker p1;
    @BeforeEach
    void setUp() {

        p1 = new SalaryWorker ("Tim", "Shoe", "Mr.", "0002", 2001, 0.0,  50000.0);
    }

    @Test
    void getYearlySalary() { assertEquals("50000.0", p1.getYearlySalary());
    }

    @Test
    void setYearlySalary() {
    }

    @Test
    void calculateWeeklyPay() {assertEquals("961.54", p1.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {assertEquals("the weekly pay (that is a fraction of 50000.0 is 961.5384615384615", p1.displayWeeklyPay(40));
    }
}