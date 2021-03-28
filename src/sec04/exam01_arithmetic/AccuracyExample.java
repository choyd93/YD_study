package sec04.exam01_arithmetic;

public class AccuracyExample {

	public static void main(String[] args) {
		/*double result = 7 * 0.1;
		System.out.println(result); 
		결과값은 0.7000000000000001 실수로 나옴.
		*/
		
		int apple = 1;
		double pieceUnit = 0.1; //실수가 있어서 결과값이 실수로 나옴.
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("07 조각을 빼면");
		System.out.println(result + "조각이 남는다.");
		
		/* 결과값은
		사과 한개에서
		07 조각을 빼면
		0.29999999999999993조각이 남는다.
		실수 연산은 가급적 피하고 정수연산을 한다.
		*/
	}

}
