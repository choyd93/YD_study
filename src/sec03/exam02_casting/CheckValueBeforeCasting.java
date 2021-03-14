package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
/*		
		int i = 125; //i가 125면 125값 출력, 128이면 false
		
		if(i<-128 || i>127) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		} else {
		
		byte b = (byte) i; 
		System.out.println(b);
	}
	}

}*/
		

		int i = 125; 
		
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) { //검사코드. Byte는 클래스 타입이므로 첫자는 대문자로 입력
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		} else {
		
		byte b = (byte) i; 
		System.out.println(b);
	}
	}

}
		
	
		
