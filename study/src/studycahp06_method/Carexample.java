package studycahp06_method;

public class Carexample {

	public static void main(String[] args) {
	Car car1 = new Car();
	car1.gas(40);
	for(int i=0;i<20;i++) {
		car1.drive();
	}
	car1.speedup(20);
	car1.speedup(-10);
	car1.stop();
	}

}
