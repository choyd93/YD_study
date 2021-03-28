package sec04.exam01_arithmetic;

public class CheckOverflowExample {

	public static void main(String[] args) {
	try {
		int result = safeAdd(2000000000, 2000000000);
		System.out.println(result);

	} catch(ArithmeticException e) {
		System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
}
	}
	
	public static int safeAdd(int left, int right) {
		if(right>0) {
			if(left>(Integer.MAX_VALUE-right)) { 
				//int가 가질 수 있는 최대값에서 right를 뺀값보다 left가 더 크다면
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(left<(Integer.MAX_VALUE-right)) {  
				throw new ArithmeticException("오버플로우 발생");
		}
}
	
		return left + right;
	}
	}