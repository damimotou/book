package _32_String;

public class Palindrome {

	public static void main(String[] args) {
		
		
		
		boolean b = isPalindrome("1221");	
		System.out.println(b);

	}
	// ����� ��������� ������ �� ��������������
	public static boolean isPalindrome(String s) {
		
		// StringBuffer  ������� ������ ������� ��� ������������� �����
		StringBuilder sb = new StringBuilder(s);  // ������� StringBuilder ��� ������ � �������� �� ���� �������
		                                         // s ���������� � ������ sb, ����� �������� � sb. �������� s - ���������.
		System.out.println(sb);   
		sb.reverse();   //  ������ sb
		System.out.println(sb);  //  ������ � sb ������������
		System.out.println(s);   // ������ � ��������� s �������� ����������
		
		return sb.toString().equals(s);  // ����� �������� ������ ���� StringBuilder � �������� ���� String
		                                 // �������� ����� toString ��� StringBuilder, ���� ���������� sb � s
	}

}
