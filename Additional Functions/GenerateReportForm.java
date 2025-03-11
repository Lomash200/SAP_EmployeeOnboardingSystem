import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GenerateReportForm extends Stage {

    public GenerateReportForm() {
        setTitle("Generate Report");

        TextArea reportArea = new TextArea();
        reportArea.setEditable(false);

        Button generateButton = new Button("Generate Report");
        generateButton.setOnAction(e -> {
            // Fetch data from the database and display it in the TextArea
            String report = "Employee Report:\n"
                    + "1. John Doe, HR, Recruiter\n"
                    + "2. Jane Smith, IT, Developer\n";
            reportArea.setText(report);
        });

        VBox layout = new VBox(10, generateButton, reportArea);
        setScene(new Scene(layout, 400, 300));
    }
}