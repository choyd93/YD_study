package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {

		//int intValue = 44032; //int�� 4����Ʈ, char�� 2����Ʈ
		//char charValue = intValue;
		
		int intValue = 44032; //int�� 4����Ʈ, char�� 2����Ʈ
		char charValue = (char) intValue; //������ȯ
		System.out.println(charValue); //������� '��'
		
		long longValue = 500; //long�� 8����Ʈ, int�� 4����Ʈ
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14; //double�� �Ǽ�Ÿ��, int�� ����Ÿ��
		intValue = (int) doubleValue;
		System.out.println(intValue); //������� ������ 3
	}

}
