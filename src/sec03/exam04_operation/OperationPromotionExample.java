package sec03.exam04_operation;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		//byte byteValue3 = byteValue1 + byteValue2;  바이트 연산은 인트로 저장되서 오류
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1); // 결과값은 30
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		//char charValue3 = charValue1 + charValue2; 인트로 자동 변환됬기 때문에 오류
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2); 
		//결과값은 66, A가 유니코드로 65이기 떄문
		
		System.out.println("출력문자" + (char)intValue2); //결과값은 B
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; 
		//2.5가 나와야 하지만 정수나누기 정수는 무조건 정수라서 소수점을 제외한2가 출력됨.
		System.out.println(intValue4); //결과값은 2
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; <- 실수리터럴(4.0)과 연산하면 모든 값을 double로 변환하여 계산
		double doubleValue1 = intValue5 / 4.0;
		System.out.println(doubleValue1); //값은 2.5
}
}