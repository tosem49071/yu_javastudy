import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int num=scan.nextInt();
		
		if(num<0)
		{
			System.out.println("a="+-num);
		}
		else
		{
			System.out.println("a="+num);
		}
		
	}

}
