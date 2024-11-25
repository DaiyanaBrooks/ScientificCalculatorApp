/*
Name: Daiyana Brooks
Date: May 1st, 2024
Description: Java application for a scientific calculator implementing GUI functionalities.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.lang.Math;

public class Calculating extends JFrame implements ActionListener {
    private ArrayList <Double> userNumbers = new ArrayList<Double>();
    private ArrayList<Integer> userOperations = new ArrayList<Integer>();

    private JButton clear, seven, eight, nine, mult, div, square, four, five, six, add, sub, cube, one, two, three, equ,
            mod, zero, dec, plusMinus, inv, percent, sqrt, sin, cos, tan, log, ln, asin, acos, atan, sci, abs, sinh,
            cosh, tanh, exit;
    private JTextField answer, calculation;


    Calculating()
    {
        //establishing the frame
        this.setLayout(null);
        this.setTitle("CI- Calculator");
        this.setVisible(true);
        this.setSize(500,800);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(255, 182, 193));

        //Creating buttons
        clear = new JButton("C");
        clear.setBounds(385, 180, 65, 45);
        this.add(clear);
        clear.addActionListener(this);

        seven = new JButton("7");
        seven.setBounds(10, 240, 65, 45);
        this.add(seven);
        seven.addActionListener(this);

        eight = new JButton("8");
        eight.setBounds(85, 240, 65, 45);
        this.add(eight);
        eight.addActionListener(this);

        nine = new JButton("9");
        nine.setBounds(160, 240, 65, 45);
        this.add(nine);
        nine.addActionListener(this);

        mult = new JButton("×");
        mult.setBounds(235, 240, 65, 45);
        this.add(mult);
        mult.addActionListener(this);

        div = new JButton("÷");
        div.setBounds(310, 240, 65, 45);
        this.add(div);
        div.addActionListener(this);

        square = new JButton("x" + "\u00B2");
        square.setBounds(385,240,65,45);
        this.add(square);
        square.addActionListener(this);


        four = new JButton("4");
        four.setBounds(10, 300, 65, 45);
        this.add(four);
        four.addActionListener(this);

        five = new JButton("5");
        five.setBounds(85, 300, 65, 45);
        this.add(five);
        five.addActionListener(this);

        six = new JButton("6");
        six.setBounds(160, 300, 65, 45);
        this.add(six);
        six.addActionListener(this);

        add = new JButton("+");
        add.setBounds(235, 300, 65, 45);
        this.add(add);
        add.addActionListener(this);

        sub = new JButton("-");
        sub.setBounds(310, 300, 65, 45);
        this.add(sub);
        sub.addActionListener(this);

        cube = new JButton("x" + "\u00B3");
        cube.setBounds(385,300,65,45);
        this.add(cube);
        cube.addActionListener(this);

        one = new JButton("1");
        one.setBounds(10, 360, 65, 45);
        this.add(one);
        one.addActionListener(this);

        two = new JButton("2");
        two.setBounds(85, 360, 65, 45);
        this.add(two);
        two.addActionListener(this);

        three = new JButton("3");
        three.setBounds(160, 360, 65, 45);
        this.add(three);
        three.addActionListener(this);

        equ = new JButton("=");
        equ.setBounds(235, 360, 140, 45);
        this.add(equ);
        equ.addActionListener(this);

        mod = new JButton("mod");
        mod.setBounds(385,360,65,45);
        this.add(mod);
        mod.addActionListener(this);


        zero = new JButton("0");
        zero.setBounds(10, 420, 65, 45);
        this.add(zero);
        zero.addActionListener(this);

        dec = new JButton(".");
        dec.setBounds(85, 420, 65, 45);
        this.add(dec);
        dec.addActionListener(this);

        plusMinus = new JButton("\u00B1");
        plusMinus.setBounds(160, 420, 65, 45);
        this.add(plusMinus);
        plusMinus.addActionListener(this);

        inv = new JButton("1/n");
        inv.setBounds(235, 420, 65, 45);
        this.add(inv);
        inv.addActionListener(this);

        percent = new JButton("%");
        percent.setBounds(310, 420, 65, 45);
        this.add(percent);
        percent.addActionListener(this);

        sqrt = new JButton("\u221A");
        sqrt.setBounds(385,420,65,45);
        this.add(sqrt);
        sqrt.addActionListener(this);


        sin = new JButton("sin");
        sin.setBounds(10, 520, 85, 35);
        this.add(sin);
        sin.addActionListener(this);

        cos = new JButton("cos");
        cos.setBounds(99, 520, 85, 35);
        this.add(cos);
        cos.addActionListener(this);

        tan = new JButton("tan");
        tan.setBounds(188, 520, 85, 35);
        this.add(tan);
        tan.addActionListener(this);

        log = new JButton("log");
        log.setBounds(277, 520, 85, 35);
        this.add(log);
        log.addActionListener(this);

        ln = new JButton("ln");
        ln.setBounds(365, 520, 85, 35);
        this.add(ln);
        ln.addActionListener(this);


        asin = new JButton("asin");
        asin.setBounds(10, 560, 85, 35);
        this.add(asin);
        asin.addActionListener(this);

        acos = new JButton("acos");
        acos.setBounds(99, 560, 85, 35);
        this.add(acos);
        acos.addActionListener(this);

        atan = new JButton("atan");
        atan.setBounds(188, 560, 85, 35);
        this.add(atan);
        atan.addActionListener(this);

        sci = new JButton("10" + "\u207F");
        sci.setBounds(277, 560, 85, 35);
        this.add(sci);
        sci.addActionListener(this);

        abs = new JButton("abs");
        abs.setBounds(365, 560, 85, 35);
        this.add(abs);
        abs.addActionListener(this);


        sinh = new JButton("sinh");
        sinh.setBounds(10, 600, 85, 35);
        this.add(sinh);
        sinh.addActionListener(this);

        cosh = new JButton("cosh");
        cosh.setBounds(99, 600, 85, 35);
        this.add(cosh);
        cosh.addActionListener(this);

        tanh = new JButton("tanh");
        tanh.setBounds(188, 600, 85, 35);
        this.add(tanh);
        tanh.addActionListener(this);

        exit = new JButton("EXIT");
        exit.setBounds(277, 600, 175, 35);
        this.add(exit);
        exit.addActionListener(this);

        //creating textfields that aren't editable and have various fonts and sizes.
        answer = new JTextField("0");
        answer.setBounds(0, 0, 450, 50);
        answer.setEditable(false);
        Font aFont = new Font("Arial", Font.PLAIN, 15);
        answer.setFont(aFont);
        this.add(answer);

        calculation = new JTextField("");
        calculation.setBounds(0, 50, 450, 90);
        calculation.setEditable(false);
        Font cFont = new Font("Arial", Font.PLAIN, 25);
        calculation.setFont(cFont);
        calculation.setHorizontalAlignment(JTextField.RIGHT);
        this.add(calculation);

    } //frame end

    @Override
    public void actionPerformed(ActionEvent e){
        int count;
        count = 0; //depicts when the first number is done so the second number can be entered.

        //Function to clear the calculator.
        if (e.getSource() == clear){
            answer.setText("");
            calculation.setText("");
            count = 0;
        }

        //making buttons display text and hold values as their clicked.
        if (e.getSource() == zero){
            if (count == 0) {
                calculation.setText(calculation.getText() + "0");
            }
            if (count == 1) {
                calculation.setText(calculation.getText() +"0");
            }
        }
        if (e.getSource() == one){
            if (count == 0) {
                calculation.setText(calculation.getText() + "1");
            }
            if (count == 1) {
                calculation.setText(calculation.getText() + "1");
            }
        }
        if (e.getSource() == two){
            if (count == 0){
            calculation.setText(calculation.getText() + "2");
            }
            if (count == 1) {
                calculation.setText(calculation.getText() +"2");
            }
        }
        if (e.getSource() == three){
            if (count == 0){
            calculation.setText(calculation.getText() + "3");
            }
            if (count == 1) {
                calculation.setText(calculation.getText() +"3");
            }

        }
        if (e.getSource() == four){
            if (count == 0){
            calculation.setText(calculation.getText()+ "4");
            }
            if (count == 1) {
                calculation.setText(calculation.getText()+"4");
            }
        }
        if (e.getSource() == five){
            if (count == 0) {
                calculation.setText(calculation.getText()+ "5");
            }
            if (count == 1) {
                calculation.setText(calculation.getText()+"5");
            }
        }
        if (e.getSource() == six){
            if (count == 0){
            calculation.setText(calculation.getText()+ "6");
            }
            if (count == 1) {
                calculation.setText(calculation.getText()+"6");
            }
        }
        if (e.getSource() == seven){
            if (count == 0){
            calculation.setText(calculation.getText()+ "7");
            }
            if (count == 1) {
                calculation.setText(calculation.getText()+"7");
            }
        }
        if (e.getSource() == eight){
            if (count == 0){
            calculation.setText(calculation.getText()+ "8");
            }
            if (count == 1) {
                calculation.setText(calculation.getText()+"8");
            }
        }
        if (e.getSource() == nine){
            if (count == 0){
                calculation.setText(calculation.getText()+ "9");
            }
            if (count == 1) {
                calculation.setText(calculation.getText()+ "9");
            }
        }

        if (e.getSource() == dec) {
            if (!calculation.getText().contains(".")) {
                calculation.setText(calculation.getText() + ".");
            }
        }

        if(e.getSource() == exit){
            System.exit(0);
        }

        //establishing operations
        if (e.getSource() == add){
            userNumbers.add(Double.parseDouble(calculation.getText()));
            userOperations.add(0);
            calculation.setText("");
            count++;
        }

        if (e.getSource() == sub){
            userNumbers.add(Double.parseDouble(calculation.getText()));
            userOperations.add(1);
            calculation.setText("");
            count++;
        }
        if (e.getSource() == mult){
            userNumbers.add(Double.parseDouble(calculation.getText()));
            userOperations.add(2);
            calculation.setText("");
            count++;
        }
        if (e.getSource() == div){
            userNumbers.add(Double.parseDouble(calculation.getText()));
            userOperations.add(3);
            calculation.setText("");
            count++;
        }
        if(e.getSource() == square){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.pow(Double.parseDouble(calculation.getText()),2);
            }
            answer.setText(calculation.getText() + "\u00B2");
            calculation.setText("" + tempAnswer);
        }
        if(e.getSource() == cube){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.pow(Double.parseDouble(calculation.getText()),3);
            }
            answer.setText(calculation.getText() + "\u00B3");
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == percent){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Double.parseDouble(calculation.getText())/100;
            }
            answer.setText(calculation.getText() + "%");
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == sqrt){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.sqrt(Double.parseDouble(calculation.getText()));
            }
            answer.setText("\u221A" +calculation.getText());
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == sin){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.sin(Double.parseDouble(calculation.getText()));
            }
            answer.setText("sin(" +calculation.getText() + ")");
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == cos){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.cos(Double.parseDouble(calculation.getText()));
            }
            answer.setText("cos(" +calculation.getText() + ")");
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == tan){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.tan(Double.parseDouble(calculation.getText()));
            }
            answer.setText("tan(" +calculation.getText() + ")");
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == asin){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.asin(Double.parseDouble(calculation.getText()));
            }
            answer.setText("asin(" +calculation.getText() + ")");
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == acos){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.acos(Double.parseDouble(calculation.getText()));
            }
            answer.setText("acos(" +calculation.getText() + ")");
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == atan){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.atan(Double.parseDouble(calculation.getText()));
            }
            answer.setText("atan(" +calculation.getText() + ")");
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == sinh) {
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.sinh(Double.parseDouble(calculation.getText()));
            }
            answer.setText("sinh(" +calculation.getText() + ")");
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == cosh){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.cosh(Double.parseDouble(calculation.getText()));
            }
            answer.setText("cosh(" +calculation.getText() + ")");
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == tanh){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.tanh(Double.parseDouble(calculation.getText()));
            }
            answer.setText("tanh(" +calculation.getText() + ")");
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == log){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.log10(Double.parseDouble(calculation.getText()));
            }
            answer.setText("log(" +calculation.getText() + ")");
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == ln){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.log(Double.parseDouble(calculation.getText()));
            }
            answer.setText("ln(" +calculation.getText() + ")");
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == abs){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = Math.abs(Double.parseDouble(calculation.getText()));
            }
            answer.setText("abs(" +calculation.getText() + ")");
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == sci){
            userNumbers.add(Double.parseDouble(calculation.getText()));
            userOperations.add(5);
            calculation.setText("");
            count++;
        }
        if (e.getSource() == inv){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = (1/Double.parseDouble(calculation.getText()));
            }
            answer.setText("1/" +calculation.getText());
            calculation.setText("" + tempAnswer);
        }
        if (e.getSource() == mod){
            userNumbers.add(Double.parseDouble(calculation.getText()));
            userOperations.add(4);
            calculation.setText("");
            count++;
        }
        if (e.getSource() == plusMinus){
            Double tempAnswer = 0.0;
            if (calculation.getText().isEmpty()){
                //Do nothing
            }
            else {
                tempAnswer = (Double.parseDouble(calculation.getText()) * -1);
            }
            answer.setText(calculation.getText());
            calculation.setText("" + tempAnswer);
        }

        if (e.getSource() == equ){
            //declaring variables
            Double num1;
            Double num2;
            Double output;

            userNumbers.add(Double.parseDouble(calculation.getText()));

            for (Double number : userNumbers){
                System.out.println(number);
            }

            for (int i = 0; i < userOperations.size(); i++) {
                int operation = userOperations.get(i);

                if (operation == 0) {
                    if (i + 1 >= userNumbers.size()) {
                        // Prevent out-of-bounds error
                        break;
                    }
                    num1 = userNumbers.get(i);
                    num2 = userNumbers.get(i + 1);
                    output = num1 + num2;

                    answer.setText(userNumbers.get(userOperations.indexOf(i)) + " + " +
                            userNumbers.get(userOperations.indexOf(i) + 1));
                    // Update the lists with the result
                    userNumbers.remove(i + 1); // Remove the next item
                    userNumbers.set(i, output); // Update the result at the current index
                    userOperations.remove(i); // Remove the operation

                    calculation.setText(output + "");
                }
                else if (operation == 1) {
                    if (i + 1 >= userNumbers.size()) {
                        break;
                    }
                    num1 = userNumbers.get(userOperations.indexOf(operation));
                    num2 = userNumbers.get(userOperations.indexOf(operation) + 1);
                    output = num1 - num2;

                    answer.setText(userNumbers.get(userOperations.indexOf(operation)) + " - " +
                            userNumbers.get(userOperations.indexOf(operation) + 1));
                    userNumbers.remove(i + 1);
                    userNumbers.set(i, output);
                    userOperations.remove(i);

                    calculation.setText(output + "");
                }
                else if (operation == 2) {
                    if (i + 1 >= userNumbers.size()) {
                        break;
                    }
                    num1 = userNumbers.get(userOperations.indexOf(operation));
                    num2 = userNumbers.get(userOperations.indexOf(operation) + 1);
                    output = num1 * num2;

                    answer.setText(userNumbers.get(userOperations.indexOf(operation)) + " × " +
                            userNumbers.get(userOperations.indexOf(operation) + 1));
                    userNumbers.remove(i + 1);
                    userNumbers.set(i, output);
                    userOperations.remove(i);

                    calculation.setText(output + "");
                }
                else if (operation == 3) {
                    if (i + 1 >= userNumbers.size()) {
                            break;
                        }
                        num1 = userNumbers.get(userOperations.indexOf(operation));
                        num2 = userNumbers.get(userOperations.indexOf(operation) + 1);
                        output = num1 / num2;

                        answer.setText(userNumbers.get(userOperations.indexOf(operation)) + " / " +
                                userNumbers.get(userOperations.indexOf(operation) + 1));
                        userNumbers.remove(i + 1);
                        userNumbers.set(i, output);
                        userOperations.remove(i);

                        calculation.setText(output + "");
                    }
                else if (operation == 4) {
                    if (i + 1 >= userNumbers.size()) {
                        break;
                    }
                    num1 = userNumbers.get(userOperations.indexOf(operation));
                    num2 = userNumbers.get(userOperations.indexOf(operation) + 1);
                    output = num1 % num2;

                    answer.setText(userNumbers.get(userOperations.indexOf(operation)) + " mod " +
                            userNumbers.get(userOperations.indexOf(operation) + 1));
                    userNumbers.remove(i + 1);
                    userNumbers.set(i, output);
                    userOperations.remove(i);

                    calculation.setText(output + "");
                }
                else if (operation == 5) {
                    if (i + 1 >= userNumbers.size()) {
                        // Prevent out-of-bounds error
                        break;
                    }
                    num1 = userNumbers.get(userOperations.indexOf(operation));
                    num2 = userNumbers.get(userOperations.indexOf(operation) + 1);
                    output = num1 * Math.pow(10, num2);

                    answer.setText(userNumbers.get(userOperations.indexOf(operation)) + " * " + "10^" +
                            userNumbers.get(userOperations.indexOf(operation) + 1));
                    userNumbers.remove(i + 1);
                    userNumbers.set(i, output);
                    userOperations.remove(i);

                    calculation.setText(output + "");
                }
                // Adjust the index to ensure the loop doesn't skip an item
                i--;
            } // end of for loop
        userNumbers.clear();
        } // end of equal sign

    }

    public static void main(String[] args){
        Calculating frame = new Calculating();
    }
}
