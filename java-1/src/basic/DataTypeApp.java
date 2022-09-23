/*
 자료형(DataType) : 값이나 특정 대상을 표현하기 위한 키워드 또는 식별자
 원시형(Primitive) : 값을 표현하기 위한 자료형 - 키워드
 >> 숫자형(numeric): 정수, 실수, 문자 - 연산가능
 >>논리형
 
 참조형(Reference Type) : 특정 대상을 표현하기 위한 자료형 - 식별자(class)
 >>String 클래스 : 문자열을 표현하기 위한 자료형(클래스)

 Bit(0 or 1)
 1Byte = 8bit = 1character
 1024Byte = 1MByte
 1024MByte = 1GByte
 1024GByte = 1TByte
 
 32GB = (32*1024*1024)Byte
 bps = bit/s
 cps = character/s
 
*/


package basic;

public class DataTypeApp {
	public static void main(String[] args) {
		//정수형(integer type): 소수점이 없는 숫자 -> 4Byte
		System.out.println("Integer Type");
		System.out.println("정수값(10진수 100) = "+ 100);
		System.out.println("정수값(8진수 100)  = "+ 0100); //0숫자값>>8진수 정수값을 표현한 리터럴
		System.out.println("정수값(16진수 100) = "+ 0x100); //0x숫자값>>16진수 정수값을 표현한 리터럴
		System.out.println("정수값(10진수 100) = "+ 100l); //8Byte(long)의 정수값을 표현한 리터럴	
	
		//정수값을 표현하기 위한 자료형 - byte (1byte), short(2byte), int(4byte), long(8byte)
		byte a1; //1byte
		short a2;//2byte 
		int a3;  //4byte
		long a4; //8byte
		
		
		System.out.println("====================================");
		
		//실수형(double type): 소수점이 있는 숫자 -> 8Byte
		System.out.println("Double Type");
		System.out.println("실수값(4Byte) = " +12.3f );
		System.out.println("실수값(8Byte) = " +12.3 );
		System.out.println("실수값(8Byte) = " +0.00000000000000000123);
		//println은 아주작거나 큰 실수값은 지수형태로 변환하여 출력함
		//실수값을 지수형태로 표현가능
		System.out.println("실수값(8Byte) = " +1.23E10);
		
		System.out.println("====================================");
		
		System.out.println("Character Type");
		//문자형(Character type): ''안에 하나의 문자로 표현 -> 2Byte
		//자바 문자형 리터럴은 내부적으로 약속된 정수값으로 표현 : unicode 
		// 'A'=65, 'a'=97, '0'=48, '\n'=13, ' '=32
		System.out.println("문자형(2Byte) = "+'A');
		System.out.println("문자형(2Byte) = "+'가');
		System.out.println("문자형(2Byte) = "+'\'');
		
		System.out.println("====================================");
		
		//논리형(Boolean type): false or true -> 1Byte
		System.out.println("Boolean Type");
		System.out.println("논리형(1Byte) = " +false);
		System.out.println("논리형(1Byte) = " +true);
		System.out.println("논리형(1Byte) = " +(20>10));
		System.out.println("논리형(1Byte) = " +(20<10));
		
		System.out.println("====================================");
		
		//문자열(String type): " "안에 0개 이상의 문자로 표현 
		//문자열은 원시형이 아닌 참조형으로 String 클래스로 표현
		System.out.println("String Type");
		System.out.println("문자열 = " +"String");
		System.out.println("대한민국 \"만세\"");
		
		String name = "ㅇㅇㅇ";
		System.out.println("name is "+name);
	}
}
