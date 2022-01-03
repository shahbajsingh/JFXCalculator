package calculator;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class CalculatorController
{

    static double firstOperand = 0;
    static double secondOperand = 0;
    static int operator = 0;
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
        if (event.getSource().equals(btnZero))
        {
            txtResult.appendText("0");
        }
        else if (event.getSource().equals(btnOne))
        {
            txtResult.appendText("1");
        }
        else if (event.getSource().equals(btnTwo))
        {
            txtResult.appendText("2");
        }
        else if (event.getSource().equals(btnThree))
        {
            txtResult.appendText("3");
        }
        else if (event.getSource().equals(btnFour))
        {
            txtResult.appendText("4");
        }
        else if (event.getSource().equals(btnFive))
        {
            txtResult.appendText("5");
        }
        else if (event.getSource().equals(btnSix))
        {
            txtResult.appendText("6");
        }
        else if (event.getSource().equals(btnSeven))
        {
            txtResult.appendText("7");
        }
        else if (event.getSource().equals(btnEight))
        {
            txtResult.appendText("8");
        }
        else if (event.getSource().equals(btnNine))
        {
            txtResult.appendText("9");
        }
        else if (event.getSource().equals(btnDot))
        {
            txtResult.appendText(".");
        }
    }


    @FXML
    void handleOp(ActionEvent event)
    {
        if (event.getSource().equals(btnPlus))
        {
            firstOperand = Double.parseDouble(txtResult.getText());
            operator = 1;
            txtResult.setText("");
        }
        else if (event.getSource().equals(btnMinus))
        {
            firstOperand = Double.parseDouble(txtResult.getText());
            operator = 2;
            txtResult.setText("");
        }
        else if (event.getSource().equals(btnMult))
        {
            firstOperand = Double.parseDouble(txtResult.getText());
            operator = 3;
            txtResult.setText("");
        }
        else if (event.getSource().equals(btnDiv))
        {
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
                result = (firstOperand / secondOperand) + (firstOperand % secondOperand);
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

        if(event.getCode().equals(KeyCode.ENTER))
        {
            btnEqual.fire();
        }
        if(event.getCode().equals(KeyCode.ESCAPE))
        {
            btnPower.fire();
        }
    }



}
