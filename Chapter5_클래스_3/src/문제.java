import java.util.Scanner;
/*
 *    method => 140page
 *    1) 메소드 형식 => 기능처리
 *       -------- 
 *        웹 => 화면 변경
 *        ------------- 메뉴 클릭, 버튼 클릭, 이미지 클릭 ...
 *        검색, 글쓰기, 수정, 회원가입, 회원탈퇴 ...
 *        사용자의 동작과 관련
 *        리턴형 메소드명(매개변수...) => 선언부
 *        {
 *           구현부
 *        }
 *      = 리턴타입(리턴형)
 *        처리후 결과값 한개만 전송이 가능하다
 *        *** 여러개인 경우 : 배열, 클래스
 *        *** 한개인 경우 : 일반 기본형, String
 *        1) 결과값이 있는 경우
 *           리턴형 메소드명(매개변수...)
 *           ----
 *           {
 *              return  값; 일치 ==> 리턴형 클수도 있다
 *                      --
 *           }
 *           예)
 *              int method()
 *              {
 *                 return10.5; ==> 오류 발생
 *              }
 *              
 *              int method()
 *              {
 *                 return (int)10.5; ==> 오류 발생
 *              }
 *              ==> int a=method(); ==> a=10
 *                  ==> method()
 *              double method()
 *              {
 *                 return 10;
 *              }
 *              ==> double d=method()
 *                  ==> 결과값을 받아서 처리
 *              예) 오라클에서 데이터를 읽기
 *                 ------------------
 *                 => 브라우저로 보낸다
 *               => 자바 : 데이터관리
 *                  Java / Oracle / Spring
 *               => 자바스크립트 : 이벤트 처리 (브라우저)
 *                  NodeJS / ReactJs / VueJS / Redux / Vuex / TypeScript
 *                  Ajax / Jquery
 *              int[] method()
 *              {
 *                 int[] arr={1,2,3,4,5};
 *                 return arr; // 배열 주소만 넘겨준다
 *              }
 *              ==> int[] arr=method()
 *              
 *        2) 결과값이 없는 경우
 *           void method()
 *           ----
 *           {
 *              return; // 메소드 종료
 *           }
 *           void method1()
 *           {
 *              생략 => 컴파일러가 자동으로 추가 return
 *           }
 *           => import 추가
 *              import java.lang.*; => 자동 추가
 *                     System
 *                     String
 *                     Math
 *                     ------------
 *           ==> method()
 *           
 *      = 메소드명 => 식별자와 동일
 *                 길이에 제한이 없다 => 의미를 부여
 *                 aaa(), bbb(), ccc()
 *                 getName(), getTitle(),
 *                 setName() ...
 *      = 매개변수 : 사용자 요청값
 *      
 *      메소드 유형
 *      ------------
 *      리턴형  매개변수
 *       O      O
 *       O      X
 *       X      O
 *       X      X
 */

public class 문제 {
	static void process1() 
	{
		//입력
		Scanner scan=new Scanner(System.in);
		System.out.print("0~32767까지의 정수 입력:");
		int num=scan.nextInt();
		
		//처리
		// while
		int[] binary=new int[16];
		int index=15;
		while(true)
		{
			binary[index]=num%2;
			num=num/2;
			if(num==0)
				break;
			index--;
		}
		
		//출력
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
		// api
		//System.out.println(Integer.toBinaryString(num));
		//                         ---------------- 이진법 출력시 사용
	}
	// 임의의 정수를 배열로 생성해서 입력하고 정렬하는 프로그램 작성
	/*
	 *  *
	 *  **
	 *  ***
	 *  ****
	 *  
	 *  for(int i=1;i<=4;i++)
	 *  {
	 *     for(int j=1;j<=i;j++)
	 *     {
	 *        System.out.print("*");
	 *     }
	 *     System.out.println();
	 *  }
	 */
	
	static void process2()
	{
		int[5]=(int)(Math.random()*100)+1;
		
	}
	
	static void process3()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		if((year%4==0 && year%100!=0) || (year%400==0))
			System.out.println(year+"년도는 윤년입니다");
		else
			System.out.println(year+"년도는 윤년이 아닙니다");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//process1();
		process2();
		//process3();
		

	}

}
