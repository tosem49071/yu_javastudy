/*
 * 1.
   
     %d => 정수값
     %f => 실수값
     %c => 문자
     %s => 문자열
     
     int a=10;
   


 */
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		double d=10.5;
		char c='A';
		
		System.out.println("a="+a+",d="+d+",c="+c);
		System.out.printf("a=%d,b=%.1f,c=%c",a,d,c);
	}

}
