package studycahp06_review;

public class Car {
	int speed;
	int seatnum;
	String owner;
	String company;
	String model;
	
	public Car(String company,String m) {
		this.company=company;//�Ű������� �ʵ� ������ ���� this���
		model=m;//this��������
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
	this(company,"�ҳ�Ÿ");
	System.out.println("Car(String company)");
}	
	public void speedUp(int speed) {
		this.speed =speed;
	}
}
