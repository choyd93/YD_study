package sec03_exam03_deny_logic;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play); //값은  true
		
		play = !play;
		System.out.println(play); //값은  false
		
		play = !play;
		System.out.println(play); //값은  true
	}

}
