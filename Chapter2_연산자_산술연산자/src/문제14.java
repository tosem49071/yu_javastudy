import java.util.Random;
/*
 * 두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 나머지를 출력하는 프로그램을 작성해 보자.
 */
public class 문제14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int no=(int)(Math.random()*2);
		int a1=(int)(Math.random()*26);
		int a2=(int)(Math.random()*26);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1/a2);*/
		
		int a,b;
		a=(int)(Math.random()*100)+1;
		b=(int)(Math.random()*100)+1;
		System.out.printf("a=%d,b=%d,a%%b=%d",a,b,a%b);
		

	}

}
