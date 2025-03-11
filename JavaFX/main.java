import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OnboardingSystemApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Employee Onboarding System");

        // Buttons for different functionalities
        Button addEmployeeButton = new Button("Add Employee");
        Button addPayrollButton = new Button("Add Payroll");
        Button addTimeManagementButton = new Button("Add Time Management");
        Button addLeaveButton = new Button("Add Leave");
        Button generateReportButton = new Button("Generate Report");

        // Set actions for buttons
        addEmployeeButton.setOnAction(e -> new AddEmployeeForm().show());
        addPayrollButton.setOnAction(e -> new AddPayrollForm().show());
        addTimeManagementButton.setOnAction(e -> new AddTimeManagementForm().show());
        addLeaveButton.setOnAction(e -> new AddLeaveForm().show());
        generateReportButton.setOnAction(e -> new GenerateReportForm().show());

        // Layout
        VBox layout = new VBox(10, addEmployeeButton, addPayrollButton, addTimeManagementButton, addLeaveButton, generateReportButton);
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}