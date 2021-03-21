package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue); //값은 10, 바이트가 인트로 변환
		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue); //값은 44032, char의 '가'가 인트로 변환되며 유니코드 44032 결고값 생성
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(intValue); //값은 500, 인트가 롱 타입으로 변환, 손실되지 않고 500 
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue); //인트가 더블로 변환
		
		longValue = 10000000000L;
		float floatValue = longValue; //롱타입이 8바이트고 플롯이 4바이트지만 롱타입이 플롯으로 변환
		System.out.println(floatValue);
}
}