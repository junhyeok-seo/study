package study.chap08_interface;

public class Television implements moteControl {

	@Override
	public void turnOn() {
		System.out.println("텔레비전을 켭니다.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("텔레비전을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("텔레비전 볼륨을 "+volume+" 변경합니다.");

	}

}
