package study.chap08_interface;

public interface moteControl {
	public static final int MAX_VOLUME =10; 
	static final int MIN_VOLUME=0;
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���� �մϴ�.");
		}else {
			System.out.println("���� ������ �մϴ�.");
		}}
	static void changeBattery() {
		System.out.println("���͸��� ��ȯ�մϴ�.");
		
	}
}