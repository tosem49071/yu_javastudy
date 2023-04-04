public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				System.out.printf("%2d\t",i);
			                      //-- 두칸을 비워두고 숫자입력(정렬)
			    if(i%3==0)
			    System.out.println();
			}
		}

	}

}
