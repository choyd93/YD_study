package sec01.exam01_variable;

public class LiteralExample {
	public static void main(String[] args) {
		int var1 = 10; //10����
		System.out.println(var1);
		
		int var2 = 010; //8���� ���
		System.out.println(var2);
		
		int var3 = 0x10; //16���� ���
		System.out.println(var3);
		
		double var4 = 0.25;
		System.out.println(var4);
		
		double var5 = 2E5;
		System.out.println(var5);
		
		char var6 = 'A';
		System.out.println(var6);
		
		char var7 = '��';
		System.out.println(var7);
		
		System.out.println("\t" + "�鿩����");
		System.out.println("����" + "\n" + "�α�");
		System.out.println("This" + '\'' + "s Java");
		System.out.println("�̰���" + '\"' + "�߿�" + '\"' + "�մϴ�");
		System.out.println("������" + '\\' + "300�Դϴ�.");
		
		char var8 = '\u0041'; // ''�� ���ݺ��� 4�ڸ� 16������ �Ǿ��ִ� �����ڵ�� �ڵ��ϰڴٴ� ��
		System.out.println(var8);
		
		System.out.println("����" + "�α�");
		System.out.println("Java" + 8);
		
		String var9 = "�ڹ�";
		
		boolean var10 = true;
		boolean var11 = false;
		System.out.println(var11);
	}
}