import java.util.ArrayList;
import java.util.List;

public class OnboardingSystem {
    public static void main(String[] args) {
        // Step 1: Create Employee Master Record
        Employee employee = new Employee("E001", "John Doe", "123 Main St", "HR", "Recruiter");
        System.out.println("Employee Created: " + employee);

        // Step 2: Set Up Payroll
        Payroll payroll = new Payroll("E001", 5000.0, 1000.0, 500.0);
        System.out.println("Payroll Details: " + payroll);

        // Step 3: Configure Time Management
        TimeManagement timeManagement = new TimeManagement("E001", "9 AM - 5 PM, Monday-Friday", 20);
        System.out.println("Time Management Details: " + timeManagement);

        // Step 4: Generate Reports
        System.out.println("\n--- Employee Report ---");
        System.out.println(employee);
        System.out.println(payroll);
        System.out.println(timeManagement);
    }
}