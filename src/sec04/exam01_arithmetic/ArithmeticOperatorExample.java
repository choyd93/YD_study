package sec04.exam01_arithmetic;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4); //���� 2, �Ҽ��� �����ϰ� �����κи� ����
				
		int result5 = v1 % v2;
		System.out.println("result5=" + result5); //���� 1, �������ؼ� ���������� ����
		//���� �������� ���� ����� Ȯ���� �� ���. �������� 0���� ������ �� ���� ����ΰ����� Ȯ��.
		
		double result6 = (double)v1 /v2;
		System.out.println("result6=" + result6); //���� 2.5, �Ҽ����� ���� �� �ְԲ� �Ǽ� ���� Ÿ�� ���.
		//������ ������ ����ϸ� ����, ���� �ϳ��� �Ǽ��� �Ǽ��� ���� ����
		

	}

}