package _05.Java.Swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class _05_JProgressBar {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Window title");
		myFrame.setSize(300, 300);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		myFrame.setLayout(layout);
		
		JProgressBar progressBar1 = new JProgressBar();
		progressBar1.setMinimum(0); // ����� ��� ����
		progressBar1.setMaximum(100); // ����� ���� ����
		progressBar1.setValue(25); // ����� ������� �������� ����
		progressBar1.setStringPainted(true); // �������� ������������ �� ���� %		
		
		myFrame.add(progressBar1);		
		myFrame.setVisible(true);
		
	}

}
