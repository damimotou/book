package _01.base.lessonfirst;

public class _10_For2 {

	public static void main(String[] args) {
		
		//for (;;); // ����������� ����, ���� ������� �� ������ �� �������= true
		
		// ������� 3 ����� � ��������� (-100...100)
		for (int i = -100; i <= 100; i++) {
			if ((i % 3) == 0) System.out.print(i + " ");				
		}
	}

}
