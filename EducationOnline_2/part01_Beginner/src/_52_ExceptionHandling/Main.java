package _52_ExceptionHandling;

public class Main {

	public static void main(String[] args) {		

		divide(6, 0);
	}
	
	// ���� ����� �����/����� ���. �� �� ����� ������������� ������  /0
	// (/0) java.lang.ArithmeticException �������� RuntimeException uncheked - �� ����������� ���.
	public static void divide(int a, int b) {
		System.out.println(a / b);  // uncheked
	}
	
	// ���� ����� ����� �� ���. �� �� �� ����� ������� ������������� ������
	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}

}
