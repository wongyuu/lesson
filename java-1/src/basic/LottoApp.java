package basic;

/*
 *  1-45 난수 6개 제공 받아 출력
 *  중복 x, 오름차순 정렬
 *  sort: ascending/descending
 */

public class LottoApp {
	public static void main(String[] args) {
		
		int[] lotto = new int [6];
		
		//6개 난수, 중복값일 경우 저장 안함
		//요소에 저장된 난수값을 기존에 난수값과 비교하여 같은 값이 있는지 확인
		//반복문을 이용해 새로운 난수값을 제공받아 저장 
		for (int i=0; i<lotto.length; i++) {
			//중복값 확인
			while(true) {
				lotto[i] = (int)(Math.random()*45)+1;
				
				//중복상태 확인 false:미중복 true:중복
				boolean result = false;
				
				//새로운 난수 기존 난수 비교
				for (int j=0; j<i; j++) {
					if(lotto[i]==lotto[j]){
						result =true;
						break;
					}
				}
				
				//새로운 난수값이 기존 난수괎가 비교하여 중복되지 않은 경우
				if (!result)
					break;
				}
			}
		
		//ascending order
		//selection sort 선택정렬 알고리즘
		for (int i=0; i<lotto.length-1; i++){
			for (int j=i=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					//비교한 요소값 swap
					int temp = lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		//배열 요소값 출력
		System.out.print("숫자 :");
		for (int element:lotto) {
			System.out.print(element+ " ");
		}
	}
}
