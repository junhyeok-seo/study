package study_chap6.construct;

public class CarExample {

	public static void main(String[] args) {
	Car myCar =new Car();
	System.out.println("�ӵ�: "+myCar.speed);
	
	Car Car1 =new Car(300);
	System.out.println("�ӵ�: "+Car1.speed);
	

	Car Car2 =new Car(400,4);
	System.out.println("�ӵ�: "+Car2.speed);
	System.out.println("�¼�: "+Car2.seat);
	
	//Car Car3 =new Car(4,"�׷���","���");
	Car Car4 =new Car("�׷���","���",4);

	
}
}