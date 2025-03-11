public class TimeManagement {
    private String employeeId;
    private String workSchedule; // e.g., "9 AM - 5 PM, Monday-Friday"
    private int attendance; // e.g., number of days present

    // Constructor
    public TimeManagement(String employeeId, String workSchedule, int attendance) {
        this.employeeId = employeeId;
        this.workSchedule = workSchedule;
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Work Schedule: " + workSchedule +
               ", Attendance: " + attendance + " days";
    }
}