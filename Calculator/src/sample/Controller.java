package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField tfValue;
    private char action = '?';
    private double first_operand;

    private void showBadInputMessage() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Внимание");
        alert.setHeaderText("Неверный ввод");
        alert.setContentText("Необходимо ввести некое число. Буквы недопустимы.");
        alert.showAndWait();
    }

    private void saveFirstOperand() {
        try {
            first_operand = Double.parseDouble(tfValue.getText());
            tfValue.setText("");
            tfValue.requestFocus();
        } catch (NumberFormatException ex) {
            showBadInputMessage();
        }
    }

    public void onBtnAddClick(MouseEvent mouseEvent) {
        saveFirstOperand();
        action = '+';
    }

    public void onBtnSubClick(MouseEvent mouseEvent) {
        saveFirstOperand();
        action = '-';
    }

    public void onBtnMulClick(MouseEvent mouseEvent) {
        saveFirstOperand();
        action = '*';
    }

    public void onBtnDivClick(MouseEvent mouseEvent) {
        saveFirstOperand();
        action = '/';
    }

    public void onBtnAnswerClick(MouseEvent mouseEvent) {
        double second_operand;
        String operand_as_string = tfValue.getText();
        if (operand_as_string.equals("")) {
            second_operand = first_operand;
        } else {
            try {
                second_operand = Double.parseDouble(tfValue.getText());
            } catch (NumberFormatException ex) {
                showBadInputMessage();
                return;
            }
        }
        double answer;
        switch (action) {
            case '+':
                answer = first_operand + second_operand;
                break;
            case '-':
                answer = first_operand - second_operand;
                break;
            case '*':
                answer = first_operand * second_operand;
                break;
            case '/':
                answer = first_operand / second_operand;
                break;
            default:
                return;
        }
        first_operand = answer;
        tfValue.setText(String.valueOf(answer));
        tfValue.requestFocus();
    }
}
