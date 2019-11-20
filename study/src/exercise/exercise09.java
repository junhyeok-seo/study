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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("_____________________________________________");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				System.out.print("학생수> ");
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
				System.out.println("최고점> "+max);
				System.out.println("평균점수> "+avg);
			}else if(selectNo==5) {
				run =false;
			}
			}
		}

	}

