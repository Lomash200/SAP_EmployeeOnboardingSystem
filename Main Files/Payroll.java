public class Payroll {
    private String employeeId;
    private double basicSalary;
    private double allowances;
    private double deductions;

    // Constructor
    public Payroll(String employeeId, double basicSalary, double allowances, double deductions) {
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        this.deductions = deductions;
    }

    // Calculate net salary
    public double calculateNetSalary() {
        return basicSalary + allowances - deductions;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Basic Salary: " + basicSalary +
               ", Allowances: " + allowances + ", Deductions: " + deductions +
               ", Net Salary: " + calculateNetSalary();
    }
}