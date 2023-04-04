import java.util.Scanner;

public class PPT문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int start=scan.nextInt();
		//System.out.print("두번째 정수 입력:");
		//int end=scan.nextInt();
		int end=0;
		while(true)
		{
			System.out.print("두번째 정수 입력:");
			end=scan.nextInt();
			if(end<start)
			{
				System.out.println("첫번째 정수보다 큰수여야 합니다");
				continue;
			}
			break;
		} // 오류처리를 할 줄 알아야한다!!
		int gop=1;
		for(int i=start;i<=end;i++)
		{
			gop*=i;
		}
		System.out.println(start+"부터"+end+"까지의 합:"+gop);

	}

}
