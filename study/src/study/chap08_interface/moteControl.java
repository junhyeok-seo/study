package study.chap08_interface;

public interface moteControl {
	public static final int MAX_VOLUME =10; 
	static final int MIN_VOLUME=0;
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리를 합니다.");
		}else {
			System.out.println("무음 해제를 합니다.");
		}}
	static void changeBattery() {
		System.out.println("배터리를 교환합니다.");
		
	}
}