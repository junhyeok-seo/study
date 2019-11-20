package study_chap6.construct;

public class CarExample {

	public static void main(String[] args) {
	Car myCar =new Car();
	System.out.println("속도: "+myCar.speed);
	
	Car Car1 =new Car(300);
	System.out.println("속도: "+Car1.speed);
	

	Car Car2 =new Car(400,4);
	System.out.println("속도: "+Car2.speed);
	System.out.println("좌석: "+Car2.seat);
	
	//Car Car3 =new Car(4,"그랜져","흰색");
	Car Car4 =new Car("그랜져","흰색",4);

	
}
}