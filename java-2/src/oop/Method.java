package oop;

/*형식
 * 자료형 메소드명(자료형 변수명, 자료형 변수명, ....){
 * 	명령; 
 * }
 *  반환형(return type): 메소드를 호출하여 얻을 수 있는 결과값의 자료형
 *  
 *  void: 무반환형 - 메소드를 호출하여 얻을수 있는 결과값이 없는 경우 사용하는 자료형
 *  => 매개변수(parameter-인자 : argument): 메소드의 명령을 실행하기 위해 메소드 호출시 
 *     값을 전달받아 저장하기 위한 변수
 *     
 * 메소드 호출(method invoke): 메소드를 호출해야 메소드의 명령이 실행되어 기능 제공
 * 형식) 객체.메소드명(값, 값)
 * 
 * return: 메소드를 종료하는 키워드
 * 형식1) if (조건식) return; => 조건식의 결과가 잠인 경우 메소드 종료 -)반환형 void
 * 형식2) return 대상;  ->메소드 종료시 대상의 값을 반환하여 메소드를 호출한 명령에게 제공
 *  => 메소드의 반환형과 반환되어지는 대상의 자료형이 동일하도록 해야한다.
 */

//메소드 없는 클래스는 존재 가치 X

public class Method {
	void displayOne() {
		System.out.println("### display displayOne() method ### ");
	}
	
	void displayTwo() {
		System.out.println("### display displayTwo() method ### ");
	}
	
	void printOne() {
		int tot=0;
		for (int i=1; i<=100; i++) {
			tot+=i;
		}
		System.out.println("total: "+tot);
	}
	
	//매소드 호출시 매개변수의 갑이 정상적으로 전달되어 저장되야 메소드가 호출
	void printTwo(int num) {
		//매개변수에 저장된 값 검증
		
		//비정상적인 값
		if (num<0) {
			System.out.println("0보다 큰 정수값이 저장되어야 합니다");
			return;
		}
		int tot=0;
		for (int i=1; i<=num; i++) {
			tot+=i;
		}
	System.out.println("total: "+tot);
	}
	
	void printThree(int num1, int num2) {
		
		if (num1>num2) {
			System.out.println("첫번째 값이 두번째 값보다 작아야 합니다");
			return;
		}
		
		int tot=0;
		for (int i=num1; i<=num2; i++) {
			tot+=i;
		}
		System.out.println("범위의 합계: "+tot);		
	}
	
	int returnTot(int num1, int num2) {
		if (num1>num2) {
			int temp = num1;
			num1 =num2;
			num2 = temp;
		}
		
		int tot=0;
		for (int i=num1; i<=num2; i++) {
			tot+=i;
		}
		return tot;
	}
	
	//매개변수로 정수값을 전달받아 홀짝수 구분하여 반환하는 메소드
	// false:홀수 true: 짝수
	
	boolean isOddEven(int num) {
		if (num%2!=0)
			return false;
		else 
			return true;
	}
	
	//배열을 반환하는 메소드
	int[] returnArray(){
		/*
		int[]array = {10,20,30,40,50};
		return array;
		*/
		
		//ERROR return {10,20,30,40,50};
		return new int[]{10,20,30,40,50};	
	}
	
	int sumOne(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	int sumTwo(int[] array) {
		int tot=0;
		for (int num:array)
			tot+=num;
		return tot;
	}
	
	//매개변수 생략 기호 (...)를 사용하여 매개변수 선언한 경우
	//값을 0개 이상 전달받아 저장 가능
	//배열로 처리
	int sumThree(int...array) {
		int tot=0;
		for (int num:array)
			tot+=num;
		return tot;
	}
}
