package study_chap6;

public class Myclass {
	int field1;
	String field2;
	public Myclass() {
		this.field1=10;
		field2="Çö´ë";
	}
	public void method1() {
		System.out.println("filed1 ="+field1);
	}
	public int method2(int a, int b) {
		return a+b;
	}
	public void setfield1(int field1) {
		this.field1=field1;
}
	public void setfield2(String f2) {
		field2=f2;
}
}
