package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		/*int x = 5;
		double y = 0.0;
		
		//double z = 5/y;
		double z = 5%y;
	
		System.out.println(z + 2); //������ �����ϵ� ���� ���� ����. ����� NaN
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("�� ���� �Ұ�");
		} else {
		
		System.out.println(Double.isInfinite(z)); //������� ���Ǵ�Ʈ�� Ʈ��
		System.out.println(Double.isNaN(z)); //������� NaN�̸� Ʈ��
		
				System.out.println(z + 2);
		}*/
		
		int x = 5;
		int y = 0;
		
		try {
		int z = x/y;
		System.out.println("z=" + z);

	} catch(ArithmeticException e) { //���ܰ� ������ ����
		System.out.println("0���� ������ �ȵ�");
	}
}
}