package exercise;

import java.util.Scanner;

public class exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentnum =0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int sum =0;
		int max =-1;
		double avg = 0;
		
		while(run) {
			System.out.println("_____________________________________________");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("_____________________________________________");
			System.out.print("����> ");
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				System.out.print("�л���> ");
				studentnum =scanner.nextInt();
				scores = new int[studentnum];
			}else if(selectNo==2) {
				for(int i =0;i<studentnum;i++) {
					System.out.print("socre["+i+"]> ");
					scores[i] =scanner.nextInt();
			}} else if(selectNo==3) {
				for(int i =0;i<studentnum;i++) {
					System.out.println("score["+i+"]>"+scores[i]);
				}
			}else if(selectNo ==4) {
				max = -1;
				for(int i =0;i<studentnum;i++) {
					if(max<scores[i])
						max =scores[i];
					sum += scores[i];
				avg= (double) sum / studentnum;
				}
				System.out.println("�ְ���> "+max);
				System.out.println("�������> "+avg);
			}else if(selectNo==5) {
				run =false;
			}
			}
		}

	}

