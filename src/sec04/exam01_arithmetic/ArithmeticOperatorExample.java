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
		System.out.println("result4=" + result4); //값은 2, 소수점 제외하고 정수부분만 저장
				
		int result5 = v1 % v2;
		System.out.println("result5=" + result5); //값은 1, 나누기해서 나머지값을 저장
		//보통 나머지를 통해 배수를 확인할 때 사용. 나머지가 0으로 나오면 그 수의 배수인것으로 확인.
		
		double result6 = (double)v1 /v2;
		System.out.println("result6=" + result6); //값은 2.5, 소수점도 나올 수 있게끔 실수 더블 타입 사용.
		//정수와 정수를 계산하면 정수, 둘중 하나가 실수면 실수로 값을 저장
		

	}

}
