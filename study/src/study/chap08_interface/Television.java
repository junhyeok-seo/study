package study.chap08_interface;

public class Television implements moteControl {

	@Override
	public void turnOn() {
		System.out.println("�ڷ������� �մϴ�.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("�ڷ������� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("�ڷ����� ������ "+volume+" �����մϴ�.");

	}

}
