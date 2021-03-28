package sec04.exam01_arithmetic;

public class AccuracyExample2 {

	public static void main(String[] args) {

		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp / 10.0;
		
		System.out.println("사과 한개에서");
		System.out.println("07 조각을 빼면");
		System.out.println(result + "조각이 남는다.");
		
		/* 결과값은
		사과 한개에서
		07 조각을 빼면
		0.3조각이 남는다.
		*/
	}
}
