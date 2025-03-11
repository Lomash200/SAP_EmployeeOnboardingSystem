import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AddLeaveForm extends Stage {

    public AddLeaveForm() {
        setTitle("Add Leave");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        // Input fields
        TextField idField = new TextField();
        TextField leaveTypeField = new TextField();
        TextField leaveDaysField = new TextField();

        // Add labels and fields to the grid
        grid.addRow(0, new Label("Employee ID:"), idField);
        grid.addRow(1, new Label("Leave Type:"), leaveTypeField);
        grid.addRow(2, new Label("Leave Days:"), leaveDaysField);

        // Save button
        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> {
            String employeeId = idField.getText();
            String leaveType = leaveTypeField.getText();
            int leaveDays = Integer.parseInt(leaveDaysField.getText());

            // Save to database (you can add database logic here)
            System.out.println("Leave Added: " + employeeId + ", " + leaveType + ", " + leaveDays);
        });

        grid.add(saveButton, 1, 3);

        // Set the scene
        setScene(new Scene(grid, 300, 150));
    }
}