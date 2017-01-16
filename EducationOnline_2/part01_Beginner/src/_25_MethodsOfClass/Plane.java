package _25_MethodsOfClass;

/*
 ������������ �������:
 default (package)
 private
 protected
 public
 
 ������������ �������:
 native    // JNI
 volatile  // ������
 static
 final
 abstract
 synchronized  // ������
 strictfp  // ����������� ��� ���������� ����� � ��������� ������
 
  ������������ �������: 
 static
 final
 abstract
 strictfp
 
   ������������ �����: 
 static
 final
 transient // �������� ������, ���������� ������������� transient, �� �������������.
 volatile
 
 
 
 
 
 
 */

public class Plane {
	
	public String title;
	public int capacity;
	public int speed = 10;
	
	public void get(int i, String s) {
		System.out.println("It is method get. i = " + i);
	}
	
	public int f(int i) {
		if (i > 0) return 1;		
		if (i < 0) return -1;		
		return 0;
	}
	
	public int c(int i) {
		return speed - i;
	}
	

}
