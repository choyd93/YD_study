package sec04.exam01_arithmetic;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1; //A(�����ڵ�) = 65 + 1 = 66 = 'B'
		System.out.println(c1);
		//���ͷ����� ����Ͽ� char Ÿ�Կ� ���尡�� //���� B
		
		char c2 = 'A';
		//char c3 = c2 + 1; //<-�Ұ����� �ڵ�. ���ڿ� ����Ͽ� intŸ������ ��ȯ�Ǳ� ������ charŸ������ ���� �Ұ���
		
		int result = c2 + 1;
		System.out.println(result); //���� 66
		//����(c2)�� ������ ����� �� int������ ��ȯ�Ǳ� ������ intŸ�Կ� �־�� ��.
		
		char c3 = (char)result;
		System.out.println(c3); //���� B, char Ÿ������ ������ȯ�Ͽ� ����
	
	}

}
