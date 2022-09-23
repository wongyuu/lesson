package basic;

/*
 * 지역변수(Local Variable): {} 내부에 선언된 변수 => 선언된 {} 내부에서만 사용 가능
 * 							 지역변수가 선언된 블럭이 종료되면 지역변수 자동 소멸
 */
public class LocalVariable {
	public static void main(String[] args) {
		int num1 = 100;
		
		System.out.println("num1 : "+num1);
		
		//임의블록
		{
			int num2 = 200;
			System.out.println("num1 : "+num1);
			System.out.println("num2 : "+num2);
		}
		
		//블럭내부에서 만들어진 num2는 블럭 밖에서 사용 불가
		//System.out.println("num2 : "+num2);
		
	}

}
