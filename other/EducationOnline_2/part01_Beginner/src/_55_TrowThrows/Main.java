package _55_TrowThrows;

public class Main {

	public static void main(String[] args) {

		divide(6, 0);
	}

	// �������� (throws ArithmeticException), ��� ����� ����� ��������� exception
	// throws � ��������� - ���������� � ������ ������������� ������ � ���������� �����
	// ���������� �� ��������� main() ������������ ArithmeticException �� ��� RuntimeException - unchecked
	// � ���������� � ������ /0 ������� ��������� ���� ����� � �������
	
	public static void divide(int a, int b) throws ArithmeticException {

		System.out.println(a / b);

	}
}
