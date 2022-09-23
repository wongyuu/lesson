package example;

import java.util.Scanner;
//키보드로 정수값을 입력받아 1~9 범위의 정수값을 곱한 결과를 출력하는 프로그램을 작성하세요.
//단,키보드로 입력된 정수값은 2~9 범위의 정수값만 허용하면 범위를 벗어난 정수값을 입력한 경우
//에러 메세지 출력 후 재입력하도록 프로그램 작성
//ex) 단 입력[2~9] >> 7
//  7 * 1 = 7
//  ...
//  7 * 9 = 63

public class GuGudanExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("구구단 입력[2~9] >> ");
			int input = scanner.nextInt();
			/*
			 *  if(input>=2 && input<=9) break;
			 *  } // close while loop 
			 *  
			 *  System.out.println("다시 입력해주세요");
			 *  
			 *  for (int i=1; i<=9; i++) {
					System.out.println(input+" * "+i +" = " + input*i);
				}
			 */
			if(input>=2 && input<=9) {
				for (int i=1; i<=9; i++) {
					System.out.println(input+" * "+i +" = " + input*i);
				}
				break;
			}
			
			System.out.println("다시 입력해주세요");
		}	
	}
}

