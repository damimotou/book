package _33_Static;

public class Main {

	public static void main(String[] args) {

		AboutStatic st = new AboutStatic();
		AboutStatic st2 = new AboutStatic();
		AboutStatic st3 = new AboutStatic();

		// ������������� �� ������������ ����
		st.d = 10.1;
		st2.d = 20.1;
		st3.d = 30.1;

		// ���� � ���� ��������� ����
		System.out.println(st.d);
		System.out.println(st2.d);
		System.out.println(st3.d);

		// ������������� ������������ ���� (�� ������ ����� ����� �������� �/� ��� ������)
		st.sd = 10.2;     // sd = 10.2
		st2.sd = 20.2;    // sd2 = 20.2 sd = 20.2
		st3.sd = 30.2;    // sd3 = 30.2 sd2 = 30.2 sd = 30.2
		// ���� ���� �� ��� �������� (������ � ������ �������� �� ���� ���������)
		System.out.println(st.sd);
		System.out.println(st2.sd);
		System.out.println(st3.sd);
		
		AboutStatic.sd = 100; // ������ �� ������ ����� �/� ��� ������, � �� ��������
		System.out.println(AboutStatic.sd);
		System.out.println(st.sd);
		System.out.println(st2.sd);
		System.out.println(st3.sd);

	}

}
