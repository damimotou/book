package _05.Java.Swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class _10_GridBagLayout {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("����������� � �������");
		myFrame.setSize(300, 300);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocationRelativeTo(null);
		myFrame.setResizable(false);
		myFrame.setLayout(new GridBagLayout());	
		
		JLabel loginLable = new JLabel("Login:");
		JLabel passwordLable = new JLabel("Password:");
		
		JTextField loginField = new JTextField(10);
		JPasswordField passwordField = new JPasswordField(10);
		
		JButton loginButton = new JButton("login");
		JButton passwordButton = new JButton("register");
		
		
		
		/*
		 00 01 02 03 04 05 ...
		 10 11 12 13 14 15
		 20 21 22 23 24 25
		 30 31 32 33 34 35
		 ................
		 */
		
		/*		 
		 GridBagConstraints constrains = new GridBagConstraints(); // �����, �-�� ��������� �������
		 
		constrains.gridx = 3; // ������������ �� ��� � ����� �������
		constrains.gridy = 1; // ������������ �� ��� y ������ ����
		constrains.gridwidth = 1; // ���-�� ����� �� �-�� ������� ������ �� ��� �
		constrains.gridheight = 3; // ���-�� ����� �� �-�� ������� ������ �� ��� y
		constrains.weightx = 0.0;
		constrains.weighty = 0.9;
		constrains.anchor = GridBagConstraints.NORTH;
		constrains.fill = GridBagConstraints.HORIZONTAL;
		constrains.insets = new Insets(100, 2, 3, 4); // ������� top - left - bottom - right
		constrains.ipadx = 0; // ������ ���������� � ������� �� �
		constrains.ipady = 0; // ������ ���������� � ������� �� y
		
		myFrame.add(loginButton, constrains); // ������ �� �����  ��������� � ����������� �����	
		*/				
		
		
		myFrame.add(loginLable, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		
		myFrame.add(loginField, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		
		myFrame.add(passwordLable, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		
		myFrame.add(passwordField, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		
		myFrame.add(loginButton, new GridBagConstraints(0, 2, 2, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		
		myFrame.add(passwordButton, new GridBagConstraints(0, 3, 2, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		
		myFrame.pack(); //������� ����� �� �������� ��������
		myFrame.setVisible(true);

	}

}
