package basic;

import java.util.Scanner;

//system.out : 출력스트림을 사용하여 값을 출력하는 메소드를 제공하는 객체
//system.in  : 입력스트림을 사용하여 키보드로부터 입력된 값을 제공하는 객체
public class ScannerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//입력값이 없으면 흐름(thread) 일시 중지됨
		System.out.print("이름 입력:");
		String name = scanner.nextLine();
		System.out.println(name);
		
		System.out.print("나이 입력:");
		//입력값 정수로 변환
		int age = scanner.nextInt();
		
		
		scanner.close();
	}
}
