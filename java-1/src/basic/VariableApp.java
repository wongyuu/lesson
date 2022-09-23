//리터럴(literal) : 프로그램에서 표현되는 값
//변수(variable)  : 값을 저장하기 위해 메모리에 부여된 이름

//변수 선언 해야함
//형식 - 자료형 변수명
//자료형(data Type) : 변수에 저장될 값에 대한 형태 - 원시형(primitive) or 참조형 (reference Type)
//변수명 : 값을 저장하기 위한 메모리를 구분하기 위해 사용되는 식별자

//식별자 작성 규칙 : 영문, 숫자, 특수문자 (_ or $), 숫자로 시작 불가, 대소문자 구별
//식별자 작성 표기 : 파스칼 (PascalCase), 카멜, 스네이크 표기법
// 카멜 표기법 : 첫번째 단어를 제외한 조합된 단어의 첫문자를 대문자로 표현 (변수, 메소드)
// 스네이크 표기법 : 단어를 _로 구분하혀 식별자 작성 (상수작성시 사용)
package basic;

public class VariableApp {
	public static void main(String[] args) {
		int su; //정수값을 젖ㅇ하기 위한 변수 선언
		su = 100; //100을 su에 저장하다 좌에서 우로
		System.out.print("초기값 : ");
		System.out.println(su);
		
		su = 200;
		System.out.print("변경값 : ");
		System.out.println(su);
		System.out.println("===============================");
		System.out.println();
		
		int num = 100;
		System.out.println("num = " + num);
		System.out.println("===============================");
		System.out.println();
		
		System.out.println("올해는 " + 2+0+2+2 + "년 입니다");
		System.out.println("===============================");
		System.out.println();
		
		System.out.println(2+0+2+2 + "년은 호랑이띠해 입니다");
		System.out.println(2022 + "년은 호랑이띠해 입니다");
		//""-> NullString 문자가 하나도 없는 문자열 
		System.out.println( "" + 2+0+2+2 + "년은 호랑이띠해 입니다");
		 
		System.out.println("===============================");
		System.out.println();
		
		int num1 = 100, num2 = 200;
		System.out.println("연산결과 : " + num1+num2);
		// ()를 사용하여 먼저실행되도록 설정 가능
		System.out.println("연산결과 : " + (num1+num2));
		System.out.println("===============================");
		System.out.println();
		
		System.out.println("연산결과 : " + num1*num2);
		//이게 더 나음
		System.out.println("연산결과 : " + (num1*num2));
		System.out.println("===============================");
		System.out.println();

		int kor = 88, eng = 90;
		int tot = kor + eng; //합계 
		
		System.out.println("점수합계 : " + tot);
		System.out.println("===============================");
		System.out.println();

		//변수에 값이 없을 경우 에러 
		//int count;
		//System.out.println("count = "+count);
		
		//에러 
		//int count = 10.0;
		
	}
	
}