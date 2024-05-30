package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CalculatorApplication implements ActionListener {



    double number1=0;
    double number2=0;
    double result=0;
    int calculation;



    JFrame frame=new JFrame("Calculator");
    JLabel label= new JLabel();
    JTextField textfield= new JTextField();
    JRadioButton  onButton=new JRadioButton("on");
    JRadioButton  offButton=new JRadioButton("off");
    JButton buttonZero=new JButton("0");
    JButton button1=new JButton("1");
    JButton button2=new JButton("2");
    JButton button3=new JButton("3");
    JButton button4=new JButton("4");
    JButton button5=new JButton("5");
    JButton button6=new JButton("6");
    JButton button7=new JButton("7");
    JButton button8=new JButton("8");
    JButton button9=new JButton("9");
    JButton buttonDot=new JButton(".");
    JButton buttonClear=new JButton("Clr");
    JButton buttonDelete=new JButton("DEL");
    JButton buttonEqual=new JButton("=");
    JButton buttonMulti=new JButton("x");
    JButton buttonDiv=new JButton("/");
    JButton buttonAdd=new JButton("+");
    JButton buttonSubtract=new JButton("-");
    JButton buttonSquare=new JButton("x\u00B2");
    JButton buttonReciprocal=new JButton("1/x");
    JButton buttonSqrt=new JButton("\u221A");

     CalculatorApplication(){
        prepareGui();
        addComponent();
        addActionEvent();

    }
    public void prepareGui(){
        frame.setSize(305,510); //size
        frame.getContentPane().setLayout(null);  //layout
        frame.getContentPane().setBackground(Color.white); // color under awt package that is imported
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addComponent(){
        label.setBounds(250,0,50,50);
        label.setForeground(Color.blue);
        frame.add(label);

        textfield.setBounds(10,40,270,40);
        textfield.setFont(new Font ("Arial",Font.BOLD,20));
        textfield.setEditable(false);
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textfield);

        onButton.setBounds(10,95,60,30);
        onButton.setSelected(true);
        onButton.setFont(new Font("Arial",Font.BOLD,14));
        onButton.setBackground(Color.black);
        onButton.setForeground(Color.white);
        onButton.setFocusable(false);
        frame.add(onButton);

        offButton.setBounds(10,120,60,30);
        offButton.setSelected(true);
        offButton.setFont(new Font("Arial",Font.BOLD,14));
        offButton.setBackground(Color.black);
        offButton.setForeground(Color.white);
        offButton.setFocusable(false);
        frame.add(offButton);

        ButtonGroup buttonGroup=new ButtonGroup();

        buttonGroup.add(onButton);
        buttonGroup.add(offButton);

        button7.setBounds(10,230,60,40);
        button7.setFont(new Font("Arial",Font.BOLD,20));
        button7.setFocusable(false);
        frame.add(button7);

        button8.setBounds(80,230,60,40);
        button8.setFont(new Font("Arial",Font.BOLD,20));
        button8.setFocusable(false);
        frame.add(button8);

        button9.setBounds(150,230,60,40);
        button9.setFont(new Font("Arial",Font.BOLD,20));
        button9.setFocusable(false);
        frame.add(button9);

        button4.setBounds(10,290,60,40);
        button4.setFont(new Font("Arial",Font.BOLD,20));
        button4.setFocusable(false);
        frame.add(button4);

        button5.setBounds(80,290,60,40);
        button5.setFont(new Font("Arial",Font.BOLD,20));
        button5.setFocusable(false);
        frame.add(button5);

        button6.setBounds(150,290,60,40);
        button6.setFont(new Font("Arial",Font.BOLD,20));
        button6.setFocusable(false);
        frame.add(button6);

        button1.setBounds(10,350,60,40);
        button1.setFont(new Font("Arial",Font.BOLD,20));
        button1.setFocusable(false);
        frame.add(button1);

        button2.setBounds(80,350,60,40);
        button2.setFont(new Font("Arial",Font.BOLD,20));
        button2.setFocusable(false);
        frame.add(button2);

        button3.setBounds(150,350,60,40);
        button3.setFont(new Font("Arial",Font.BOLD,20));
        button3.setFocusable(false);
        frame.add(button3);

        buttonDot.setBounds(150,410,60,40);
        buttonDot.setFont(new Font("Arial",Font.BOLD,20));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        buttonZero.setBounds(10,410,130,40);
        buttonZero.setFont(new Font("Arial",Font.BOLD,20));
        buttonZero.setFocusable(false);
        frame.add( buttonZero);

        buttonEqual.setBounds(220,350,60,100);
        buttonEqual.setFont(new Font("Arial",Font.BOLD,20));
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);

        buttonDiv.setBounds(220,110,60,40);
        buttonDiv.setFont(new Font("Arial",Font.BOLD,20));
        buttonDiv.setFocusable(false);
        frame.add( buttonDiv);

        buttonSqrt.setBounds(10,170,60,40);
        buttonSqrt.setFont(new Font("Arial",Font.BOLD,18));
        buttonSqrt.setFocusable(false);
        frame.add( buttonSqrt);

        buttonMulti.setBounds(220,230,60,40);
        buttonMulti.setFont(new Font("Arial",Font.BOLD,20));
        buttonMulti.setFocusable(false);
        frame.add( buttonMulti);

        buttonSubtract.setBounds(220,170,60,40);
        buttonSubtract.setFont(new Font("Arial",Font.BOLD,20));
        buttonSubtract.setFocusable(false);
        frame.add( buttonSubtract);

        buttonAdd.setBounds(220,290,60,50);
        buttonAdd.setFont(new Font("Arial",Font.BOLD,20));
        buttonAdd.setFocusable(false);
        frame.add( buttonAdd);

        buttonSquare.setBounds(80,170,60,40);
        buttonSquare.setFont(new Font("Arial",Font.BOLD,20));
        buttonSquare.setFocusable(false);
        frame.add( buttonSquare);

        buttonReciprocal.setBounds(150,170,60,40);
        buttonReciprocal.setFont(new Font("Arial",Font.BOLD,15));
        buttonReciprocal.setFocusable(false);
        frame.add( buttonReciprocal);

        buttonDelete.setBounds(150,110,60,40);
        buttonDelete.setFont(new Font("Arial",Font.BOLD,12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        buttonDelete.setFocusable(false);
        frame.add( buttonDelete);

        buttonClear.setBounds(80,110,60,40);
        buttonClear.setFont(new Font("Arial",Font.BOLD,12));
        buttonClear.setBackground(Color.blue);
        buttonClear.setForeground(Color.white);
        buttonClear.setFocusable(false);
        frame.add( buttonClear);



    }
    public void addActionEvent(){
        onButton.addActionListener(this);
        offButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonDiv.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMulti.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonAdd.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source=e.getSource();


        if(source==onButton){
            enable();
        }
        else if(source==offButton){
            disable();
        }
        else if(source==buttonClear){
            label.setText("");
            textfield.setText("");
        }
        else if(source==buttonDelete){
            int length=textfield.getText().length();
            int number=length-1;
            if(length>0){
                StringBuilder back=new StringBuilder(textfield.getText());
                back.deleteCharAt(number);
                textfield.setText(back.toString());
            }
            if(textfield.getText().endsWith(""));
            label.setText("");
        }
        else if(source==buttonZero){
            if(textfield.getText().equals("0")){
                return ;
            }
            else {
                textfield.setText(textfield.getText()+"0");
            }
        }
        else if(source==button1){
            textfield.setText(textfield.getText()+"1");
        }
        else if(source==button2){
            textfield.setText(textfield.getText()+"2");
        }
        else if(source==button3){
            textfield.setText(textfield.getText()+"3");
        }
        else if(source==button4){
            textfield.setText(textfield.getText()+"4");
        }
        else if(source==button5){
            textfield.setText(textfield.getText()+"5");
        }
        else if(source==button6){
            textfield.setText(textfield.getText()+"6");
        }
        else if(source==button7){
            textfield.setText(textfield.getText()+"7");
        }
        else if(source==button8){
            textfield.setText(textfield.getText()+"8");
        }
        else if(source==button9){
            textfield.setText(textfield.getText()+"9");
        }
        else if(source==buttonDot){
            if(textfield.getText().contains(".")){
                return ;
            }
            else {
                textfield.setText(textfield.getText()+".");
            }
        }
        else if(source==buttonAdd){
            String str=textfield.getText();
            number1=Double.parseDouble(textfield.getText());
            calculation=1;
            textfield.setText("");
            label.setText(str+"+");
        }
        else if(source==buttonSubtract){
            String str=textfield.getText();
            number1=Double.parseDouble(textfield.getText());
            calculation=2;
            textfield.setText("");
            label.setText(str+"-");
        }
        else if(source==buttonMulti){
             String str=textfield.getText();
            number1=Double.parseDouble(textfield.getText());
            calculation=3;
            textfield.setText("");
            label.setText(str+"x");
        }
        else if(source==buttonDiv){
            String str=textfield.getText();
            number1=Double.parseDouble(textfield.getText());
            calculation=4;
            textfield.setText("");
            label.setText(str+"/");
        }
        else if(source==buttonSquare){
            number1=Double.parseDouble(textfield.getText());
            double square=Math.pow(number1,2);
            String string=Double.toString(square);
            if(string.endsWith(".0")){
                textfield.setText(string.replace(".0",""));
            }
            else{
                textfield.setText(string);
            }

        }
        else if (source==buttonSqrt) {
            number1=Double.parseDouble(textfield.getText());
            double sqrt=Math.sqrt(number1);
            textfield.setText(Double.toString(sqrt));
        }
        else if (source==buttonReciprocal){
            number1=Double.parseDouble(textfield.getText());
            double reciprocal=1/number1;
            String string=Double.toString(reciprocal);
            if(string.endsWith(".0")){
                textfield.setText(string.replace(".0",""));
            }
            else {
                textfield.setText(string);
            }
        }
        else if (source==buttonEqual) {
            number2=Double.parseDouble(textfield.getText());
            switch(calculation){
                case 1:
                    result=number1+number2;
                    break;
                case 2:
                    result=number1-number2;
                    break;
                case 3:
                    result=number1*number2;
                    break;
                case 4:
                    result=number1/number2;
                    break;

            }
            if( Double.toString(result).endsWith(".0")){
                textfield.setText(Double.toString(result).replace(".0",""));
            }
            else{
                textfield.setText(Double.toString(result));
            }
            label.setText("");
            number1=result;
        }

    }
    public void enable(){
        onButton.setEnabled(false);
        offButton.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        buttonAdd.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSubtract.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonMulti.setEnabled(true);

    }

    public void disable(){
        onButton.setEnabled(true);
        offButton.setEnabled(false);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        buttonAdd.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSubtract.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonDot.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonClear.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonMulti.setEnabled(false);

    }

    //end
}