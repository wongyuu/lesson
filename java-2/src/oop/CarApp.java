package oop;

//car 클래스를 사용하여 작성된 프로그램
public class CarApp {
	public static void main(String[] args) {
		Car carOne = new Car();
		Car carTwo = new Car();
		Car carThree = carTwo;
		
		System.out.println("carOne = " + carOne);
		System.out.println("carOne = " + carTwo);
		System.out.println("carOne = " + carThree);
		System.out.println("==============================");
		
		//필드값을 직접 변경하지 못함 
		//setter 메소드 호출하여 필드값 변경
		carOne.setModelName("tico");
		carOne.setEngineStatus(false);
		carOne.setCurrentSpeed(0);
		
		//필드값 직접 사용 못함
		//getter 메소드 호출하여 필드값 반환
		System.out.println("CarOne model name   : "+carOne.getModelName());
		System.out.println("CarOne engine status: "+carOne.isEngineStatus());
		System.out.println("CarOne current speed: "+carOne.getCurrentSpeed());
		System.out.println("==============================");
		
		carTwo.setModelName("sonata");
		carTwo.setEngineStatus(true);
		carTwo.setCurrentSpeed(50);
		System.out.println("CarTwo model name   : "+carTwo.getModelName());
		System.out.println("CarTwo engine status: "+carTwo.isEngineStatus());
		System.out.println("CarTwo current speed: "+carTwo.getCurrentSpeed());
		System.out.println("==============================");
		
		carTwo.startEngine();
		carTwo.speedUp(30);
		carTwo.speedUp(300);
		carTwo.speedDown(170);
		carTwo.speedUp(30);
		carTwo.stopEngine();
		carTwo.speedZero();
		carTwo.stopEngine();
		System.out.println("==============================");
		
		
	}
}
