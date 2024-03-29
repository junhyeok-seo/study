package chap08_polymorphism;

public class HanKookTire implements Tire {
	// 필드 : Tire Class에서 정의됨 -> 구현 클래스
	String location;
	int maxRotation;
	int accumulatedRotation;
	
	// 생성자
	public HanKookTire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// Tire 인터페이스의 메소드를 재정의
	// 바퀴가 굴러가는 동작 : 수명, 누적회전수, 펑크, 위치를 반환
	@Override
	public boolean roll() {
		accumulatedRotation++;	// 바퀴가 회전
		if(accumulatedRotation < maxRotation) {	// 계속 사용
			System.out.println(location + " HanKookTire 남은 수명 :"
					+ (maxRotation - accumulatedRotation));
			return true;	// 계속 사용 가능
		}
		else {
			System.out.println("*** " + location + " HanKookTire 펑크 ****");
			return false;
		}
	}

}
