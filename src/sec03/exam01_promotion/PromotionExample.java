package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue); //���� 10, ����Ʈ�� ��Ʈ�� ��ȯ
		
		char charValue = '��';
		intValue = charValue;
		System.out.println(intValue); //���� 44032, char�� '��'�� ��Ʈ�� ��ȯ�Ǹ� �����ڵ� 44032 ��� ����
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(intValue); //���� 500, ��Ʈ�� �� Ÿ������ ��ȯ, �սǵ��� �ʰ� 500 
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue); //��Ʈ�� ����� ��ȯ
		
		longValue = 10000000000L;
		float floatValue = longValue; //��Ÿ���� 8����Ʈ�� �÷��� 4����Ʈ���� ��Ÿ���� �÷����� ��ȯ
		System.out.println(floatValue);
}
}