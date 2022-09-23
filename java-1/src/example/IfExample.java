package example;

public class IfExample {
	public static void main(String[] args) {
		//변수에 저장된 문자값을 출력하세요.97 65
		//단, 변수에 저장된 문자값이 소문자인 경우 대문자로 변환하여 출력하세요.
		char mun='x';
		if (mun>='a'|| mun <='z')
		{
			mun-=32; 
		}
		
		else if (mun>='A'|| mun <='Z')
		{
			mun+=32; 
		}
		
		System.out.println(mun);
		
		
		
		System.out.println("============================================================");
		//변수에 저장된 정수값이 4의 배수인지를 구분하여 출력하세요.
		int num=345644;
		
		if (num%4==0)
		{
			System.out.println("나눠짐");
		}
		else {
			System.out.println("안나눠짐");
		}
		
		System.out.println("============================================================");
		//올해가 평년인지 윤년을 구분하여 출력하세요.
		// => 년도를 4로 나누어 나머지가 0인 경우 윤년
		// => 위 조건을 만족하는 년도 중 100으로 나누어 나머지가 0인 경우 평년
		// => 위 조건을 만족하는 년도 중 400으로 나누어 나머지가 0인 경우 윤년
		int year=2022;
		
		if (year%4==0 && year%100 !=100 || year%400 == 0){
			System.out.println("윤년");
		}
		else{
			System.out.println("평년");
		}
			
		
		
		
		System.out.println("============================================================");
		//이름이 [홍길동]인 학생이 국어점수 89점, 영어점수 93점, 수학점수 95점을 받은 경우
		//총점과 평균, 학점을 계산하여 이름, 총점, 평균, 학점을 출력하세요.
		// => 국어,영어,수학 점수 중 하나라도 0~100 범위가 아닌 경우 프로그램 강제 종료
		//    System.exit(0) : 프로그램을 강제로 종료하는 메소드
		// => 평균을 이용한 학점 계산 : 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
		// => 평균은 소숫점 두자리까지만 출력하고 나머지는 절삭 처리 하세요.

		String name = "홍길동";
		int kor = 89;
		int eng = 93;
		int math = 95;
		
		//false 검증성공  true 검증실패
		boolean valid = false;
		
		if (kor<0|| kor>100) {
			System.out.println("[에러] 국어 점수가 범위를 벗어남");
			valid = true;
		}
		
		if (eng<0|| eng>100) {
			System.out.println("[에러] 국어 점수가 범위를 벗어남");
			valid = true;
		}
		
		if (math<0|| math>100) {
			System.out.println("[에러] 국어 점수가 범위를 벗어남");
			valid = true;
		}
		
		if (valid) {
			System.exit(0);
		}
		
		int total = kor+eng+math;
		double avg = (int)(total/3.0*100)/100.0;
		String grade = "";
		System.out.println(name + " 총점: "+ total + " 평균: "+avg);
		
		if (avg<=100 && avg>89)
			grade = "A";
		else if (avg <= 89 && avg>=80)
			grade = "B";
		else if (avg <= 79 && avg>=70)
			grade = "C";
		else if (avg <= 69 && avg>=60)
			grade = "D";
		else 
			grade = "F";
		System.out.println("학점:" +grade);
		System.out.println("============================================================");
	}
}