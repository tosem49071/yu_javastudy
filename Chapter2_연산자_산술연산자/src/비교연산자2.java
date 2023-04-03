//  조건문 (if)

public class 비교연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //char c1=(char)((Math.random()*26)+65);
                   // ------------------------ 괄호로 묶어주기!
        //System.out.println(c1);               //***** 알파벳 랜덤으로 가져오는 방법 *****
        
        
        char c1=(char)((Math.random()*26)+65);  //***** 대문자 : 65 , 소문자 : 97 *****
        char c2=(char)((Math.random()*26)+65);
        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        // 'A'= 65, 'a'=97 => char는 연산시에
        boolean b1=c1==c2;
        System.out.println("b1="+b1);
        
        b1=c1!=c2;
        System.out.println("b1="+b1);
        
        b1=c1<c2;
        System.out.println("b1="+b1);
        
        b1=c1>c2;
        System.out.println("b1="+b1);
        
        b1=c1<=c2;
        System.out.println("b1="+b1);
        
        b1=c1>=c2;
        System.out.println("b1="+b1);
        
	}

}
