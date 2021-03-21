package sec04.exam01_arithmetic;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1; //A(유니코드) = 65 + 1 = 66 = 'B'
		System.out.println(c1);
		//리터럴값을 산술하여 char 타입에 저장가능 //값은 B
		
		char c2 = 'A';
		//char c3 = c2 + 1; //<-불가능한 코드. 숫자와 산술하여 int타입으로 변환되기 때문에 char타입으로 저장 불가능
		
		int result = c2 + 1;
		System.out.println(result); //값은 66
		//변수(c2)를 가지고 산술할 때 int값으로 변환되기 때문에 int타입에 넣어야 함.
		
		char c3 = (char)result;
		System.out.println(c3); //값은 B, char 타입으로 강제변환하여 저장
	
	}

}
