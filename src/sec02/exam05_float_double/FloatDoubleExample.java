package sec02.exam05_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		//실수값 저장
		double var1 = 3.14;
		//float var2 = 3.14;
		float var3 = 3.14F;
		
		//정밀도 검사
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println(var4);
		System.out.println(var5);
		
		/* 값은
		0.12345678901234568
		0.12345679 

		float은 23비트까지 저장
		double은 52비트까지 저장 */
		
		//e사용하기
		int var6 = 3000000;
		double var7 = 3e6; //3백만, 부동소수점 방식인 실수타입
		float var8 = 3e6F; //float타입이라서 뒤에 F 붙임.
		double var9 = 2e-3;
		
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
	}
}
