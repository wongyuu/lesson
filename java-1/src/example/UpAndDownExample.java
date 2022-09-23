package example;

import java.util.Scanner;

//컴퓨터로부터 제공받은 정수 난수값을 키보드로 입력하여 맞추는 프로그램을 작성하세요.
// => 1~100 범위의 정수 난수값을 제공받도록 작성
// => 난수값을 맞출 수 있는 기회는 10번만 제공되도록 작성
// => 키보드 입력값이 1~100 범위가 아닌 경우 메세지 출력 후 재입력
// => 난수값과 입력값이 같은 경우 입력 횟수 출력 후 프로그램 종료
// => 난수값과 입력값이 다른 경우 "큰값 입력" 또는 "작은값 입력" 형식의 메세지 출력
// => 난수값을 10번 안에 맞추지 못한 경우 난수값이 출력되도록 작성
/*
public class UpAndDownExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner (System.in);
		System.out.println("숫자 1~100 중 맞춰보세요 기회는 10번");

		for (int i=1; i<=10; i++){
			System.out.print(i+"번째 시도 :");
			int input = scanner.nextInt();
			
			if (num==input) {
				System.out.println("축하드립니다!");
				break;
			}else if(num>input) {
				System.out.println("큰 값 입력");
			}else
				System.out.println("작은 값 입력");
		}
	}
}
*/

public class UpAndDownExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int ans = (int)(Math.random()*100)+1;
		boolean result = false;
		//10 chances
		for (int i=1; i<=10; i++){
			int input;
			while(true) {
				System.out.print(i+"번째 시도 :");
				input = scanner.nextInt();
				
				if(input>=1 && input<=100) break;
				
				System.out.println("[ERROR] Out of range");
			}

			if (ans==input) {
				System.out.println("축하드립니다!");
				result = true;
				break;
			}else if(ans>input) {
				System.out.println("큰 값 입력");
			}else
				System.out.println("작은 값 입력");
		}
		if (!result)
			System.out.println("정답은 "+ans+" 였습니다");
		scanner.close();
	}
}	
