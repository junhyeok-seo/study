package study;

import java.util.Calendar;
import java.util.Scanner;

public class EnumExample {

	public static void main(String[] args) {
	Week now =Week.MONDAY;
	Calendar cur =Calendar.getInstance();
	int year =cur.get(Calendar.YEAR);
	System.out.println("년도 "+year);
	int month =cur.get(Calendar.MONTH);
	int date =cur.get(Calendar.DATE);
	System.out.println(year+"년"+(month+1)+"월"+date+"일");
	cur.add(Calendar.YEAR, 1);
	cur.set(2020,10,11);
	System.out.println("2020/11/11 ;"+cur.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	if(now==Week.MONDAY) {
		System.out.println("월요일입니다");
	}else if(now==Week.TUESDAY) {
		System.out.println("화요일입니다");
	}
	System.out.println(now);
	int diff = now.compareTo(Week.FRIDAY);
	System.out.println(diff);
	Scanner scanner = new Scanner(System.in);
	String week =scanner.next();
//	Week w1 =week.valueOf(week)
	int num =12;
	String str =String.valueOf(str)
	}

}
