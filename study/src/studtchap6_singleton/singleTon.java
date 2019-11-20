package studtchap6_singleton;

public class singleTon {
private static singleTon instance =new singleTon();
private singleTon() {
	
}
public static singleTon getInstance() {
	return instance;
}
int data[] = new int[10];  
}
