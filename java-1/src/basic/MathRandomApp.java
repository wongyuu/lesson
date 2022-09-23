package basic;
// 난수값: 불규칙적으로 발생하는 숫자값
public class MathRandomApp {
	public static void main(String[] args) {
		//math class: 수학 관련 기능을 제공하는 클래스
		//Math.random(): 0.0보다 크거나 작고 1.0보다 작은 실수 난수값을 반환하는 메소드
		
		for (int i=1; i<=5; i++) {
			System.out.println(i+": "+ Math.random());
		}
		System.out.println();
		
		//0~99
		for (int i=1; i<=5; i++) {
			System.out.println(i+": "+ (int)(Math.random()*100));
		}
		
		//1~100 
		for (int i=1; i<=5; i++) {
			System.out.println(i+": "+ ((int)(Math.random()*100)+1));
		}	
		

	}
}
