//틀
public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num1=0, num2=0;
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0)
			{
				num1+=i;
			}
			else if(i%9==0)
			{
				num2+=i;
			}
			
		}
		System.out.println("7의 배수:"+num1);
		System.out.println("9의 배수:"+num2);
		System.out.println("7의 배수+9의 배수:"+num1+num2);*/
		
		int a7=0,a9=0;
		for(int i=1;i<=1000;i++) 
		{
			if(i%7==0)
				a7+=i;
			if(i%9==0)
			    a9+=i;
		}
		System.out.println("7의 배수:"+a7);
		System.out.println("9의 배수:"+a9);
		System.out.println("7의 배수+9의 배수:"+a7+a9);

	}

}
