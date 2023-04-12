
public class 사용자정의_데이터형_1 {
	/*
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student s1=new Student();
		// int a=10  ==> 주소  
		System.out.println("s1="+s1);		
		
		// s1=name,kor,eng,math
		s1.name="홍길동";
		s1.kor=90;
		s1.eng=80;
		s1.meth=78;
		
		Student s2=new Student();
		System.out.println("s2="+s2);
        // s2=name,kor,eng,math
		s2.name="심청이";
		s2.kor=80;
		s2.eng=70;
		s2.math=68;
		 
		Student s3=new Student();
		System.out.println("s3="+s3);
		// s3=name,kor,eng,math
		s3.name="강감찬";
		s3.kor=90;
		s3.eng=80;
		s3.math=78;
		
		System.out.println(s1.name+" "+s1.kor+" "+s1.eng+" "+s1.math);
		System.out.println(s2.name+" "+s2.kor+" "+s2.eng+" "+s2.math);
		System.out.println(s3.name+" "+s3.kor+" "+s3.eng+" "+s3.math);	

	}

}
