package _35_OverridingVirtualMethod;

public class Main {

	public static void main(String[] args) {
// A.f() <- B.f() <- C.c() 
// ��� � ��������� ����� f() �� � - ��������� ��������		
		A a = new A();
		a.f();
		
		B b = new B();
		b.f();
		
		C c = new C();
		c.f();

	}

}
