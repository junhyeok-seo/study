package chap06_exercise;

public class bankaccount {
private String ano;
private String owner;
private int balance;

public bankaccount(String ano,String owner, int balance) {
	this.ano =ano;
	this.owner=owner;
	this.balance = balance;
}

public String getano() {return ano;}
public void setano(String ano) {this.ano =ano;}
public String getowner() {return owner;}
public void setowner(String owner) {this.owner = owner;}
public int getbalance() {return balance;}
public void setbalance(int balance) {this.balance=balance;}
}



