package _32_String;

public class Main3 {

	public static void main(String[] args) {	
		
		StringBuilder sBuilder = new StringBuilder("12345"); // ��������� ������ �������� ������������ (�� ���� ����� ��������)
		String s = " plus";
		sBuilder.append(s);  //  �������� ������	
	System.out.println(sBuilder);
	
	System.out.println(sBuilder.substring(0, 2));  // ����� ������� 0, 1 // ������ �������� ���������� !!!!!!
	System.out.println(sBuilder);   // ������ �������� ���������� !!!!!!
	
	sBuilder.insert(0, '$');    // ������ ����������
	System.out.println(sBuilder);   //  ������ ���������� !!!!!!
	
	System.out.println(sBuilder.reverse());
	System.out.println(sBuilder);   //  ������ ���������� !!!!!!
	
		
	
	}

}
