package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {

		//int intValue = 44032; //int는 4바이트, char는 2바이트
		//char charValue = intValue;
		
		int intValue = 44032; //int는 4바이트, char는 2바이트
		char charValue = (char) intValue; //강제변환
		System.out.println(charValue); //결과값은 '가'
		
		long longValue = 500; //long은 8바이트, int는 4바이트
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14; //double은 실수타입, int는 정수타입
		intValue = (int) doubleValue;
		System.out.println(intValue); //결과값은 정수인 3
	}

}
