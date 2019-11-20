package review;

public class handphone {
public static final int BUSY =1;
public static final int IDLE =2;
public static final int RING =3;
int state = IDLE;
int power;
String model;
int datausage;
int monthlyfee;
handphone(String model,int fee){
	this.model =model;
	monthlyfee=fee;
}
handphone(int power, String model){
	this.power=power;
	this.model = model;
}
public handphone(int state, int power, String model, int datausage, int monthlyfee) {

	this.state = state;
	this.power = power;
	this.model = model;
	this.datausage = datausage;
	this.monthlyfee = monthlyfee;
}
public handphone(String model, int datausage, int monthlyfee) {
this(IDLE,0,model,datausage,monthlyfee);
//	this.model = model;
	//this.datausage = datausage;
	//this.monthlyfee = monthlyfee;
}


}
