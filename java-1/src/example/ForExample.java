package example;

public class ForExample {
	public static void main(String[] args) {
		//본인 이름을 화면에 7번 출력하세요.
		//ex) 홍길동 홍길동 홍길동 홍길동 홍길동 홍길동 홍길동
		String name ="홍길동";
		for (int i=0; i<7; i++)
		{
			System.out.print(name + " ");
		}
		System.out.println();
		System.out.println("=========================================");
		//1~10 범위의 정수 중 홀수를 화면에 출력하세요.
		//ex) 1     3     5     7     9
		for (int i=1; i<=5; i++)
		{	// (i%2 != 0)
			System.out.print(2*i-1+ "\t");
			
		}
		System.out.println();
		
		System.out.println("=========================================");
		//1~100 범위의 정수에서 3의 배수들의 합계와 5의 배수들의 합계를 계산하여
		//3의 배수의 합계에서 5의 배수의 합계를 뺀 결과값을 출력하세요.
		//ex) 결과 = 633
		int sum_three = 0;
		int sum_five = 0;

		
		for (int i=1; i<=100; i++){
			/*if (i%3 ==0)
			{
				sum_three += i;
			}
			*/
			if (3*i <=100) {
				sum_three += 3*i;	
			}
		}
		
		for (int i=1; i<=100; i++) {
			if (i*5 <=100)
				sum_five += 5*i;
			
		}	

		int output = sum_three - sum_five;
		System.out.println(output);
			
		System.out.println("=========================================");
		//구구단 중 7단을 화면에 출력하세요.
		//ex) 7 * 1 = 7
		//    7 * 2 = 14
		//    ...
		//    7 * 8 = 56
		//    7 * 9 = 63
		int dan = 7;
		for (int i=1; i<=9; i++){
			System.out.println(dan+" * "+ i+ " = " + (dan*7));

		}
		
		System.out.println("=========================================");
		//5!의 결과값을 출력하세요.(5! = 5 * 4 * 3 * 2 * 1)
		//ex) 5! = 120

		int factorial = 1;
		for (int i=1; i<=5; i++)
		{
			factorial *=i;
		}
		System.out.println(factorial);
		System.out.println("=========================================");
		//두 변수에 저장된 정수값 사이의 정수들을 화면에 출력하세요.
		//단, 한 줄에 정수값이 7개씩 출력되도록 프로그램을 작성하세요.
		//ex) 36    27    38     39     40     41     42
		//    43    44    45     46     47     48     49
		//    50    51    52     53     54     55     56
		//    57

		int counter = 0;
		
		for (int i= 36; i<=57; i++)
		{	
			//첫 숫자 출력
			System.out.print(i+"\t");
			
			//카운터 +1 
			counter++;
			
			//만약 카운터가 7이면 다음라인
			if (counter%7==0)
			{
				System.out.println();
			}	
		}
		
		
	}
	
}