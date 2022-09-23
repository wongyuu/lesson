package oop;

public class OverloadApp {
	public static void main(String[] args) {
		Overload overload = new Overload();
		
		//메소드 호출시 매개변수에 값을 잘못 전달한 경우 에러 발생
		//ex) overload.displayInt(false);
		overload.displayInt(100);
		overload.displayBoolean(false);
		overload.displayString("홍길동");
		System.out.println("==============================");
		
		//메소드 오버로드에 의한 다형성
		overload.display(100);
		overload.display(true);
		overload.display("임꺽정");
		System.out.println("==============================");
		
	}
}
