package basic;

/*
 * for : 명려에 대한 반복 횟수가 정해져 있는 경우 사용되는 명령
 * for loop 형식 for (초기식; 조건식; 증감식) {명령..}
 * 초기식 : 변수의 초기값을 저장하는 연산식
 * 증감식 : 변수값을 증가 또는 감소하는 연산식
 * 조건식의 결과가 거짓인 경우 for 구문 종료, 참일 경우 무한반복
 */

/*
 * Debug perspective 사용
 * breakpoint 라인숫자 더블 클릭  => 그 전줄 까지만 런함 
 * [F6] Step over : 현재 클래스에서 명령을 하나씩 실행
 * 프로그램 강제 종료 ctrl F2
 */
public class ForApp {
	public static void main(String[] args) {
		//java programming 출력
		System.out.println("java programming");
		System.out.println("===============================================================");
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("java programming");
		}
		
		System.out.println("===============================================================");
		
		for (int i = 5; i >= 1; i--)
		{
			System.out.println("java programming");
		}
		
		System.out.println("===============================================================");
		// 1	2	3	4
		for (int i =1; i <=5; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		for (int i = 5; i >= 1; i--)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//method1
		for (int i =1; i <=5; i++) {
			System.out.print(2*i+"\t");
		}
		System.out.println();
		
		//method2
		for (int i =2; i <=10; i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//method3
		for (int i =1; i <=10; i++) {
			if (i%2==0) {
				System.out.print(i+"\t");
			}	
		}
		System.out.println();
		System.out.println("===============================================================");
		
		//1-100까지의 합
		int tot = 0;
		for (int i=1; i<=100; i++)
		{
			//tot = tot+i;
			tot +=i;
		}
		
		System.out.println(tot);
		System.out.println("===============================================================");
		
		//두 변수의 저장된 정수값 범우ㅏ의 합계를 계산하여 출력
		
		/*int start = 20; 
		int end = 80;
		int sum = 0;
		
		for (int i= start; i<=end; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		*/
		
		int start = 80; 
		int end = 20;
		
		if (start>end) {
			System.out.println("Start > End");
			//프로그램 강제 종료
			//System.exit(0);
		}
		System.out.println(start+ " "+ end);

		
		//변수 저장된값 바꾸는법
		int temp = start;
		start = end;
		end = temp;

		System.out.println(start+ " "+ end);
		System.out.println("===============================================================");
		
	}
}
