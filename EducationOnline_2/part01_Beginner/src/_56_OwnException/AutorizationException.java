package _56_OwnException;

// ������� ���� ����� ����������
public class AutorizationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3112326672345079313L; // �����-�� �����, ��������� � ������������� (�� ���� ��� :()
	
	// ����������� �� ���������
	public AutorizationException() {
		super(); // ����� ������������� ������������
	}
	// ����������� ��� ����
	public AutorizationException(String message) {
		super(message);
	}

}
