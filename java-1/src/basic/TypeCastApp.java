package basic;

/*형변환(TypeCast) : 값의 자료형을 일시적으로 변환하여 사용하는 방법
  => 자동 형변화(JVM), 강제 형변환
*/
public class TypeCastApp {
	public static void main(String[] args) {
		//자동 형변환
		// byte < short < int < long < float < double
		// ex)int + double => double
		System.out.println("결과 = " + (3+1.5));

		double su = 10; //10 >> 10.0
		System.out.println(su);

		//정수 나누기 정수는 실수가 안나옴
		System.out.println(95/10);
		System.out.println(95.0/10);

		int kor =95;
		int eng =90;
		int tot = kor+eng;
		// 2 로나누면 int 결과 나옴
		double avg = tot/2.0;

		System.out.println(avg);
		System.out.println("====================================");

		//강제 형변환
		// 변환하여 명령을 작성하는 방법 - (자료형)값
		int num = (int)12.3; // (int)12.3 = 12
		System.out.println(num);

		int num1=95;
		int num2 =10;

		double num3 = (double)num1/num2;
		System.out.println(num3);
		System.out.println("====================================");

		double numb1 =1.23456789;
		System.out.println("numb1 = "+numb1);
		
		//소수점 2자리 까지만 출력되도록 명령작성
		//1.23456789*100 = 123.4566789
		//(int)123.456789 = 123
		//123/100.0 = 1.23 
		System.out.println("numb1(내림) = "+ (int)(numb1*100)/100.0);
		System.out.println("numb1(반올림) = "+ (int)(numb1*100+0.5)/100.0);
		System.out.println("numb1(올림) = "+ (int)(numb1*100+0.9)/100.0);
		System.out.println("====================================");
	}
}
