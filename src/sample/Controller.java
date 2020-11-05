package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private TextField principalTextField;
    @FXML
    private TextField interestTextField;
    @FXML
    private TextField numberOfYearsTextField;

    public void onCalculate(ActionEvent actionEvent) {

        double principal = Double.parseDouble(principalTextField.getText());
        double interest = Double.parseDouble(interestTextField.getText());
        int years = (int) Double.parseDouble(numberOfYearsTextField.getText());

        interest /= 100.0;
        double monthlyRate = interest / 12.00;
        int termInMonths = years * 12;
        double monthlyAmount =
                (principal * monthlyRate) /
                        (1 - Math.pow(1 + monthlyRate, -termInMonths));
        
         System.out.println(monthlyAmount);

    }
}

