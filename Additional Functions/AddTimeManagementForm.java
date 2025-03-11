import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AddTimeManagementForm extends Stage {

    public AddTimeManagementForm() {
        setTitle("Add Time Management");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        // Input fields
        TextField idField = new TextField();
        TextField workScheduleField = new TextField();
        TextField attendanceField = new TextField();

        // Add labels and fields to the grid
        grid.addRow(0, new Label("Employee ID:"), idField);
        grid.addRow(1, new Label("Work Schedule:"), workScheduleField);
        grid.addRow(2, new Label("Attendance (days):"), attendanceField);

        // Save button
        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> {
            String employeeId = idField.getText();
            String workSchedule = workScheduleField.getText();
            int attendance = Integer.parseInt(attendanceField.getText());

            // Save to database (you can add database logic here)
            System.out.println("Time Management Added: " + employeeId + ", " + workSchedule + ", " + attendance);
        });

        grid.add(saveButton, 1, 3);

        // Set the scene
        setScene(new Scene(grid, 300, 150));
    }
}