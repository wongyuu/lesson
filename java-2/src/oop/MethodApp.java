package oop;

//실행이 목적인 클래스 -프로그램
// main method 필수
public class MethodApp {
	
	public static void main(String[] args) {
		//클래스로 객체를 생성하여 객체의 메모리 주소를 참조변수 저장
		// 같은 패캐지의 클래스는 패키지 표현없이 클래스를 사용 가능
		// 참조변수 사용하여 객체의 필드 또는 메소드 접근 가능
		Method method = new Method();
		
		//참조변수의 메모리 주소 
		System.out.println(method);
		System.out.println("=========================");
		
		//메소드 호출 (여러번 가능)
		method.displayOne();
		System.out.println("=========================");
		
		method.displayTwo();
		System.out.println("=========================");
		
		method.printOne();
		System.out.println("=========================");
		
		method.printTwo(100);
		System.out.println("=========================");
		
		method.printTwo(50);
		System.out.println("=========================");
		
		method.printThree(25,75);
		System.out.println("=========================");
		
		//메소드를 호출하여 반환되는 결과값을 변수에 저장
		//메소드 명령에 대한 결과값을 지속적으로 사용할 경우 변수에 저장
		int tot =method.returnTot(75,25);
		
		//입력과 출력 명령은 프로그램에서 작성
		// 프로그램 독립적: 메소드에서 값에 대한 계산만 하고 입출력은 미작성
		System.out.println(tot);
		
		//반환값을 일시적으로 사용할 경우 변수에 미저장
		System.out.println(method.returnTot(75,25));
		System.out.println("=========================");
		
		boolean result = method.isOddEven(80);
		if (result)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		if (method.isOddEven(11))
			System.out.println("짝수");
		else
			System.out.println("홀수");
		System.out.println("=========================");
		
		int[] array = method.returnArray();
		for (int num:array)
			System.out.print(num+" ");
		System.out.println();
		System.out.println("=========================");
		
		System.out.println("total: "+method.sumOne(10, 20, 30));
		System.out.println("=========================");

		//에러발생 System.out.println("total: "+method.sumTwo({10,20,30}));
		System.out.println("total: "+method.sumTwo(new int[] {10,20,30}));
		System.out.println("total: "+method.sumTwo(new int[] {}));
		System.out.println("total: "+method.sumTwo(new int[] {10,20,30,40}));
		System.out.println("=========================");
		
		System.out.println("total: "+method.sumThree(10,20,30));
		System.out.println("total: "+method.sumThree());
		System.out.println("total: "+method.sumThree(10,20,30,40));
		System.out.println("=========================");
	}
}
