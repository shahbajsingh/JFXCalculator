package calculator;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class CalculatorController
{

    double firstOperand = 0;
    double secondOperand = 0;
    int operator = 0;
    double result = 0;

    @FXML
    private AnchorPane root;

    @FXML
    private JFXButton btnZero, btnOne, btnTwo, btnThree, btnFour,
            btnFive, btnSix, btnSeven, btnEight, btnNine, btnMult,
            btnDiv, btnPlus, btnMinus, btnClear, btnSign, btnEqual,
            btnPower, btnDot;

    @FXML
    private JFXTextArea txtResult;

    @FXML
    void handleNum(ActionEvent event)
    {
        if (event.getSource().equals(btnZero)) {
            txtResult.appendText("0");
        } else if (event.getSource().equals(btnOne)) {
            txtResult.appendText("1");
        } else if (event.getSource().equals(btnTwo)) {
            txtResult.appendText("2");
        } else if (event.getSource().equals(btnThree)) {
            txtResult.appendText("3");
        } else if (event.getSource().equals(btnFour)) {
            txtResult.appendText("4");
        } else if (event.getSource().equals(btnFive)) {
            txtResult.appendText("5");
        } else if (event.getSource().equals(btnSix)) {
            txtResult.appendText("6");
        } else if (event.getSource().equals(btnSeven)) {
            txtResult.appendText("7");
        } else if (event.getSource().equals(btnEight)) {
            txtResult.appendText("8");
        } else if (event.getSource().equals(btnNine)) {
            txtResult.appendText("9");
        } else if (event.getSource().equals(btnDot)) {
            txtResult.appendText(".");
        }
    }


    @FXML
    void handleOp(ActionEvent event)
    {
        if (event.getSource().equals(btnPlus)) {
            firstOperand = Double.parseDouble(txtResult.getText());
            operator = 1;
            txtResult.setText("");
        } else if (event.getSource().equals(btnMinus)) {
            firstOperand = Double.parseDouble(txtResult.getText());
            operator = 2;
            txtResult.setText("");
        } else if (event.getSource().equals(btnMult)) {
            firstOperand = Double.parseDouble(txtResult.getText());
            operator = 3;
            txtResult.setText("");
        } else if (event.getSource().equals(btnDiv)) {
            firstOperand = Double.parseDouble(txtResult.getText());
            operator = 4;
            txtResult.setText("");
        }

    }

    @FXML
    void handleSign(ActionEvent event)
    {
        if (event.getSource().equals(btnSign))
        {
            firstOperand = Double.parseDouble(txtResult.getText());
            firstOperand = -(firstOperand);
            txtResult.setText(Double.toString(firstOperand));
        }
    }

    @FXML
    void handleClear(ActionEvent event)
    {
        if (event.getSource().equals(btnClear))
        {
            txtResult.setText("");
            firstOperand = 0;
        }
    }

    @FXML
    void handleEqual(ActionEvent event)
    {
        secondOperand = Double.parseDouble(txtResult.getText());
        switch(operator)
        {
            case 1: // +
                result = firstOperand + secondOperand;
                txtResult.setText(Double.toString(result));
                break;
            case 2: // -
                result = firstOperand - secondOperand;
                txtResult.setText(Double.toString(result));
                break;
            case 3: // *
                result = firstOperand * secondOperand;
                txtResult.setText(Double.toString(result));
                break;
            case 4: // /
                result = (firstOperand / secondOperand);
                txtResult.setText(Double.toString(result));
                break;
        }
    }


    @FXML
    void handlePower(ActionEvent event)
    {
        if (event.getSource().equals(btnPower))
        {
            System.exit(0);
        }
    }

    @FXML
    void handleKeys(KeyEvent event)
    {
        // TO-DO: add multiply keycode shift + 8
        if(event.getCode().equals(KeyCode.ENTER)) {
            btnEqual.fire();
        } else if(event.getCode().equals(KeyCode.ESCAPE)) {
            btnPower.fire();
        } else if(event.getCode().equals(KeyCode.DIGIT0)) {
            btnZero.fire();
        } else if(event.getCode().equals(KeyCode.DIGIT1)) {
            btnOne.fire();
        } else if(event.getCode().equals(KeyCode.DIGIT2)) {
            btnTwo.fire();
        } else if(event.getCode().equals(KeyCode.DIGIT3)) {
            btnThree.fire();
        } else if(event.getCode().equals(KeyCode.DIGIT4)) {
            btnFour.fire();
        } else if(event.getCode().equals(KeyCode.DIGIT5)) {
            btnFive.fire();
        } else if(event.getCode().equals(KeyCode.DIGIT6)) {
            btnSix.fire();
        } else if(event.getCode().equals(KeyCode.DIGIT7)) {
            btnSeven.fire();
        } else if(event.getCode().equals(KeyCode.DIGIT8)) {
            btnEight.fire();
        } else if(event.getCode().equals(KeyCode.DIGIT9)) {
            btnNine.fire();
        } else if(event.getCode().equals(KeyCode.PERIOD)
                || event.getCode().equals(KeyCode.DECIMAL)) {
            btnDot.fire();
        } else if(event.getCode().equals(KeyCode.EQUALS)
                || event.getCode().equals(KeyCode.PLUS)) {
            btnPlus.fire();
        } else if(event.getCode().equals(KeyCode.UNDERSCORE)
                || event.getCode().equals(KeyCode.MINUS)) {
            btnMinus.fire();
        } else if(event.getCode().equals(KeyCode.SLASH)
                || event.getCode().equals(KeyCode.DIVIDE)) {
            btnDiv.fire();
        } else if(event.getCode().equals(KeyCode.BACK_SPACE)) {
            btnClear.fire();
        }

    }




}
