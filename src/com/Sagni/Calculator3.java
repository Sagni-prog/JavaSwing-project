package com.Sagni;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator3 extends JFrame {
     // JFrame frame = new JFrame("Simple Calculator");
        JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bm,bs,bd,bc,beq,bdec,bsq,bsin,bcos,btan;
        JTextField field;
        double leftOperand;
    double lastOperand,result;
    double root;
        int operator;
        public Calculator3(){
            JPanel panel = new JPanel();
            panel.setBackground(Color.blue);
            //create buttons
            b1 = new JButton("1");
            b2 = new JButton("2");
            b3 = new JButton("3");
            b4 = new JButton("4");
            b5 = new JButton("5");
            b6 = new JButton("6");
            b7 = new JButton("7");
            b8 = new JButton("8");
            b9 = new JButton("9");
            b0 = new JButton("0");
            bp = new JButton("+");
            bs = new JButton("-");
            bm = new JButton("*");
            bd = new JButton("/");
            bdec = new JButton(".");
            bc = new JButton("Clear");
            beq = new JButton("=");
            bsq = new JButton("sq");
            bsin = new JButton("si");
            bcos = new JButton("co");
            btan = new JButton("ta");
            field = new JTextField();
            field.setEditable(false);
            field.setBackground(Color.LIGHT_GRAY);
            JPanel labelPanel = new JPanel();
            labelPanel.setBackground(new Color(0,155,150));
            labelPanel.setForeground(new Color(205, 21, 21));
            JLabel lab = new JLabel("  Hint: sq:sqrt   si:sin   co:cos   ta:tan");
            labelPanel.add(lab);
            this.add(labelPanel,BorderLayout.SOUTH);
            lab.setBounds(15,320,230,30);
            field.setBounds(15,32,208,35);
            b7.setBounds(15,80,50,40);
            b8.setBounds(67,80,50,40);
            b9.setBounds(119,80,50,40);
            bd.setBounds(171,80,50,40);

            b4.setBounds(15,123,50,40);
            b5.setBounds(67,123,50,40);
            b6.setBounds(119,123,50,40);
            bm.setBounds(171,123,50,40);

            b1.setBounds(15,166,50,40);
            b2.setBounds(67,166,50,40);
            b3.setBounds(119,166,50,40);
            bs.setBounds(171,166,50,40);

            bdec.setBounds(15,209,50,40);
            b0.setBounds(67,209,50,40);
            beq.setBounds(119,209,50,40);
            bp.setBounds(171,209,50,40);

            bsq.setBounds(15,252,50,40);
            bsin.setBounds(67,253,50,40);
            bcos.setBounds(119,253,50,40);
            btan.setBounds(171,252,50,40);
            bc.setBounds(67,295,103,30);
          //  panel.add(lab,BorderLayout.NORTH);
            //add buttons to the panel
            panel.add(field);
            panel.add(b7);
            panel.add(b8);
            panel.add(b9);
            panel.add(bd);
            panel.add(b4);
            panel.add(b5);
            panel.add(b6);
            panel.add(bm);
            panel.add(b1);
            panel.add(b2);
            panel.add(b3);
            panel.add(bs);
            panel.add(bdec);
            panel.add(b0);
            panel.add(beq);
            panel.add(bp);
            panel.add(bc);
            panel.add(bsq);
            panel.add(bsin);
            panel.add(bcos);
            panel.add(btan);
            //action listener
            b1.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  field.setText(field.getText().concat("1"));
              }
          });
            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText().concat("2"));
                }
            });
            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText().concat("3"));
                }
            });
            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText().concat("4"));
                }
            });
            b5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText().concat("5"));
                }
            });
            b6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText().concat("6"));
                }
            });
            b7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText().concat("7"));
                }
            });
            b8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText().concat("8"));
                }
            });
            b9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText().concat("9"));
                }
            });
            b0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText().concat("0"));
                }
            });
            bdec.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText().concat("."));
                }
            });
            bsq.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    leftOperand = Double.parseDouble(field.getText());
                    root = Math.sqrt(leftOperand);
                    field.setText("" + root);
                }
            });
            bsin.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    leftOperand = Double.parseDouble(field.getText());
                    result = Math.sin(leftOperand);
                    field.setText("" + result);
                }
            });
            bcos.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    leftOperand = Double.parseDouble(field.getText());
                    result = Math.cos(leftOperand);
                    field.setText("" + result);
                }
            });btan.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    leftOperand = Double.parseDouble(field.getText());
                    result = Math.tan(leftOperand);
                    field.setText("" + result);
                }
            });
            bc.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText("");
                }
            });
            bp.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   leftOperand = Double.parseDouble(field.getText());
                   operator = 1;
                   field.setText("");
                }
            });
            bs.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    leftOperand = Double.parseDouble(field.getText());
                    operator = 2;
                    field.setText("");
                }
            });
            bm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    leftOperand = Double.parseDouble(field.getText());
                    operator = 3;
                    field.setText("");
                }
            });
            bd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    leftOperand = Double.parseDouble(field.getText());
                    operator = 4;
                    field.setText("");
                }
            });
          beq.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  lastOperand = Double.parseDouble(field.getText());
                  switch(operator){
                      case 1:
                          result = leftOperand + lastOperand;
                          break;
                      case 2:
                          result = leftOperand - lastOperand;
                          break;
                      case 3:
                          result = leftOperand * lastOperand;
                          break;
                      case 4:

                          result = leftOperand / lastOperand;

                              break;
                      default:
                          result = 0;
                  }
                  field.setText("" + result);
              }
          });
            panel.setLayout(null);
            this.add(panel);
            this.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
            this.setSize(255,390);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
           // panel.setLayout(null);
            this.setVisible(true);
        }
    public static void main(String[] args) {
       new Calculator3();
    }
 }
