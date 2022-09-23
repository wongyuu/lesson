package basic;
//반복문에서 명령을 처음부터 다시 실행하기 위한 반복문
public class ContinueApp {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			if (i==3) continue;
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("=========================================");

		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++)
			{
				if (j==3) continue;
				System.out.print("i = "+i+"j = "+j);
			}
			System.out.println();
		}
		System.out.println("=========================================");
		
		loop:
			for (int i=1; i<=5; i++)
			{
				for (int j=1; j<=5; j++)
				{	//break 라벨명 : 반복문 종료
					if (j==3) continue loop;
					System.out.print("i = "+i+"j = "+j);
				}
				System.out.println();
			}
		
	
}
}
