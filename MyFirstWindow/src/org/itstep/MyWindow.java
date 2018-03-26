package org.itstep;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow extends JFrame{
	private JTextField firstNameField;
	private JTextField secondNameField;
	private JTextField emailField;
	private JTextField passwordField;
	private JTextField textField;
	protected JLabel infoField;
	
	public MyWindow(String title) {
		getContentPane().setForeground(Color.BLACK);//constructor;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//close window -- close program
		this.setTitle(title);
		this.setSize(502, 457);
		this.setResizable(false);
		this.setVisible(true);
		this.setLocation(300,300 );
		getContentPane().setLayout(null);
		
		JLabel lFirstName = new JLabel("First name ");
		lFirstName.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lFirstName.setBounds(10, 21, 203, 29);
		getContentPane().add(lFirstName);
		
		JLabel lblScondNameFiled = new JLabel("Second  name ");
		lblScondNameFiled.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblScondNameFiled.setBounds(10, 71, 203, 29);
		getContentPane().add(lblScondNameFiled);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblEmail.setBounds(10, 121, 203, 29);
		getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblPassword.setBounds(10, 170, 203, 29);
		getContentPane().add(lblPassword);
		
		firstNameField = new JTextField();
		firstNameField.setFont(new Font("Tahoma", Font.BOLD, 14));
		firstNameField.setBounds(147, 24, 337, 26);
		getContentPane().add(firstNameField);
		firstNameField.setColumns(10);
		
		secondNameField = new JTextField();
		secondNameField.setFont(new Font("Tahoma", Font.BOLD, 14));
		secondNameField.setColumns(10);
		secondNameField.setBounds(147, 77, 337, 26);
		getContentPane().add(secondNameField);
		
		emailField = new JTextField();
		emailField.setFont(new Font("Tahoma", Font.BOLD, 14));
		emailField.setColumns(10);
		emailField.setBounds(147, 127, 337, 26);
		getContentPane().add(emailField);
		
		passwordField = new JTextField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 14));
		passwordField.setColumns(10);
		passwordField.setBounds(147, 176, 337, 26);
		getContentPane().add(passwordField);
		
		JButton btnSeveAccount = new JButton("SEVE ACCOUNT");
		btnSeveAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String firstName=  firstNameField.getText();
				String secondName =secondNameField.getText();
				String email = emailField.getText();
				String password = passwordField.getText();
				
				String textToWrite = firstName + "   "+secondName +"   "+ email +"   "+ password +"  \n";
				AccountSever saver = new AccountSever();
				saver.writeTextToFile(textToWrite, textToWrite);
				
				firstNameField.setText("");
				secondNameField.setText("");
				emailField.setText("");
				passwordField.setText("");
				
				
				infoField.setText("Account with E-mail " + email + " saved!");
				    getContentPane().repaint();
				
				
				
				
				
			}
		});
		btnSeveAccount.setForeground(Color.RED);
		btnSeveAccount.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSeveAccount.setBounds(10, 231, 474, 29);
		getContentPane().add(btnSeveAccount);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField.setEditable(false);
		textField.setBounds(10, 289, 474, 38);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		this.repaint();
	}
}
