package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BasicCalculator extends JFrame {
private double total1 = 0.0;
private double sum = 0.0;
private char mathOperator;


private void getOperator (String btnText) {
	mathOperator = btnText.charAt(0); // converts a String into Char.
	total1 = total1 + Double.parseDouble(textField.getText());
	textField.setText("");
}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicCalculator frame = new BasicCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BasicCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 378);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 251, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(0, 58, 271, 284);
		contentPane.add(panel);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setBounds(1, 1, 134, 56);
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//sum = total1 + Double.parseDouble(textField.getText());
				//textField.setText(Double.toString(total1));
				//total1 = 0;
			switch (mathOperator) {
			case '+':
				sum = total1 + Double.parseDouble(textField.getText());
				break;
			case '-':
				sum = total1 - Double.parseDouble(textField.getText());
				break;
			case '/':
				sum = total1 / Double.parseDouble(textField.getText());
				break;
			case '*':
				sum = total1 * Double.parseDouble(textField.getText());
				break;
			case '%':
				sum = ((Float.parseFloat(textField.getText())) / 100) * total1;
				break;
			}
				textField.setText(Double.toString(sum));
		total1 = 0;
			
			}
		});
		panel.setLayout(null);
		btnEquals.setFont(new Font("Georgia", Font.BOLD, 20));
		btnEquals.setBackground(new Color(216, 191, 216));
		panel.add(btnEquals);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(202, 225, 67, 56);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String plus = textField.getText() + btnPlus.getText(); //saves previous input
				//String text = textField.getText();
				//textField.setText(plus);
				String buttonText = btnPlus.getText();
				getOperator(buttonText);

				//total1 = total1 + Double.parseDouble(textField.getText());
				//textField.setText("");
				
			}
		});
		
		JButton btnPercent = new JButton("%");
		btnPercent.setBackground(new Color(230, 230, 250));
		btnPercent.setFont(new Font("Georgia", Font.BOLD, 15));
		btnPercent.setBounds(135, 225, 67, 56);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String percent = textField.getText() + btnPercent.getText(); //saves previous input
				//String text = textField.getText();
				String buttonText = btnPercent.getText();
				getOperator(buttonText);
			}
		});
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(68, 225, 67, 56);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String dot = textField.getText() + btnDot.getText(); //saves previous input
				//String text = textField.getText();
				textField.setText(dot);
			}
		});
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(1, 225, 67, 56);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnZero = textField.getText() + btn0.getText(); //saves previous input
				//String text = textField.getText();
				textField.setText(btnZero);
			}
		});
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(202, 169, 67, 56);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String minus = textField.getText() + btnMinus.getText(); //saves previous input
				//String text = textField.getText();
				String buttonText = btnMinus.getText();
				getOperator(buttonText);
				//textField.setText(minus);
				//total1 = total1 + Double.parseDouble(textField.getText());
			}
		});
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(135, 169, 67, 56);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnNine = textField.getText() + btn9.getText(); //saves previous input
				//String text = textField.getText();
				textField.setText(btnNine);
			}
		});
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(68, 169, 67, 56);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String btnEight = textField.getText() + btn8.getText(); //saves previous input
			//String text = textField.getText();
			textField.setText(btnEight);
			}
		});
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(1, 169, 67, 56);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnSeven = textField.getText() + btn7.getText(); //saves previous input
				//String text = textField.getText();
				textField.setText(btnSeven);
			}
		});
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(202, 113, 67, 56);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String divide = textField.getText() + btnDiv.getText(); //saves previous input
				//String text = textField.getText();
				String buttonText = btnDiv.getText();
				getOperator(buttonText);
				//textField.setText(divide);
				//total1 = total1 + Double.parseDouble(textField.getText());
			}
		});
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(135, 113, 67, 56);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnSix = textField.getText() + btn6.getText(); //saves previous input
				//String text = textField.getText();
				textField.setText(btnSix);
			}
		});
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(68, 113, 67, 56);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnFive = textField.getText() + btn5.getText(); //saves previous input
				//String text = textField.getText();
				textField.setText(btnFive);
			}
		});
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(1, 113, 67, 56);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnFour = textField.getText() + btn4.getText(); //saves previous input
				//String text = textField.getText();
				textField.setText(btnFour);
			}
		});
		
		JButton btnMult = new JButton("*");
		btnMult.setBounds(202, 57, 67, 56);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String mult = textField.getText() + btnMult.getText(); //saves previous input
			//	String text = textField.getText();
				String buttonText = btnMult.getText();
				getOperator(buttonText);
				
				//textField.setText(mult);
				//total1 = total1 + Double.parseDouble(textField.getText());
			}
		});
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(135, 57, 67, 56);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnThree = textField.getText() + btn3.getText(); //saves previous input
				//String text = textField.getText();
				textField.setText(btnThree);
			}
		});
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(68, 57, 67, 56);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnTwo = textField.getText() + btn2.getText(); //saves previous input
				//String text = textField.getText();
				textField.setText(btnTwo);
			}
		});
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(1, 57, 67, 56);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String btnOne = textField.getText() + btn1.getText(); //saves previous input
				//String text = textField.getText();
				textField.setText(btnOne);
			}
		});
		
		JButton btnClear = new JButton("C");
		btnClear.setBounds(135, 1, 134, 56);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			sum = 0;
			textField.setText("");
			}
		});
		
		JLabel label = new JLabel("");
		label.setBounds(68, 1, 67, 56);
		panel.add(label);
		btnClear.setFont(new Font("Georgia", Font.BOLD, 15));
		btnClear.setBackground(new Color(250, 128, 114));
		panel.add(btnClear);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(202, 1, 67, 56);
		panel.add(label_2);
		btn1.setFont(new Font("Georgia", Font.BOLD, 15));
		btn1.setBackground(new Color(230, 230, 250));
		panel.add(btn1);
		btn2.setFont(new Font("Georgia", Font.BOLD, 15));
		btn2.setBackground(new Color(230, 230, 250));
		panel.add(btn2);
		btn3.setFont(new Font("Georgia", Font.BOLD, 15));
		btn3.setBackground(new Color(230, 230, 250));
		panel.add(btn3);
		btnMult.setFont(new Font("Georgia", Font.BOLD, 15));
		btnMult.setBackground(new Color(176, 196, 222));
		panel.add(btnMult);
		btn4.setFont(new Font("Georgia", Font.BOLD, 15));
		btn4.setBackground(new Color(230, 230, 250));
		panel.add(btn4);
		btn5.setFont(new Font("Georgia", Font.BOLD, 15));
		btn5.setBackground(new Color(230, 230, 250));
		panel.add(btn5);
		btn6.setFont(new Font("Georgia", Font.BOLD, 15));
		btn6.setBackground(new Color(230, 230, 250));
		panel.add(btn6);
		btnDiv.setFont(new Font("Georgia", Font.BOLD, 15));
		btnDiv.setBackground(new Color(176, 196, 222));
		panel.add(btnDiv);
		btn7.setFont(new Font("Georgia", Font.BOLD, 15));
		btn7.setBackground(new Color(230, 230, 250));
		panel.add(btn7);
		btn8.setFont(new Font("Georgia", Font.BOLD, 15));
		btn8.setBackground(new Color(230, 230, 250));
		panel.add(btn8);
		btn9.setFont(new Font("Georgia", Font.BOLD, 15));
		btn9.setBackground(new Color(230, 230, 250));
		panel.add(btn9);
		btnMinus.setFont(new Font("Georgia", Font.BOLD, 15));
		btnMinus.setBackground(new Color(176, 196, 222));
		panel.add(btnMinus);
		btn0.setFont(new Font("Georgia", Font.BOLD, 15));
		btn0.setBackground(new Color(230, 230, 250));
		panel.add(btn0);
		btnDot.setFont(new Font("Georgia", Font.BOLD, 15));
		btnDot.setBackground(new Color(230, 230, 250));
		panel.add(btnDot);
		panel.add(btnPercent);
		btnPlus.setFont(new Font("Georgia", Font.BOLD, 15));
		btnPlus.setBackground(new Color(176, 196, 222));
		panel.add(btnPlus);
	}
}
