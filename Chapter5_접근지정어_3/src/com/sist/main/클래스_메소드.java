package com.sist.main;
import static java.lang.Math.random;
// Math클래스는 지원하는 모든 메소드가 static
/*
 *    import 패키지명.클래스명
 *    import 패키지명.*(3개 이상이면 * 사용)
 *    import static java.lnag.Math.random;
 *    java.lang.* => 자동 로딩이 된다, import를 사용하지 않는다
 *    ----------- String, Math
 *    
 *    void method()
 *    {
 *    	return; // 자동 설정 (생략이 가능) => void에서만
 *    
 *    }
 *    class A
 *    {
 *    	 a(){}
 *    }
 */
// Math클래스는 지원하는 모든 메소드가 static
public class 클래스_메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		if(a%2!=0)
		{
			System.out.println("a="+a);
			return;
		}
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		return;
		
		/*int a=(int)(random()*100)+1;
		System.out.println(a);
		return; //(void일때 자동으로 설정되어서 생략 가능)*/
	}

}
