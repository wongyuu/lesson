package example;

public class MultiforExample {
	public static void main(String[] args) {
		//★★★★★
		//★★★★
		//★★★
		//★★
		//★
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=i; j++) {
			System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("==================");
		System.out.println();
		
		//★★★★★
		//☆★★★★
		//☆☆★★★
		//☆☆☆★★
		//☆☆☆☆★
		
		for(int i=0;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("☆");
			}
			for(int j=0;j<5-i;j++) {
				System.out.print("★");
			}
			
			System.out.println();
		}
		
		System.out.println("==================");
		System.out.println();
		
		//★
		//★★★
		//★★★★★
		//★★★★★★★
		//★★★★★★★★★
		
		
		for (int i=1; i<=10; i++) {
			if (i%2==0)
				continue;
			
			for (int j=1; j<=i; j++) {
			System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("==================");
		System.out.println();
		
		
		//★☆☆☆★
		//☆★☆★☆
		//☆☆★☆☆
		//☆★☆★☆
		//★☆☆☆★
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				if(i==j || (i+j)==6){
					System.out.print("★");
				}
				else {
					System.out.print("☆");
				}	
			}
			System.out.println();
		}
		System.out.println("==================");
		System.out.println();		
	}
}