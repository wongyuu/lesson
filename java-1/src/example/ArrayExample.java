package example;

public class ArrayExample {
	public static void main(String[] args) {
		//사람들의 나이를 저장한 배열 생성		
		int[] age={27,16,22,36,57,60,43,23,14,29,44,52,59,51,39,33,11};
		
		//배열에 저장된 모든 사람들이 나이 평균을 계산하여 출력하세요.
		
		//배열에 저장된 사람들의 나이를 연령별로 구분하여 인원수를 계산하여 출력하세요.
		//ex) 10대 = 3명
		//    20대 = 4명
		//    ...
		//    60대 = 2명
	
		//평균 나이 구하는 방법
		
		int tot=0; 
		
		
		/*
		 
		int count =0;
		for (int i=0; i<age.length; i++){
			tot +=age[i];
			count++;
		}
		
		int avg = tot/count;
		System.out.println(avg);
		
		//나이대로 구하는 방법
		int agecount = 0;
		//6번 반복 - 10대부터 60대까지
		for (int i=1; i<=6; i++) {
			//age array의 요소 나이별로 카운트
			for(int element:age) {
				if(element>=(i*10) && element<i*10+10) {
					agecount++;
				}
			}
			
		//나이대 별로 출력
		System.out.println(i*10+"대: "+agecount +"명");
		//reset agecount to 0 before doing the loop again
		agecount =0;

		*/
		
		/*
		for (int i:age) {
			tot+=i;
		}
		System.out.println("평균: "+tot/age.length);
		
		//나이대로 구하는 방법
		int agecount = 0;
		//6번 반복 - 10대부터 60대까지
		for (int i=1; i<=6; i++) {
			//age array의 요소 나이별로 카운트
			for(int element:age) {
				if(element>=(i*10) && element<i*10+10) {
					agecount++;
				}
			}
			
		//나이대 별로 출력
		System.out.println(i*10+"대: "+agecount +"명");
		//reset agecount to 0 before doing the loop again
		agecount =0;
		}
		*/
		 
		/*
		int[] cnt = new int [6];
		for (int i:age) {
			if(i>=10 && i<=19) cnt[0]++;
			if(i>=20 && i<=29) cnt[1]++;
			if(i>=30 && i<=39) cnt[2]++;
			if(i>=40 && i<=49) cnt[3]++;
			if(i>=50 && i<=59) cnt[4]++;
			if(i>=60 && i<=69) cnt[5]++;
		}
		*/
		//6개 요소 만듬
		int[] cnt = new int [6];
		
		for (int i:age) {
			// ex) 27 
			//27 을 (27/2+1)번째 요소에 count++ 한다. 
			cnt[i/10-1]++;
		}
			
			for (int i=0; i<cnt.length; i++){
			System.out.println((i+1)*10+"대: "+cnt[i] +"명");
		}
	}
}