package basic;

import java.util.Scanner;

//메뉴중 하나를 선택하여 대한 기능을 제공하는 프로그램
// 프로그램 종료를 선택하기전까지 원하는 기능 계속 제공
// 선택 메뉴가 존자하지 않을 경우 에러메세지 출력후 제입력

public class MenuApp 
{
  public static void main(String[] args) 
  {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("학생 관리 프로그램");
	  
	  while(true)
	  {	
		  //메뉴 출력
		  System.out.println("1.학생정보 삽입");
		  System.out.println("2.학생정보 변경");
		  System.out.println("3.학생정보 삭제");
		  System.out.println("4.학생정보 검색");
		  System.out.println("5.학생정보 종료");
		  
		  //메뉴 선택
		  System.out.print("메뉴 선택 [1~5]: ");
		  int choice = scanner.nextInt();
		  
		  if (choice<0||choice>5) {
			  System.out.println("다시 입력해주세요\n");
			  continue;
		  }
		  
		  if (choice==5) 
		  {
			  break;
		  }
		  
		  switch (choice){
		  	case 1: 
		  		System.out.println("학생정보 삽입 성공");
		  		break;
		  	case 2: 
		  		System.out.println("학생정보 변경 성공");
		  		break;
		  	case 3: 
		  		System.out.println("학생정보 삭제 성공");
		  		break;
		  	case 4: 
		  		System.out.println("학생정보 검색 성공");
		  		break;
		  }
		  System.out.println();	  
		  System.out.println("종료");
	  }
	  
	  scanner.close();
  }
}
