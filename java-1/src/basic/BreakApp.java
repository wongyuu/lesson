package basic;

public class BreakApp {
	public static void main(String[] args) 
	{
		for (int i=1; i<=5; i++)
		{
			if (i==3) break;
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("=========================================");

		for (int i=1; i<=5; i++)
		{
			System.out.print(i+"\t");
			if (i==3) break;
		}
		System.out.println();
		System.out.println("=========================================");
		
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++)
			{
				System.out.print("i = "+i+"j = "+j);
			}
			System.out.println();
		}
		System.out.println("=========================================");

		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++)
			{
				if (j==3) break;
				System.out.print("i = "+i+"j = "+j);
			}
			System.out.println();
		}
		System.out.println("=========================================");
		
		//반복문에서 반복문을 구분하기 위한 식별자 선언 가능
		// 라벨명:반복문
		loop:
			for (int i=1; i<=5; i++)
			{
				for (int j=1; j<=5; j++)
				{	//break 라벨명 : 반복문 종료
					if (j==3) break loop;
					System.out.print("i = "+i+"j = "+j);
				}
				System.out.println();
			}
	
		
	}
}
