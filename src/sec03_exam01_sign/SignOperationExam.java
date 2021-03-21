package sec03_exam01_sign;

public class SignOperationExam {

	public static void main(String[] args) {
		int x = -100;
		int result1= +x;
		int result2 = -x;
		
		System.out.println(result1);
		System.out.println(result2);
		
		short s = 100;
		//short result3 = -s; //부호 연산자가 붙으면 값은 int로 변경
		int result3 = -s;
		System.out.println(result3);
		
	}

}
