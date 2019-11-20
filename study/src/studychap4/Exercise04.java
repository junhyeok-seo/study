package studychap4;

import java.util.Random;

public class Exercise04 {

	public static void main(String[] args) {
		int a=0, b=0;
		while(a+b!=5) {
	        a=rand();
	         b=rand();
	         System.out.println("(" +a+", "+b+")");
			
		}

	}
	   private static int rand() {
		      
		      return (int)(Math.random()*6+1);
		      
		   }
}
