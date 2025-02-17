import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    @Test
    void testCalculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Jane", "Doe", "456", "Dr.", 1980, 25.0, 52000);

        assertEquals(1000.0, salaryWorker.calculateWeeklyPay(40)); // 52000 / 52
        assertEquals(1000.0, salaryWorker.calculateWeeklyPay(50)); // Should not change
    }
}