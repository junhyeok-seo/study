package studychap4;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
	boolean run = true;
	
	int balance =0;
	int menu;
	int value;
	Scanner scanner = new Scanner(System.in);
	while(run) {

		System.out.println("_____________________________");
		System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
		System.out.println("_____________________________");
		System.out.print("���� >");
		
		menu = scanner.nextInt();
		if(menu ==1) {
			System.out.print("���ݾ�>");
			value = scanner.nextInt();
			balance += value;
		}else if(menu==2) {System.out.print("��ݾ�>");
		value = scanner.nextInt();
		if(balance>value)
		balance -= value;
		else
			System.out.println("�ܰ����");
	}else if(menu==3) {System.out.print("�ܰ�>"+balance);

	} else if(menu==4) {
		
		run=false;
		}
	else { System.out.println("�ùٸ� ������ �Է��ϼ���");
	}
		System.out.println("���α׷�����");
}
}
}