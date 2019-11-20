package chap08_multiple_interface;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision st = new SmartTelevision();
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(10);
//		rc.search();	// ���� : �Ұ��� (RemoteControl Ÿ��)
		Searchable s = (Searchable)rc;	// ���� ������ ���� SmartTelevision�̹Ƿ�
		s.search("http://www.naver.com");
		rc.turnOff();
	}

}
