import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    private double hourlyPayRate;
Worker p1;
    @BeforeEach
    void setUp() {
        p1 = new Worker("john", "Smith", "Mr.", "0001", 2001, 25.00);

    }

    @Test
    void calculateWeeklyPay() {assertEquals("1000.0", p1.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {assertEquals("Normal Pay: 1000.0  Normal Hours: 40.0  Overtime Pay: 0.0  Overtime Hours: 0.0  Total Pay: 0.0", p1.displayWeeklyPay(40));
    }
}