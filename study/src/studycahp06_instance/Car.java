package studycahp06_instance;

public class Car {
int speed;
String model;
String color;

public static int maxseatnum;
public Car() {}
public void setspeed(int s) {
	speed =s;
}
public int getspeed() {
	return speed;
}
public static void changebattery() {
	System.out.println("배터리를 교환합니다.");
}
}
