package study;

public class Sompare {

	public static void main(String[] args) {
		String str1 ="ȫ�浿";
		String str2 = "ȫ�浿";
		String str3 = new String("ȫ�浿");
		if(str1 == str2) {
			System.out.println("������ ���ϴ�");
		}else {
			System.out.println("�ٸ���ü�̴�");
		}
		if(str1 == str3) {
			System.out.println("������ ���ϴ�");
		}else {
			System.out.println("�ٸ���ü�̴�");
		}
		if(str1.contentEquals(str2)) {
			System.out.println("���������Դϴ�");
		}else {
			System.out.println("�ٸ���ü�Դϴ�");
		}
		
	}

}
