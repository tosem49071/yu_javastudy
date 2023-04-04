
public class 문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, count=0;
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			{
				sum+=i;
				count++;
			}
			
		}
		System.out.println("갯수"+count);
	    System.out.println("합:"+sum);

	}

}
