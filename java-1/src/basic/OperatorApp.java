// 연산자(Operator): 계산을 목적으로 제공되는 기호 또는 키워드
// 피연산자 : 연산자에 의해 계산될 값의 의미
// 단항연산자(피연산자1개), 이항연산자(피연산자2개).... 
// 일반 연산자는 왼쪽에서 오른쪽으로 처리되지만 
// 단항 연산자와 대입연산자는 오른쪽에서 왼쪽으로 처리
// ex) 10+20+30    a=b=c
//     ------->    <---- 
package basic;

public class OperatorApp {
	public static void main(String[] args) {
		//최우선 연산자 : 우선처리 연산자: (), 배열연산자: [] 
		System.out.println("10+20*3 = "+(10+20*3));
		System.out.println("(10+20)*3 = "+((10+20)*3));
		System.out.println("====================================");
		
		//! : not 연산자 - false or true를 반대로 변환하는 연산자
		//++ : 피연자가 반드시 변수로 변수값을 1증가 시키는 연산자
		//-- : 피연자가 반드시 변수로 변수값을 1감소 시키는 연산자
		
		int a1 = 10;
		
		System.out.println("a1 = "+a1);
		System.out.println("-a1 = "+-a1);
		System.out.println("====================================");
		System.out.println("20>10 = "+ (20>10));
		System.out.println("!(20>10) = "+ !(20>10));
		
		int a2=10;
		int a3=10;
		
		System.out.println("a2 = "+a2+" a3 = "+a3);
		
		//연산식으로만 구현된 단일 명령일 경우 똑같음
		++a2;
		--a3;
		System.out.println("++a2 = "+a2+" --a3 = "+a3);
		
		a2++;
		a3--;
		System.out.println("a2++ = "+a2+" a3-- = "+a3);
		System.out.println("====================================");
		
		int a4 = 10;
		int a5 = 10;
		
		int result1 = ++a4; //1을 먼저 증가 시키고 그 값을 result1에 저장힌다 (전처리)
		int result2 = a5++; // result2=a5 연산식 실행 후 a5++ 연산식 실행 (후처리)
		
		System.out.println("a4 = "+a4+ " a5 = "+a5);
		System.out.println("result1 = "+result1+ " result2 = "+result2);
		System.out.println("====================================");
		
		//2항연산자
		//=> 산술 연산자, 이동 연산자, 비교 연산자, 논리 연산자, 대입 연산자
		//산술 연산자 : *(곱) /(나눔) %(나머지) +(합) -(차)
		int b1 = 20;
		int b2 = 10;
		
		System.out.println(b1+"*"+b2+ " = " + (b1*b2));
		System.out.println(b1+"/"+b2+ " = " + (b1/b2));
		System.out.println(b1+"%"+b2+ " = " + (b1%b2));
		System.out.println(b1+"+"+b2+ " = " + (b1+b2));
		System.out.println(b1+"-"+b2+ " = " + (b1-b2));
		System.out.println("====================================");
		
		//이동 연산자 >>, <<
		//ex) 50(10) - 4byte: 00000000 00000000 00000000 00110010
		//    50 << 3       : 00000000 00000000 00000001 10010000 : 400
		
		//비교 연산자 : 값을 비교하고 false or true 중 하나의 결과 나타냄
		// <, >, <=, >=, !=, ==
		
		//논리 연산자 - Bit 논리 연산자, 일반논리연산자
		// bit 논리 연산자 : 정수값을 bit 단위로 계산하기 위한 연산자 &9논리곱), ^(베타곱)
		// 일반 논리 연산자: 비교 연산식을 연결하기 위한 연산자 &&(and), ||(or) 
		
		int c = -20;
		System.out.println("c = " +c);
		System.out.println("c >=  10 && c <= 30 : " +(c >=  10 || c <= 30));
		System.out.println("c <  10 || c > 30 : " +(c >=  10 || c <= 30));
		System.out.println("====================================");
		
		//대입 연산자: 왼쪽 피연산자에 값을 저장하기 위한 연산자
		//복합 대입 연산자 : *=, /=, +=, -=
		// 무조건 마지막에 실행됨
		
		int d = 10;
		d+=20; // d=d+20;
		System.out.println("d = "+d);
		
		//삼항 연산자 : 피연산자의 갯수가 3개인 연산자 
		// 조건식? 참값:거짓값 -조건식의 결과가 true 인 경우 
		// 조건식 : false 또는 true 중 하나의 결과값을 제공하는 연산식
		
		int e1=10, e2=20;
		//e1>e2 true 일 경우 왼쪽값을 쓰고 false 면 오른쪽 값을 써라
		System.out.println("큰값: " + (e1>e2 ? e1:e2));
		
		int e3 = 10;
		System.out.println(e3+ " : "+ (e3%2==0? "짝수":"홀수"));
		
	}
	
}
