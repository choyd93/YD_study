package sec03_exam03_deny_logic;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		
		System.out.println(toBinaryString(v1) + "(십진수:" + v1 + ")");
		//값은 00000000000000000000000000001010(십진수:10) , int는 4바이트라서 32비트로 표현
		
		System.out.println(toBinaryString(v2) + "(십진수:" + v2 + ")");
		//값은 11111111111111111111111111110101(십진수:-11), 2진수로 표현된 값을 반대로 출력
		
		System.out.println(toBinaryString(v3) + "(십진수:" + v3 + ")");
		System.out.println(v2); //값은 -11
		System.out.println(v3); //값은 -10
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		
		System.out.println(toBinaryString(v4) + "(십진수:" + v4 + ")");
		// 11111111111111111111111111110110(십진수:-10)
		
		System.out.println(toBinaryString(v5) + "(십진수:" + v5 + ")");
		// 00000000000000000000000000001001(십진수:9)
		
		System.out.println(toBinaryString(v6) + "(십진수:" + v6 + ")");
		// 00000000000000000000000000001010(십진수:10)

		System.out.println(v5); //값은 9
		System.out.println(v6); //값은 10

	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = "0" + str;
		}
		return str;
	}

}
