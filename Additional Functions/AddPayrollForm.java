import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AddPayrollForm extends Stage {

    public AddPayrollForm() {
        setTitle("Add Payroll");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        // Input fields
        TextField idField = new TextField();
        TextField basicSalaryField = new TextField();
        TextField allowancesField = new TextField();
        TextField deductionsField = new TextField();

        // Add labels and fields to the grid
        grid.addRow(0, new Label("Employee ID:"), idField);
        grid.addRow(1, new Label("Basic Salary:"), basicSalaryField);
        grid.addRow(2, new Label("Allowances:"), allowancesField);
        grid.addRow(3, new Label("Deductions:"), deductionsField);

        // Save button
        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> {
            String employeeId = idField.getText();
            double basicSalary = Double.parseDouble(basicSalaryField.getText());
            double allowances = Double.parseDouble(allowancesField.getText());
            double deductions = Double.parseDouble(deductionsField.getText());

            // Save to database (you can add database logic here)
            System.out.println("Payroll Added: " + employeeId + ", " + basicSalary + ", " + allowances + ", " + deductions);
        });

        grid.add(saveButton, 1, 4);

        // Set the scene
        setScene(new Scene(grid, 300, 200));
    }
}