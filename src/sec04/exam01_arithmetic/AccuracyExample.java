package sec04.exam01_arithmetic;

public class AccuracyExample {

	public static void main(String[] args) {
		/*double result = 7 * 0.1;
		System.out.println(result); 
		������� 0.7000000000000001 �Ǽ��� ����.
		*/
		
		int apple = 1;
		double pieceUnit = 0.1; //�Ǽ��� �־ ������� �Ǽ��� ����.
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("��� �Ѱ�����");
		System.out.println("07 ������ ����");
		System.out.println(result + "������ ���´�.");
		
		/* �������
		��� �Ѱ�����
		07 ������ ����
		0.29999999999999993������ ���´�.
		�Ǽ� ������ ������ ���ϰ� ���������� �Ѵ�.
		*/
	}

}
