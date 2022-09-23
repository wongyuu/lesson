package basic;

//다차원 배열: 1차원 배열의 모임
public class DoubleArray {
	public static void main(String[] args) {
		//형식) 자료형[][] 참초변수 = new 자료형[행갯수][열갯수]
		//행갯수 :1차원 배열의 갯수
		//열갯수 :1차원 배열의 요소 갯수
		
		int [][]num=new int[2][3];
		System.out.println("num[0][0] : "+num[0][0]);
		System.out.println("num[0][0] : "+num[0][1]);
		System.out.println("=========================");
		
		System.out.println("num.length : "+num.length);
		System.out.println("num[0].length : "+num[0].length);
		System.out.println("num[1[.length : "+num[1].length);
		System.out.println("=========================");
		
		for (int i=0; i<num.length;i++) { //행처리
			for (int j=0; j<num[i].length; j++) { //열처리
				System.out.print(num[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("=========================");
		//int [][] su = new int[][]{{10,20,30},{40,50,60},{70,80,90}};
		int[][]su ={{10,20,30},{40,50,60},{70,80,90}};
		for (int[]array:su) {
			for (int number:array) {
				System.out.print(number+" ");
			}
			System.out.println();
		}
		System.out.println("=========================");
		
		//1차원배열이 없는 2차원 배열 생성
		//=>1차원 배열의 메모리 주소를 저장할수 있는 참조요소만 생성
		//=>2차원 배열의 참조요소에는 null 저장
		
		//1차원 배열 3개 생성
		int[][] value= new int[3][];
		
		//1차원 배열의 요소 수 조정
		value[0] = new int[3];
		value[1] = new int[2];
		value[2] = new int[4];
		
		int[][]doubleArray = {{10,20,30},{40,50},{60,70,80,90}};
		
		for (int[] array:doubleArray) {
			for (int number:array) {
				System.out.print(number+" ");
			}
			System.out.println();
		}
	}
}
