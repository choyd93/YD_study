package sec04.exam01_arithmetic;

public class OverflowExample {

	public static void main(String[] args) {
		/*
		int x = 1000000;
		int y = 1000000;
		
		int z = x*y;
		System.out.println(z);
		int타입으로 저장해서 값이 마이너스 이상한 값으로 나옴.*/
		
		long x = 1000000;
		long y = 1000000;
		
		long z = x*y;
		System.out.println(z); //올바른 값 
	}

}
