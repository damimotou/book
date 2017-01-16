package _55_TrowThrows;

public class Main2 {

	public static void main(String[] args) {

		try {
			divide(6, 0);
		} catch (Exception e) {
			System.out.println("/ 0");
		}
	}

	// �������� (throws Exception), ��� ����� ����� ��������� exception
	// throws � ��������� - ���������� � ������ ������������� ������ � ���������� �����
	// ���������� ��������� main() ������������ Exception �� ��� - checked	
	
	public static void divide(int a, int b) throws Exception {

		System.out.println(a / b);

	}
}
