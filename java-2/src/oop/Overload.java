package oop;

public class Overload {
	public void displayInt(int param) {
		System.out.println("정수값: "+param);
	}
	
	public void displayBoolean(boolean param){
		System.out.println("논리값: "+param);
	}
	
	public void displayString(String param){
		System.out.println("문자열: "+param);
	}
	
	//method overload: 클래스에 동일한 기능을 제공하는 메소드가 매개변스에 의해
	//                 여러개 선언하는 경우 메소드 이름을 같도록 하는 기능
	// 매개변수의 자료형 또는 갯수가 같지 않도록 선언
	// 접근 지정자와 반환형은 overload와 무관함
	
	public void display(int param) {
		System.out.println("정수값: "+param);
	}
	
	public void display(boolean param){
		System.out.println("논리값: "+param);
	}
	
	public void display(String param){
		System.out.println("문자열: "+param);
	}
}
