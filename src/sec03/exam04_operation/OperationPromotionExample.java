package sec03.exam04_operation;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		//byte byteValue3 = byteValue1 + byteValue2;  ����Ʈ ������ ��Ʈ�� ����Ǽ� ����
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1); // ������� 30
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		//char charValue3 = charValue1 + charValue2; ��Ʈ�� �ڵ� ��ȯ��� ������ ����
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ�=" + intValue2); 
		//������� 66, A�� �����ڵ�� 65�̱� ����
		
		System.out.println("��¹���" + (char)intValue2); //������� B
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; 
		//2.5�� ���;� ������ ���������� ������ ������ ������ �Ҽ����� ������2�� ��µ�.
		System.out.println(intValue4); //������� 2
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; <- �Ǽ����ͷ�(4.0)�� �����ϸ� ��� ���� double�� ��ȯ�Ͽ� ���
		double doubleValue1 = intValue5 / 4.0;
		System.out.println(doubleValue1); //���� 2.5
}
}