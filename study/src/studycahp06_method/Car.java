package studycahp06_method;

public class Car {
int speed;
int seatnum;
String color;
int gas;

public Car() {}
public Car(String color) {
	this.color = color;
}
public void speedup(int amount) {
	speed += amount;
}
public void setspeed(int speed) {
	this.speed = speed;
}
public int getspeed() {
	return speed;
}
public void turnleft() {
	System.out.println("좌회전을 합니다 ");
}
public void stop() {
	System.out.println("정지합니다");
}
public void gas(int gas) {
	this.gas=gas;
}
public void drive() {
	gas--;
}
public int getgas() {
	return gas;
}
}
