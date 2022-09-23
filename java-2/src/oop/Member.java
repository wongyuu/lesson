package oop;
//회원정보 (아이디, 이름, 이메일)를 저장하기 위한 클래스
// VO class (Value Object)

/*
 *  this: 메소드에 숨겨져 있는 매개변수 - 키워드
 *  => this 매개변수의 자료혀은 메소드가 선언된 클래스
 *  => 메소드를 호출한 객체의 메모리 주소를 전달받아 저장하는 참조변수
 *  => 메소드에서 객체의 필드 또는 메소드를 사용하기 위해 this 키워드 사용
 *  => this 키워드를 사용하지 않아도 자동으로 객체의 필드 또는 메소드에 접근하여 사용 가능
 */
/*
 * 메소드에 this 매개변수가 존재하는 이유
 * => 필드는 객체마다 메모리(heap)에 따리 생성되지만 메소드는 객체이 상관없이 메모리(static)에 하나만 저장됨
 * => 프로토타입 클래스
 * => 메소드에서 필드를 접근할 때 this 키워드를 사용하여 객체를 구분하여 필드에 접근
 */

/*
 * This 키워드를 사용하는경우
 * 1. setter 메소드
 * 2. 생성자에서 다른 생성자를 호출하여 초기화 작업을 하기 위해 사용
 * 3. 이벤트 처리 프로그램 또는 다중 스레드 프로그램의 메소드에서 객체 자체를 표현하기 위해 사용
 */

public class Member {
	
	//필드
	//기본값 선입력 사능 ex) id = "No ID";
	private String id;
	private String name;
	private String email;
	
	
	//생성자 constructor 선언: 객체를 만들기 위한 특별한 메소드
	//생성자를 선언하는 이유는 생성자로 객체의 필드를 초기화 하기 위함
	//형식) 접근지정자 클래스명(자료형 매개변수,){초기화 명령;}
	//=> 반환형을 작성하지 않으며 생성자의 이름은 반드시 클래스 이름과 동일하게 작성
	//=> 메소드 오버로드 가능
	
	//매개변수가 존재하는 생성자
	// => 매개변수에 전달되어 저장된 값으로 필드의 초기값으로 지정
	//매개변수 없는 생성자-기본생성자 default constructor
	//초기화 작업 미구현 - 객체 생성시 필드에서 기본값이 초기값으로 저장
	// 매개변수가 없는 생성자를 선언하지 않으면 상속시 문제가 발생되므로 선언하는것을 권장
	
	
	//ctrl space >> constructor 선택
	
	public Member() {
		//this 키워드로 다른 생성자를 호출하는 명령
		// 생성자에서만 사용 가능한 명령
		//다른 명령보다 먼저 실행되도록 작성
		//=>다른 명령이 먼저 실행되면 에러 발생
		//this("NoId", "NoName", "NoEmail");
	}
	
	
	
	//alt shift O
	public Member(String id) {
		super();
		this.id = id;
	}
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Member(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	//메소드 method 선언
	//getter setter
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("아이디: " + id);
		System.out.println("이름  : " + name);
		System.out.println("이메일: " + email);
	}
}
