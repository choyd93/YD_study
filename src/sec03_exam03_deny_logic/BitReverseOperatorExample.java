package sec03_exam03_deny_logic;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		
		System.out.println(toBinaryString(v1) + "(������:" + v1 + ")");
		//���� 00000000000000000000000000001010(������:10) , int�� 4����Ʈ�� 32��Ʈ�� ǥ��
		
		System.out.println(toBinaryString(v2) + "(������:" + v2 + ")");
		//���� 11111111111111111111111111110101(������:-11), 2������ ǥ���� ���� �ݴ�� ���
		
		System.out.println(toBinaryString(v3) + "(������:" + v3 + ")");
		System.out.println(v2); //���� -11
		System.out.println(v3); //���� -10
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		
		System.out.println(toBinaryString(v4) + "(������:" + v4 + ")");
		// 11111111111111111111111111110110(������:-10)
		
		System.out.println(toBinaryString(v5) + "(������:" + v5 + ")");
		// 00000000000000000000000000001001(������:9)
		
		System.out.println(toBinaryString(v6) + "(������:" + v6 + ")");
		// 00000000000000000000000000001010(������:10)

		System.out.println(v5); //���� 9
		System.out.println(v6); //���� 10

	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = "0" + str;
		}
		return str;
	}

}
