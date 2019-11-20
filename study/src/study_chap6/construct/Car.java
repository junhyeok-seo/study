package study_chap6.construct;

public class Car {
	int speed;
	int seat;
	String model;
	String color;
	public Car() {}
	public Car(int speed) {
		this.speed =speed;
	}
	public Car(int speed,int seat) {
		this.speed =speed;
		this.seat=seat;
	}
	public Car(String model,String color,int seat) {
		this.model=model;
		this.color=color;
		this.seat=seat;
	}
}
