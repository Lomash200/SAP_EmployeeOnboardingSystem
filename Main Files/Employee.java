public class Employee {
    private String employeeId;
    private String name;
    private String address;
    private String department;
    private String position;

    // Constructor
    public Employee(String employeeId, String name, String address, String department, String position) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
        this.department = department;
        this.position = position;
    }

    // Getters and Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Address: " + address +
               ", Department: " + department + ", Position: " + position;
    }
}