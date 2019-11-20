package study;

public class Arthmatic {

	public static void main(String[] args) {
		int num =0x0011;
		int snum = num<<2; //왼쪽으로 2비트 이동  4배
		int rnum = num>>2; // 오른쪽으로 2 비트 이동 1/4
		int threeShift = num >>>2; // 오른족으로 2비트이동
		System.out.printf("num = %x\n",num);
		System.out.printf("snum = %x\n",snum);
		System.out.printf("rnum = %x\n",rnum);
		System.out.printf("threeShift = %x\n",threeShift);
	}

}
