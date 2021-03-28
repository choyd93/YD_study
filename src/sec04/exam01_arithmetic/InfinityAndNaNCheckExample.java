package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		/*int x = 5;
		double y = 0.0;
		
		//double z = 5/y;
		double z = 5%y;
	
		System.out.println(z + 2); //무엇을 연산하든 같은 같이 나옴. 결과값 NaN
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
		
		System.out.println(Double.isInfinite(z)); //결과값이 인피니트면 트루
		System.out.println(Double.isNaN(z)); //결과값이 NaN이면 트루
		
				System.out.println(z + 2);
		}*/
		
		int x = 5;
		int y = 0;
		
		try {
		int z = x/y;
		System.out.println("z=" + z);

	} catch(ArithmeticException e) { //예외가 나오면 실행
		System.out.println("0으로 나누면 안됨");
	}
}
}