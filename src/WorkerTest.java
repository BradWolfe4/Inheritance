import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @Test
    void testCalculateWeeklyPay() {
        Worker worker = new Worker("John", "Doe", "123", "Mr.", 1985, 20.0);

        assertEquals(800.0, worker.calculateWeeklyPay(40));  // 40 * 20
        assertEquals(1100.0, worker.calculateWeeklyPay(50)); // 40 * 20 + 10 * 30
    }
}