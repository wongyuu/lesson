package example;

public class VariableExample {
	public static void main(String[] args) {
		//가로의 길이가 7이고 세로의 길이가 10인 사각형의 넓이를 계산하여 출력하세요.
		int x = 7;
		int y = 10;
		
		int area1 = x*y;
		
		System.out.println("넓이 : " +area1);
				

		System.out.println("======================================================");
		//높이가 9이고 밑변의 길이가 7인 삼각형의 넓이를 계산하여 출력하세요.
		int a = 9;
		int b = 7;
		
		double area2 = a*b*0.5;
		System.out.println("넓이 : " +area2);
		
		System.out.println("======================================================");
		//10명의 전체 몸무게가 759Kg인 경우 평균 몸무게를 계산하여 출력하세요.
		int n = 10;
		int total1 = 759;
		double avg1 = (double)total1/n;
		
		
		System.out.println("평균 : " + avg1);
		

		System.out.println("======================================================");
		//이름이 [홍길동]인 학생이 국어점수 89점, 영어점수 93점, 수학점수 95점을 받은 경우
		//총점과 평균을 계산하여 이름, 총점, 평균을 출력하세요.
		//단, 평균은 소숫점 한자리까지만 출력하고 나머지는 절삭 처리 하세요.
		String name = "홍길동";
		int kor = 89;
		int eng = 93;
		int math = 95;
		double total2 = (double)kor+eng+math;
		double avg2 = total2/3;
		double output = (int)(avg2*10)/10.0;		
		System.out.println(name + "의 평균 점수: " + output);
		
		System.out.println("======================================================");
	}
}
