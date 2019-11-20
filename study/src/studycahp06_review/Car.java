package studycahp06_review;

public class Car {
	int speed;
	int seatnum;
	String owner;
	String company;
	String model;
	
	public Car(String company,String m) {
		this.company=company;//매개변수와 필드 구분을 위해 this사용
		model=m;//this생략가능
	}
	//public Car(String company,String owner) {
		//this.company=company;
		//this.owner=owner;
//}	

	public Car(int speed,String model) {
		this.speed=speed;
		this.model=model;
		
}	
	public Car(String company) {
	this(company,"소나타");
	System.out.println("Car(String company)");
}	
	public void speedUp(int speed) {
		this.speed =speed;
	}
}
