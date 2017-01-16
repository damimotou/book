package _01.base.lessonfirst;
import java.util.Arrays;

public class _14_ArrayTwo {

	public static void main(String[] args) {
		// 00 01 02 03 04 ..... �� ������� ������� outerArr[0] - ����� ������ ��
		// [5] ��������
		// 10 11 12 13 14 ..... �� ������� ������� outerArr[1] - ����� ������ ��
		// [5] ��������
		// 20 21 22 23 24 ..... �� ������� ������� outerArr[2] - ����� ������ ��
		// [5] ��������
		// 30 31 32 33 34 ..... �� ������� ������� outerArr[3] - ����� ������ ��
		// [5] ��������

		int[][] arr = new int[4][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;
			} // end inner for
		} // end outer for
		
		// System.out.println(Arrays.toString(arr)); // [[I@2a139a55, [I@15db9742, [I@6d06d69c, [I@7852e922]
		System.out.println(Arrays.deepToString(arr)); // [[0, 1, 2, 3, 4], [1, 2, 3, 4, 5], [2, 3, 4, 5, 6], [3, 4, 5, 6, 7]]
	}

}
