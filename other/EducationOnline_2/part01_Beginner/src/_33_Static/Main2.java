package _33_Static;

public class Main2 {

	public static void main(String[] args) {

		AboutStatic st = new AboutStatic();
		AboutStatic st2 = new AboutStatic();
		AboutStatic st3 = new AboutStatic();

		AboutStatic.sd = 10; // ��� ������ ���� �/� �����
		st.d = 1; // ��� ���� ����������� ��������
		st2.d = 2; // ��� ���� ����������� ��������
		st3.d = 3; // ��� ���� ����������� ��������

		st.mult(); // ����� ������, ������������� � ������� ������ ����
		st2.mult(); // ����� ������, ������������� � ������� ������ ����
		st3.mult(); // ����� ������, ������������� � ������� ������ ����

		// �� ������ ������ main() ����� ������� ������ ������ ������
		stat(2.0);  // ������ �� ������� ����������
		// nonStat(2.0);  // �� ������ �� ������� �� ����������
		
		AboutStatic.square(2); // ����� ������ ������ ��. �������� ��� �������� ��� ��������
	}

	// ������ ������ ����� ���������� �� �� ������ �������
	public static void stat(double d) {
	}

	// �� ������ ������ �� ����� ���������� �� �� ������ �������
	public void nonStat(double d) {
	}

}
