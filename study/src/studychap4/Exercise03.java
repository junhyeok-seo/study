package studychap4;

public class Exercise03 {

	public static void main(String[] args) {
		int total =0;
		for(int i =0;i<101;i++) {
			if(i%3==0) {
				total += i;
			}
		}
		System.out.println(total);
	}

}
