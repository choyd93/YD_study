package sec03_exam02_increase_decrease;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------");
		x++;
		++x;
		System.out.println("x=" +x); //값은 x=12
		
		System.out.println("-------------");
		y--;
		--y;
		System.out.println("y=" +y); //값은 y=8
		
		System.out.println("-------------");
		z = x++;
		System.out.println("z=" +z); //결과값은 z=12, 원래 x값이 z에 저장된 후 출력. 증감연산자는 그 후에 계산
		System.out.println("x=" +x); //결과값은 x=13, 증감연산자가 반영된 값 출력
		
		System.out.println("-------------");
		z = ++x;
		System.out.println("z=" +z); //결과값은 z=14, 증감연산자 계산 후 출력
		System.out.println("x=" +x); //결과값은 z=14, 
		
		System.out.println("-------------");
		z = ++x + y++;
		System.out.println("z=" + z); //값은 23, x 먼저 증감하여 15 + 8 =23, 출력한 후 y증감
		System.out.println("x=" + x); //값은 증감하여 15
		System.out.println("y=" + y); //값은 모든 계산 이후 증감하여 9
		 
		
		
		
	}

}
