// ����������
// ����������		
// ���������


package _05.Java.Swing;

// import java.awt.Color;
// import java.awt.Dimension;

import javax.swing.JFrame;

public class _01_JFrame {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("MyWindow title from constructor");
		// myFrame.setTitle("MyWindow setTitle");
		myFrame.setSize(300, 300);
		// myFrame.setSize(new Dimension(300, 300));
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// myFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		myFrame.setLocationRelativeTo(null); // window on center
		myFrame.setResizable(false);
		// System.out.println(myFrame.getTitle()); 
		// myFrame.setState(JFrame.ICONIFIED); // ��������		
		// myFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); // �� ���� �����
		// myFrame.setExtendedState(JFrame.NORMAL); // ���������� ������
		
		
		
		
		

	}

}
