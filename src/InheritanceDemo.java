import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(new Worker("Alice", "Johnson", "001", "Ms.", 1990, 25.0));
        workers.add(new Worker("Bob", "Smith", "002", "Mr.", 1985, 20.0));
        workers.add(new Worker("Charlie", "Brown", "003", "Dr.", 1975, 30.0));

        workers.add(new SalaryWorker("David", "Williams", "004", "Mr.", 1982, 0, 60000));
        workers.add(new SalaryWorker("Emma", "Davis", "005", "Ms.", 1991, 0, 52000));
        workers.add(new SalaryWorker("Frank", "Miller", "006", "Prof.", 1978, 0, 70000));

        int[] workWeeks = {40, 50, 40};

        for (int week = 0; week < workWeeks.length; week++) {
            System.out.println("\nWeek " + (week + 1) + " - Hours Worked: " + workWeeks[week]);
            for (Worker w : workers) {
                w.displayWeeklyPay(workWeeks[week]);
            }
        }
    }
}
