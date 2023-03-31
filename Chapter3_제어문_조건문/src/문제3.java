import java.util.Scanner;

/*1학년부터 4학년까지 중간고사 시험을 보았다. 
         4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
         이를 판단하는 프로그램을 작성해보자.
         점수가 0미만 100초과이면 경고문구 출력!
*    if(score<0 || score>100)
*    {
*        경고
*    }
*    else
*    {
*        if(hak==4)
*        {
*             if(score>=70)
*             {
*             }
*             else
*             {
*             }
*        }
*        else
*        {
*             if(score>=70)
*             {
*             }
*             else
*             {
*             }
*        }
*    }    
*/

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner Scan=new Scanner(System.in);
		System.out.println("4학년 중간고사 점수:");
		int num=Scan.nextInt();
				
		if(num>=70)
		{
			System.out.println("70점 이상 합격입니다");
			System.out.println("점수를 다시 입력하세요");
		}
		
		if(num>60)
		{
			System.out.println("60점 이상 합격입니다");
			System.out.println("점수를 다시 입력하세요");
			
		}*/
		
		
		Scanner Scan=new Scanner(System.in);
		System.out.println("학년 입력:");
		int hak=Scan.nextInt();
		System.out.println("점수 입력:");
		int score=Scan.nextInt();
		
		if(score<0 || score>100)
		{
			System.out.println("잘못된 입력입니다!!");
		}
		else
		{
			//정상수행시
			if(hak==4)
			{
				if(score>=70)
				{
					System.out.println("합격");
				}
				else
				{
					System.out.println("불합격");
				}
			}
			else
			{
				if(score>=60)
				{
					System.out.println("합격");
				}
				else
				{
					System.out.println("불합격");
				}
			}
		}

	}

}
