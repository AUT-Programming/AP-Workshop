package org.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private Button ac;

    @FXML
    private Button b0;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button b7;

    @FXML
    private Button b8;

    @FXML
    private Button b9;

    @FXML
    private Button badd;

    @FXML
    private Button bdiv;

    @FXML
    private Button bdot;

    @FXML
    private Button beq;

    @FXML
    private Button bmul;

    @FXML
    private Button bsub;

    @FXML
    private TextField textField;

    private String operator = "";
    private double num1 = 0;
    private boolean start = true;

    @FXML
    void acClicked(MouseEvent event) {
        resetCalculator();

        textField.setText("");
    }

    @FXML
    void b0Clicked(MouseEvent event) {
        appendTextToEditor("0");
    }

    @FXML
    void b1Clicked(MouseEvent event) {
        appendTextToEditor("1");
    }

    @FXML
    void b2Clicked(MouseEvent event) {
        appendTextToEditor("2");
    }

    @FXML
    void b3Clicked(MouseEvent event) {
        appendTextToEditor("3");
    }

    @FXML
    void b4Clicked(MouseEvent event) {
        appendTextToEditor("4");
    }

    @FXML
    void b5Clicked(MouseEvent event) {
        appendTextToEditor("5");
    }

    @FXML
    void b6Clicked(MouseEvent event) {
        appendTextToEditor("6");
    }

    @FXML
    void b7Clicked(MouseEvent event) {
        appendTextToEditor("7");
    }

    @FXML
    void b8Clicked(MouseEvent event) {
        appendTextToEditor("8");
    }

    @FXML
    void b9Clicked(MouseEvent event) {
        appendTextToEditor("9");
    }

    @FXML
    void baddClicked(MouseEvent event) {
        setOperator("+");
    }

    @FXML
    void bdivClicked(MouseEvent event) {
        setOperator("/");
    }

    @FXML
    void bdotClicked(MouseEvent event) {
        appendTextToEditor(".");
    }

    @FXML
    void beqClicked(MouseEvent event) {
        calculate();
    }

    @FXML
    void bmulClicked(MouseEvent event) {
        setOperator("*");
    }

    @FXML
    void bsubClicked(MouseEvent event) {
        setOperator("-");
    }

    @FXML
    public void initialize() {
        textField.setOnKeyTyped(this::handleKeyTyped);
    }

    @FXML
    void handleKeyTyped(KeyEvent event) {
        String key = event.getCharacter();

        switch (key) {
            case "0": case "1": case "2": case "3": case "4":
            case "5": case "6": case "7": case "8": case "9":
                appendTextToEditor(key);
                break;
            case "+":
                setOperator("+");
                break;
            case "-":
                setOperator("-");
                break;
            case "*":
                setOperator("*");
                break;
            case "/":
                setOperator("/");
                break;
            case ".":
                appendTextToEditor(".");
                break;
            case "=":
                calculate();
                break;
            case "\r":  // Enter key
                calculate();
                break;
            default:
                // Ignore other keys
                break;
        }
    }

    private void appendTextToEditor(String text) {
        if (start) {
            textField.setText(text);
            start = false;
        } else {
            textField.setText(textField.getText() + text);
        }
    }

    private void setOperator(String operator) {
        if (!start && !this.operator.isEmpty()) {
            calculate();
        }
        this.operator = operator;
        num1 = Double.parseDouble(textField.getText());
        appendTextToEditor(" " + operator + " ");
    }

    private void calculate() {
        try {
            String[] parts = textField.getText().split(" ");
            if (parts.length < 3) {
                throw new IllegalArgumentException("Incomplete expression");
            }
            num1 = Double.parseDouble(parts[0]);
            operator = parts[1];
            double num2 = Double.parseDouble(parts[2]);

            double result = 0;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        throw new ArithmeticException("Division by zero");
                    }
                    break;
                default:
                    throw new UnsupportedOperationException("Unknown operator");
            }
            textField.setText(String.valueOf(result));
            resetCalculator();
        } catch (NumberFormatException e) {
            textField.setText("Error: Invalid number");
            resetCalculator();
        } catch (IllegalArgumentException | ArithmeticException | UnsupportedOperationException e) {
            textField.setText("Error: " + e.getMessage());
            resetCalculator();
        }
    }

    private void resetCalculator() {
        operator = "";
        num1 = 0;
        start = true;
    }
}
