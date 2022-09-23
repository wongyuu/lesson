package basic;

// 명령에 대한 반복 횟수가 불확실한 경우 사용되는 반복문
// do {명령} while (조건)
// 조건식의 결과가 처음부터 거짓인 경우에도 반드시 블럭 안의 명령은 한번 실행
public class WhileApp {
	public static void main(String[] args) {
		int i =1;
		while(i<=5) {
			System.out.println("java");
			i++;
		}
		System.out.println("=========================================");
		
		int j =1;
		int tot = 0;
		do {
			tot+=j;
			j++;
		} while(j<=100);
		
		System.out.println(tot);
		System.out.println("=========================================");
		
		//A4 용지를 반으로 계속 접어 펼쳤을 경우 사각형 모양의 갯수가 500개 이상 만들어질려면 몇번 접어야 되는지 계산
		int count =0; //접는 횟수
		int gae =1; // 사각형 갯수
	
		while(gae<500) {
			count++;
			gae*=2;
		}
		System.out.println(count);
		System.out.println("=========================================");
		
		//1~x 범위의 정수들의 합이 300 이상이 만들어지려면 x 가 얼마인지 계산하여 출력
		int cnt = 0; //카운팅
		int no = 1; //더해진 수에 합
		
		while(no<300) {
			cnt++;
			no+=cnt;
		}
		System.out.println(cnt);
		
		int x = 0; //1씩 증가되는 정수값 저장
		int sum = 0; //더해진 수에 합
		
		while(sum<300) {
			x++;
			sum+=x;
		}
		System.out.println(x);
		
	}
}
