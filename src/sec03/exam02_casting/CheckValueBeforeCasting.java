package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
/*		
		int i = 125; //i�� 125�� 125�� ���, 128�̸� false
		
		if(i<-128 || i>127) {
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���.");
		} else {
		
		byte b = (byte) i; 
		System.out.println(b);
	}
	}

}*/
		

		int i = 125; 
		
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) { //�˻��ڵ�. Byte�� Ŭ���� Ÿ���̹Ƿ� ù�ڴ� �빮�ڷ� �Է�
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���.");
		} else {
		
		byte b = (byte) i; 
		System.out.println(b);
	}
	}

}
		
	
		
