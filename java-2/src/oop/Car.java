package oop;
/*클래스: 객체를 만들기 위한 자료형 - 참조형
* => 객체 대신 instance로 표현하기도 함
* => 현실 세계의 존재하는 사물을 자바 자료형으로 표현
*
*클래스 선언 형식
*public class 클래스명{
* 	필드(field): 대상의 속성을 표현하여 속성값을 저장하기 위해 선언된 변수(멤버변수)
* 	...
* 
* 	생성자(constructor): 객체 생성을 목적으로 선언된 메소드
* 	...
* 
* 	메소드(Method): 대상의 행위를 명령의 모임으로 선언한 함수(멤버함수)
* 
* }
* => 필드의 필요한 값을 저장하여 메소드로 필드값을 사용하여 원하는 기능을 제공
*/

/*객체생성 방법
 * 형식 클래스명 참조변수 = new 클래스명();
 * new 연산자로 클래스의 생성자를 호출하여 객체를 생성하고 참조변수를 객체의 주소를 저장
 * 참조변수에 저장된 객체의 필드 또는 메소드를 연산자로 접근하여 프로그램 작성
 */

/*
 * 자동차를 객체 모델링하여 작성된 클래스
 *  => 속성: 모델명, 엔진상태, 현재속도
 *  => 행위: 시동 온/오프, 속도증가/감소, 이동중지
 */

/*
 *클래스를 선언할 때 필드 또는 메소드에 접근지정자를 선언하여 접근 가능 유무 설정
 *접근지정자(access modifier): public, private, protected, package(default)
 * => 클래스, 필드, 생성자, 메소드를 선언할 때 접근 유무를 지정하기 위한 키워드
 * => private: 클래스 내부에서만 접근 가능, 클래스 외부에서 접근 불가능
 *             일반적으로 필드 선언시 사용: 객체로 필드에 직접적인 접근하는 것을 차단하기 위해 사용
 *             은닉화(data hiding)
 * => public : 패키지의 모든 클래스에서 접근 가능 
 *             일반적으로 메소드 선언시 사용: 프로그램 작성에 필요한 모든 클래스 접근 허용
 */
public class Car {

	// 필드 : 클래스 모든 메소드에서 필드 사용 가능
	private String modelName;
	private boolean engineStatus; // false: off true: on
	private int currentSpeed;

	// 생성자 constructor: 생략하면 매개변수가 없는 기본 생성자가 존재하는 것으로 처리

	// 메소드: 필드값을 화용하여 명령을 필요한 기능을 제공
	public void startEngine() {
		engineStatus = true;
		System.out.println(modelName + "시동 킴");
	}

	public void stopEngine() {
		// 차 속도가 0 이 아니고 엔진을 끄고싶을때
		// 우선 차 속도를 0으로 만듬
		if (currentSpeed != 0) {
			// currentSpeed=0;
			// System.out.println(modelName+"가 멈춤");

			speedZero();
		}
		engineStatus = false;
		System.out.println(modelName + "시동 끔");
	}

	public void speedUp(int speed) {
		// 시동이 꺼져으면 return
		if (!engineStatus) {
			System.out.println(modelName + "의 시동이 꺼져 있습니다");
			return;
		}

		// 최대 속도 150으로 조절
		if (currentSpeed + speed > 150) {
			speed = 150 - currentSpeed;
		}

		currentSpeed += speed;
		System.out.print(modelName + "의 속도가 " + speed + "km/h 증가 함.");
		System.out.println(" 현재 속도는 " + currentSpeed + " 입니다");
	}

	public void speedDown(int speed) {

		// 시동이 꺼져으면 return
		if (!engineStatus) {
			System.out.println(modelName + "의 시동이 꺼져 있습니다");
			return;
		}

		// 최소 속도 0으로 조절
		if (currentSpeed < speed) {
			speed = currentSpeed;
		}
		
		currentSpeed -= speed;

		System.out.print(modelName + "의 속도가 " + speed + "km/h 감소 함.");
		System.out.println(" 현재 속도는 " + currentSpeed + " 입니다");
	}

	public void speedZero() {
		currentSpeed = 0;
		System.out.println(modelName + " 가 멈춤");
	}

	// 은닉화 처리된 필드를 위해 필드값을 반환하는 Getter 메소드와
	// 필드값을 변경하는 setter 메소드 선언
	// 캡슐화 (Encapsulation): 필드를 은닉화시켜 보호되어 사용할수 있도록 설정
	// 표현대상을 속성(필드)와 행위(메소드)를 묶어 클래스로 표현

	// getter method: 필드값을 반환하는 메소드
	// 형식: public 반환형 get필드명(){ return 필드명;}
	public String getModelName() {
		return modelName;
	}

	// 이클립스는 은닉화 선언된 필드에서 getter 와setter 메소드를 생성하는 기능 제공

	// setter method: 매개변수로 값을 전달받아 필드값을 변경하는 메소드
	// 형식: public void set필드명(자료형 매개변수) {필드명=매개변수;}
	public void setModelName(String modelName) {
		// this: 메소드 내부에서 클래스의 객체를 표현하는 키워드
		this.modelName = modelName;
	}

	// source-> generate getter & setter

	// 은닉화 선언된 필드의 자료형이 boolean 일경우 get 대신 is를 사용한다
	// setter getter 단축키 alt shift s => r
	// 자동주석 ctrl shift f
	public boolean isEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public static void main(String[] args) {

	}
}
