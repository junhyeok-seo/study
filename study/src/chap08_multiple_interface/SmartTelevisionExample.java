package chap08_multiple_interface;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision st = new SmartTelevision();
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(10);
//		rc.search();	// 에러 : 불가능 (RemoteControl 타입)
		Searchable s = (Searchable)rc;	// 원래 생성한 것이 SmartTelevision이므로
		s.search("http://www.naver.com");
		rc.turnOff();
	}

}
