package _55_TrowThrows;

public class Main3 {

	public static void main(String[] args) {
		
		try {
			divide();
		} catch (Exception e) {
			System.out.println("catched");
			e.printStackTrace();			
		}
				
	}
	
	public static void divide() throws Exception {

		throw new Exception("Test throw");   // throw ���������� ���������� (� - ��������� ��� ��� � - ������� ����)
        // ���� ���������� ������� � ������� ������, �� ��� ���� ������������ � ���, � ���� � ��������� �������,
		// ��� �������� ��������� - ������������ �����������. ������� ����� ���� - ������������
	}
}
