package basic;
//자료형 : 원시형 & 참조형
//원시형 : 값을 표현하기 위한 자료형 예) int char float double
//참조형 : 특정 대상을 표현하기 위한 자료형 - array, class, interface

//원시형으로 생성된 변수 (기본 변수): 값을 저장하기 위한 변수 예) int num = 10; 
//참조형으로 생성된 변수 (참조 변수): 특정 대상의 메모리 주소값을 저장하기 위한 변수 String name = "aaa"
// => 힙영역에 생성된 배열 또는 객체의 메모리 주소를 저장하여 접근하기 위해 사용
// => 참조변수는 비교연산자를 사용할 경우 메모리 주소 비교
// => 참조변수는 기본값으로 null 사용가능

//프로그램에서 사용하는 메모리 영역
// =>사용 메모리 영역: 정적영역(static area)-메소드 영역, 힙영역(Heap), 스택영역(Stack area)
//1. static area : 클래스 파일(xxx.class)을 읽어 저장하는 메모리 영역
//2. heap area   : 배열 및 객체가 저장되는 메모리 영역 - new 연산자 사용
// => 메모리에 이름 설정 불가능: 참조변수 필요
//3. stack area  : 지역변수(기본 또는 참조 변수)가 저장되는 메모리 영역


//배열(array) : 같은 자료형의 값을 여러개 저장하기 위한 메모리를 할당받기 위한 자료형
// =>일괄처리 목적으로 사용
// => 1/2/3 차원 배열 등으로 구분
// => 1차원 배열 : 다수의 값을 저장하기 위한 자료형
// => 다차원 배열: 배열을 저장하기 위한 자료형
public class ArrayApp {
	public static void main(String[] args) {
		//1차원 배열을 생성하여 참조변수에 생성된 배열의 메모리 주소를(hash code) 저장
		//형식) 자료형[] 참조변수 = new 자료형 [갯수]
		// => new 자료형[갯수] : 자료형의 값을 갯수만큼 저장 가능한 배열 생성 - 힙영역
		// => 자료형[] 참조변수 : 1차원 배열의 메모리 주소를 저장하기 위한 참조변수 생성
		// => 자료형 참조변수 [] 형식으로도 생성 가능;
		// 1차원 배열은 다수의 값을 저장하기 위한 element요소의 모임
		// => 배열의 요소는 첨자(index:0부터 1씩 증가되는 정수값)
		// 기본값이 초기값으로 자동 저장 (false, 0, null)
		int[] num = new int[3];
		
		//참조변수 저장된 값 "자료형@메모리주소"
		System.out.println(num);
		System.out.println("=========================");
		
		System.out.println("num[0] = " +num[0]);
		System.out.println("num[1] = " +num[1]);
		System.out.println("num[2] = " +num[2]);
		System.out.println("=========================");
		
		//예외 발생시 프로그램 강제 종료
		//System.out.println("num[3] = " +num[3]);
		System.out.println("배열 요소의 개수: "+ num.length);
		System.out.println("=========================");
		
		int index=0;
		num[index]=10; 
		num[index+1]=20;
		num[index+2]=30;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println("=========================");
		
		//for 구문 사용하여 배열 요소 일괄 처리
		for (int i=0; i<num.length; i++) {
			System.out.println("num["+i+"] = "+ num[i]);
		}
		System.out.println("=========================");
		
		//배열 생성시 배열 요소에 기본값 대신 원하는 초기값 설정 가능
		// 형식) 자료형[] 참조변수=new자료형[]{초기값,...};
		int []su= new int[] {10,20,30};
		for (int i=0; i<su.length; i++) {
			System.out.println("su: "+su[i]);
		}
		System.out.println("=========================");
		
		int[] su2= {10,20,30};
		for (int i=0; i<su.length; i++) {
			System.out.println("su: "+su[i]);
		}


		
		
		//배열을 일괄 처리하기 위한 변형된 for 구문
		//형식 (자료형 변수명:참조변수){명령;}
		//계산 출력에 대한 일괄처리에 사용
		for (int temp:su)
			System.out.println(temp);
		
		System.out.println("=========================");
		
		int[]array = {12,23,45,6,22,234,42,55,213};
		int tot=0;
		//모든 요소 값에 대한 합계 계산
		for(int element:array) {
			tot+=element;
		}
		System.out.println("total: "+tot);
		System.out.println("=========================");
		
		//배열의 요소값이 30-60 범위의 요소갯수 
		int count =0;
		
		for (int element:array) {
			if (element>=30 && element<=60) {
				count++;
			}
		}
		System.out.println("count: "+count);
		
	}
}
