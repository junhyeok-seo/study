package chap08_polymorphism;

public interface Tire {
	// 추상 메소드 : 반환형, 메소드이름, 매개변수 -> 규격화
	// 바뀌가 굴러가는 동작 : 수명, 누적회전수, 펑크, 위치를 반환
	public boolean roll();
}
