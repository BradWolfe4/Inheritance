public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularHours = hoursWorked - overtimeHours;
        return (regularHours * hourlyPayRate) + (overtimeHours * hourlyPayRate * 1.5);
    }

    public void displayWeeklyPay(double hoursWorked) {
        double regularPay = 40 * hourlyPayRate;
        double overtimePay = (Math.max(0, hoursWorked - 40)) * hourlyPayRate * 1.5;
        double totalPay = calculateWeeklyPay(hoursWorked);

        System.out.printf("%s worked %.2f hours. Regular Pay: $%.2f, Overtime Pay: $%.2f, Total Pay: $%.2f%n",
                getFullName(), hoursWorked, regularPay, overtimePay, totalPay);
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + hourlyPayRate;
    }

    @Override
    public String toJSON() {
        return super.toJSON().replace("}", ", \"hourlyPayRate\": " + hourlyPayRate + "}");
    }

    @Override
    public String toXML() {
        return super.toXML().replace("</Person>", "<HourlyPayRate>" + hourlyPayRate + "</HourlyPayRate></Person>");
    }
}