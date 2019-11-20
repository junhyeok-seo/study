package chap08_multiple_interface;

// 인터페이스는 여러 개를 구현 가능
public class SmartTelevision implements RemoteControl, Searchable /* 계속 필요하면 추가 가능 */ {

	// Seachable 추상 메소드 search() 재정의
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	// RemoteControl에 있는 추상 메소드를 재정의
	@Override
	public void turnOn() {
		System.out.println("스마트TV 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println(volume + "으로 설정");
	}

}
