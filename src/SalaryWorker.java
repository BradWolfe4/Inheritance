public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        System.out.printf("%s earns an annual salary of $%.2f, so weekly pay is: $%.2f%n",
                getFullName(), annualSalary, calculateWeeklyPay(hoursWorked));
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + annualSalary;
    }

    @Override
    public String toJSON() {
        return super.toJSON().replace("}", ", \"annualSalary\": " + annualSalary + "}");
    }

    @Override
    public String toXML() {
        return super.toXML().replace("</Person>", "<AnnualSalary>" + annualSalary + "</AnnualSalary></Person>");
    }
}