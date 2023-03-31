import java.util.Scanner;

//사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램 작성

public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner Scan=new Scanner(System.in);
		System.out.printf("정수 입력:");
		int num=Scan.nextInt();
		
		if(num>0)
		{
			System.out.println("양수입니다");
		}
		if(num<0)
		{
			System.out.println("음수입니다");
		}*/
		
        
		Scanner Scan=new Scanner(System.in);
		System.out.printf("정수 입력:");
		int num=Scan.nextInt();
		
		if(num>0)
		System.out.println(num+"은(는) 양수입니다");
		else
		System.out.println(num+"은(는) 음수입니다");
		
	}

}
