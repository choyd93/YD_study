package sec03_exam02_increase_decrease;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------");
		x++;
		++x;
		System.out.println("x=" +x); //���� x=12
		
		System.out.println("-------------");
		y--;
		--y;
		System.out.println("y=" +y); //���� y=8
		
		System.out.println("-------------");
		z = x++;
		System.out.println("z=" +z); //������� z=12, ���� x���� z�� ����� �� ���. ���������ڴ� �� �Ŀ� ���
		System.out.println("x=" +x); //������� x=13, ���������ڰ� �ݿ��� �� ���
		
		System.out.println("-------------");
		z = ++x;
		System.out.println("z=" +z); //������� z=14, ���������� ��� �� ���
		System.out.println("x=" +x); //������� z=14, 
		
		System.out.println("-------------");
		z = ++x + y++;
		System.out.println("z=" + z); //���� 23, x ���� �����Ͽ� 15 + 8 =23, ����� �� y����
		System.out.println("x=" + x); //���� �����Ͽ� 15
		System.out.println("y=" + y); //���� ��� ��� ���� �����Ͽ� 9
		 
		
		
		
	}

}
