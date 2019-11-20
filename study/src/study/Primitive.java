package study;
/*
 * 데이터 타입 
 * char 2byte 국제어를 지원하기위해 유니코드를 지원 (0~2의16승 -1 까지 음수 없다)
	long 8byte c언어의 longlong에 대응
 * c언어의char는 자바에서는 byte와 같다
 * 실수 c언어와같다(float double)
 * 논리 참 과 거짓을 저장  1byte 크기
 */
public class Primitive {//클래스 이름은 대문자

	public static void main(String[] args) {// 메소드이름은 소문자
		// TODO Auto-generated method stub
			byte b1 =0x23;
			char c1 = '한';
			short s1 =432;
			int num = 30;
			long l1 = 234L;
			float f1 = 0.43f;
			double d1 =0.54;
			boolean flag = true;
			System.out.println("b1 =" + b1);
			System.out.println("c1 =" + c1);
			System.out.println("s1 =" + s1);
			System.out.println("num =" + num);
			System.out.println("l1 =" + l1);
			System.out.println(" f1 =" + f1);
			System.out.println("d1 =" + d1);
			System.out.println("flag =" + flag);
		
	}

}
