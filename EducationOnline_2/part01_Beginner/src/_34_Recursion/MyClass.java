package _34_Recursion;

public class MyClass {

	public void methodOne() {
		
			methodTwo(); // ����� ������ �� ��. ������
			methodOne(); // ����������� ����� ������ (��� ����)	
			// ���� ��� ������� ������ ����������� �������� ����������� ���� StackOverflowError
			
/*
 ������ �����
 
f() ->  f2() -> f3() -> f4() -> f5() -> f6() -> f7()
f() ->  f2() -> f3() -> f4() -> f5() -> f6() <- f7()
f() ->  f2() -> f3() -> f4() -> f5() <- f6()
f() ->  f2() -> f3() -> f4() -> f5()
f() ->  f2() -> f3() <- f4()
f() ->  f2() <- f3()
f() <-  f2()
f() 
 
 */
		
	}

	public void methodTwo() {

	}
}
