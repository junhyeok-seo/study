package chap06_exercise;

public class accountexample {

	public static void main(String[] args) {
	account account =new account();
	account.setbalance(10000);
	System.out.println("ÇöÀçÀÜ°í "+account.getbalance);
	account.setbalance(-100);
	System.out.println("ÇöÀçÀÜ°í "+account.getbalance);

	account.setbalance(2000000);
	System.out.println("ÇöÀçÀÜ°í "+account.getbalance);

	account.setbalance(3000000);
	System.out.println("ÇöÀçÀÜ°í "+account.getbalance);


	}

}
