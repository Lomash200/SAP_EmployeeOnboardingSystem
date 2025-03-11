import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AddEmployeeForm extends Stage {

    public AddEmployeeForm() {
        setTitle("Add Employee");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        // Input fields
        TextField idField = new TextField();
        TextField nameField = new TextField();
        TextField addressField = new TextField();
        TextField departmentField = new TextField();
        TextField positionField = new TextField();

        // Add labels and fields to the grid
        grid.addRow(0, new Label("Employee ID:"), idField);
        grid.addRow(1, new Label("Name:"), nameField);
        grid.addRow(2, new Label("Address:"), addressField);
        grid.addRow(3, new Label("Department:"), departmentField);
        grid.addRow(4, new Label("Position:"), positionField);

        // Save button
        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> {
            String employeeId = idField.getText();
            String name = nameField.getText();
            String address = addressField.getText();
            String department = departmentField.getText();
            String position = positionField.getText();

            // Save to database (you can add database logic here)
            System.out.println("Employee Added: " + employeeId + ", " + name + ", " + address + ", " + department + ", " + position);
        });

        grid.add(saveButton, 1, 5);

        // Set the scene
        setScene(new Scene(grid, 300, 200));
    }
}