package sec02.exam05_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		//�Ǽ��� ����
		double var1 = 3.14;
		//float var2 = 3.14;
		float var3 = 3.14F;
		
		//���е� �˻�
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println(var4);
		System.out.println(var5);
		
		/* ����
		0.12345678901234568
		0.12345679 

		float�� 23��Ʈ���� ����
		double�� 52��Ʈ���� ���� */
		
		//e����ϱ�
		int var6 = 3000000;
		double var7 = 3e6; //3�鸸, �ε��Ҽ��� ����� �Ǽ�Ÿ��
		float var8 = 3e6F; //floatŸ���̶� �ڿ� F ����.
		double var9 = 2e-3;
		
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
	}
}
