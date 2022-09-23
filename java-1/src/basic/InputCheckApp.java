package basic;

import java.util.Scanner;

public class InputCheckApp {
	public static void main(String[] args) {
		{
			Scanner scanner = new Scanner(System.in);
			/*
			System.out.print("점수 입력 : ");
			int score = scanner.nextInt();
			
			if (score<0||score>100) {
				System.out.println("ERROR");
				System.exit(0);
			}
			String grade = "";
			switch (score/10) {
			case 10:
			case 9: grade = "A";
				break;
			case 8: grade = "B";
				break;
			case 7: grade = "C";
				break;
			case 6: grade = "D";
				break;
			default:grade = "F"; 
			}
		
			int score = -1;
			while (score<0||score>100) {
				System.out.print("점수 입력 : ");
				score = scanner.nextInt();
				
				if (score<0||score>100) {
					System.out.println("out of range");
				}
			}
			
			String grade = "";
			switch (score/10) {
			case 10:
			case 9: grade = "A";
				break;
			case 8: grade = "B";
				break;
			case 7: grade = "C";
				break;
			case 6: grade = "D";
				break;
			default:grade = "F"; 
			}
			System.out.println("점수 : "+score +"결과 : "+grade);
				
			
			int score;
			do {
				System.out.print("score : ");
				score =scanner.nextInt();
				if (score<0||score>100) {
					System.out.println("ERROR Please re-enter");
				}
			}while(score<0||score>100);
			*/
			
			int score;
			while(true) {
				System.out.print("SCORE : ");
				score = scanner.nextInt();
				if (score>=0 && score<=100)
					break;
				System.out.println("ERORR Type again : ");
			}
			
			String grade = "";
			switch (score/10) {
			case 10:
			case 9: grade = "A";
				break;
			case 8: grade = "B";
				break;
			case 7: grade = "C";
				break;
			case 6: grade = "D";
				break;
			default:grade = "F"; 
			}
			System.out.println("점수 : "+score +"결과 : "+grade);
		}
	}
}
