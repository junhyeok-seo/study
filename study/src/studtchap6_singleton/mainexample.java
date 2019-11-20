package studtchap6_singleton;

import java.util.Calendar;

public class mainexample {

	public static void main(String[] args) {
//singleTon s = new singleTon();
singleTon s1 = singleTon.getInstance();
s1.data[0]=10;
System.out.println(s1.data[0]);
Calendar now =Calendar.getInstance();
System.out.println(now);
	}

}
