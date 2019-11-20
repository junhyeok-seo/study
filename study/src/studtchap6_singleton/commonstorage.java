package studtchap6_singleton;

public class commonstorage {
private static commonstorage in = new commonstorage();
private commonstorage() {}
public static commonstorage getIn() {
	return in;
}
int data =10;


}
