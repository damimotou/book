package _24_CompareRef;

public class PlaneTest {

	public static void main(String[] args) {
		
		Plane plane = new Plane();
		plane.title = "Boeing 787";
		plane.speed = 1000;
		plane.capacity = 300;
		
		Plane plane2 = new Plane();
		plane2.title = "Boeing 777";
		plane2.speed = 2000;
		plane2.capacity = 400;
		
		System.out.println(plane == plane2); // false  ���������� ������ (��������� �� ������ �������) 
		
		// ���� � �������� �����, � ������ �� ��� ���
		plane.title = plane2.title;
		plane.speed = plane2.speed;
		plane.capacity = plane2.capacity;		
		System.out.println(plane == plane2); // false  ���������� ������ (���������� ��������� �� ������ �������)
		
		plane = plane2; // ������ ��� ������ ��������� �� ���� ������		
		System.out.println(plane == plane2); // true  ���������� ������ (������ ������ �����)

	}

}
