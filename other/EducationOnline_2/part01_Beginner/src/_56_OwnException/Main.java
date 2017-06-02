package _56_OwnException;

public class Main {

	public static void main(String[] args) {
		
		try {
			// ����� ������ dbConnection(int r), �-�� ������ ����� AutorizationException
			// ��� ��������� ������������ ����� � try-catch
			dbConnection(-1); // -1 ��� ����������, ��������� ���������
		} catch (AutorizationException e) {
			System.out.println("no connection");
			e.printStackTrace();
		} finally {
			System.out.println("Close all resources");
		}

	}
	
	// �������������� throws AutorizationException ���������� ������ ����������
	public static void dbConnection(int r) throws AutorizationException {
		if (r != -1) {
			System.out.println("Connect");
		} else {
			throw new AutorizationException("Connection failure");
		}
			
	}

}
