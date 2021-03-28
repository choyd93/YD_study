package sec04.exam03_compare;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //결과값은 true
		
		double v4 = 0.1;
		float v5 = 0.1f; //float 타입은 정밀도에서 double과 차이가 있어서 같은 값이지만 false가 나옴.  
		System.out.println(v4 == v5); //결과값은 false
		System.out.println((float) v4 == v5); //결과값은 true, float을 double로 강제변환 후 비교
		System.out.println((int)(v4*10) == (int)(v5*10)); //실수타입을 정수로 변환하고 int로 변환하면 걸과값은 true 
	}

}
