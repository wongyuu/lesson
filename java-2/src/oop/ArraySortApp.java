package oop;
/*OOP: 객체 지향 프로그램
* => 현실 세계에 존재하는 대상을 모델링하여 클래스로 작성하고 
*    클래스로 객체를 생성하여 객체의 요소로 프로그램을 작성하는 방법
* => 추상화, 캡슐화, 다형성, 상속성
*    
*객체 모델링: 현실 세계에 존재하는 대상을 송성과 행위로 구분하여 설계
* => 객체 모델링한 대상을 클래스(필드와 메소드) - 추상화(Abstraction)
* => 클래스 배포 가능: 프로그램의 생산성이 증가되며 유지보수의 효율성 증가
*/

import java.util.Arrays;

//배열 요소값을 오름차순 정렬하여 저장하고 출력하는 프로그램 작성
public class ArraySortApp {
	public static void main(String[] args) {
		/*
		int[] array = {30,50,10,40,20};
		
		System.out.print("정렬 전: ");
		for (int i:array) {
			System.out.print (i+"\t");
		}
		System.out.println();
		
		//sorting algorithm
		for (int i=0; i<array.length-1;i++) {
			for (int j=i+1; j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.print("정렬 후: ");
		for (int i:array) {
			System.out.print (i+"\t");
		}
		*/
		int[] array = {30,50,10,40,20};
		//Array class: 배열의 요소값을 처리하는 기능을 제공하는 클래스
		//Arrays.toString(Object[] array): 배열을 전달받아 
		// 모든 요소값을 문자열로 변환하여 반환하는 메소드 
		
		System.out.println("Arrays.toString(array)");
		System.out.println(Arrays.toString(array));
		System.out.println("====================");
	
		System.out.println("Arrays.sort(array)");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println("====================");
		System.out.println();
		
		
		
		
	}
}	
