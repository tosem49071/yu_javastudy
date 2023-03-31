import java.util.Scanner;

//사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자.

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner Scan=new Scanner(System.in);
		System.out.println("세 개의 정수 입력(10 20 30):");
		int num1=Scan.nextInt();
	    int num2=Scan.nextInt();
	    int num3=Scan.nextInt();
		
	    int max;
	    System.out.println("최대값:");
	    System.out.println(max);
	    int min;
	    System.out.println("최소값");
	    System.out.println(min);
		int total;
		System.out.println("합계:");
		System.out.println(num1+num2+num3);
	    double avg=total/3.0;
	    System.out.println("평균");*/
		
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		
		int total=a+b+c;
		double avg=total/3.0;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("total="+total);
		System.out.printf("평균:%.2f\n",avg);
		                     //----- = ---

		//최대값
		int max=a;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		System.out.println("최대값:"+max);
		//최소값
		int min=a;
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		System.out.println("최소값:"+min);
		
		
		}

}
