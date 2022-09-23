package oop;

public class MemberApp {
	public static void main(String[] args) {
		//new 연산자로 클래스의 매개변수가 없는 기본 생성자를 사용하여 객체 생성
		//=>생성된 객체의 필드는 기본값으로 자동 초기화
		Member member1 = new Member();
		
		System.out.println("아이디: " + member1.getId());
		System.out.println("이름  : " + member1.getName());
		System.out.println("이메일: " + member1.getEmail());
		System.out.println("================================");
		//setter 메소드를 호출하여 매개변수의 전달값으로 객체의 필드값 변경
		member1.setId("aaa");
		member1.setName("홍길동");
		member1.setEmail("hgd@google.com");
		
		//setter 메소드 후
		System.out.println("아이디: " + member1.getId());
		System.out.println("이름  : " + member1.getName());
		System.out.println("이메일: " + member1.getEmail());
		System.out.println("================================");
		
		//Overload 
		member1.display();
		System.out.println("================================");
		
		Member member2 = new Member("-");
		member2.display();
		System.out.println("================================");
		
		Member member3 = new Member("-","-");
		member3.display();
		System.out.println("================================");
		
		Member member4 = new Member("-","-","-");
		member4.display();
		System.out.println("================================");
	}
}
