package _44_ThisKey;

public class Doctor extends Human {

	public Doctor () {		
		System.out.println("Constructor Doctor()");		
	}
	public Doctor (String name) {	
		super(name); // ����� ������������� ������������
		System.out.println("Constructor Doctor()");		
	}
}
