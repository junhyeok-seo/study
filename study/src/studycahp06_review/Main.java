package studycahp06_review;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("속도: "+myCar.speed);
		myCar.company="기아";
		Car car2= new Car("현대");
		Car car3=new Car("BMW","520");
	}

}
