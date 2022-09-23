package basic;

public class MultiForApp {
	public static void main(String[] args) {
		
		int count = 0; //이동방법 갯수 저장하기 위한 변수
		
		for (int i =1; i<=3; i++) {
			for (int j=1; j<=4
					; j++){
				count++;
			}
		}
		
		System.out.println(count);
		
		//*******
		for (int i=1; i<=3; i++) { // row 행
			for (int j=1; j<=7; j++) { // column 열
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=========================================");
		System.out.println();
		
		//pattern2
		for (int i=1; i<=3; i++) { // row 행
			for (int j=1; j<=7; j++) { // column 열
				System.out.print("*=\t");
			}
			System.out.println();
		}	
		System.out.println("=========================================");
		System.out.println();
		
		//pattern3
		for (int i=1; i<=3; i++) { // row 행
			for (int j=1; j<=7; j++) { // column 열
				System.out.print(j+"=\t");
			}
				System.out.println();
		}
		System.out.println("=========================================");
		System.out.println();
		
		//pattern3
		for (int i=1; i<=9; i++) { // row 행
			for (int j=2; j<=9; j++) { // column 열
				System.out.print(j+"*"+i + "=" + i*j+"\t");
			}	
			System.out.println();
		}
		System.out.println("=========================================");
		System.out.println();

		//pattern4
		for (int i=1; i<=5; i++) { // row 행
			for (int j=1; j<=i; j++) { // column 열
				System.out.print("*");
			}	
			System.out.println();
		}
		System.out.println("=========================================");
		System.out.println();
		
		//pattern5
		for (int i=1; i<=5; i++) { // row 행
			for (int j=1; j<=(6-i); j++) { // column 열
				System.out.print("*");
			}	
			System.out.println();
		}
		System.out.println("=========================================");
		System.out.println();
	
		//pattern6
		for (int i=5; i>=1; i--) { // row 행
			for (int j=1; j<=i; j++) { // column 열
				System.out.print("*");
			}	
			System.out.println();
		}
		System.out.println("=========================================");
		//pattern7
		/*
		 *       * i=1 4blank star1
		 *      ** i=2 3blank star2
		 *     *** i=3 2blank star3
		 *    **** i=4 1blank star4
		 *   ***** i=5 0blank star5  
		 */     
		for (int i=1; i<=5; i++) { // row 행
			for (int j=1; j<=5-i; j++) { // column 열
				System.out.print(" ");
			}	
			for (int j=1; j<=i; j++) { // column 열
				System.out.print("*");
			}	
			System.out.println();
			
		}
		System.out.println("=========================================");
		System.out.println();
		
		for (int i=1; i<=5; i++) { // row 행
			for (int j=1; j<=5; j++) { // column 열
				if (i+j<6) {
					System.out.print(" ");	
				}
				else {
					System.out.print("*");
				}
			}	
			System.out.println();
		}
		System.out.println("=========================================");
		System.out.println();
		

		
	}
}
