package sec04.exam01_arithmetic;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0; //val에 들어 있는 NaN을 0.0으로 변환
		}
		//currentBalance = currentBalance + val;  (밑에 있는 코드와 동일한 뜻)
		currentBalance += val;
		
		
		System.out.println(currentBalance);
		/*결과값은
		NaN이 입력되어 처리할 수 없음
		10000.0
		*/
	}

}
