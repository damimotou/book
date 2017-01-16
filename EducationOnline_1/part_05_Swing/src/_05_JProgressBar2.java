package _05.Java.Swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class _05_JProgressBar2 {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Window title");
		myFrame.setSize(300, 300);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		myFrame.setLayout(layout);
		
		myFrame.setVisible(true);
		
		JProgressBar progressBar1 = new JProgressBar();
		progressBar1.setMinimum(0); // ����� ��� ����
		progressBar1.setMaximum(100); // ����� ���� ����
		progressBar1.setValue(25); // ����� ������� �������� ����
		progressBar1.setStringPainted(true); // �������� ������������ �� ���� %	
		// progressBar1.setIndeterminate(true); // ��������� �������� ���
		
		JLabel label1 = new JLabel("��������..."); // ����� ��������
		
		myFrame.add(progressBar1);
		
		
		myFrame.add(label1);  // �������� ����� �������� � ����
		for(int i = progressBar1.getMinimum(); i <= progressBar1.getMaximum(); i++) {			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			progressBar1.setValue(i);			
		}
		label1.setText("���������"); // ����� ���������� ����� ������ ����� �� ���������
		
		
	}

}
