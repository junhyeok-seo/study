package study;

public class Sompare {

	public static void main(String[] args) {
		String str1 ="홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		if(str1 == str2) {
			System.out.println("동일한 값니다");
		}else {
			System.out.println("다른객체이다");
		}
		if(str1 == str3) {
			System.out.println("동일한 값니다");
		}else {
			System.out.println("다른객체이다");
		}
		if(str1.contentEquals(str2)) {
			System.out.println("같은내용입니다");
		}else {
			System.out.println("다른객체입니다");
		}
		
	}

}
