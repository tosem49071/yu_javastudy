/*
 * 1. 반복 제어문
 *    => 특정부분을 제외 반복 수행 (continue)
 *       while : 조건식으로 이동
 *       for : 증가식
 *    => 반복 종료 (break;)
 * 
 * 1. continue
 * 2. i>50
 * 3. 4 
 * 4.
 *  1) char[] c=new char[10];
 *  2) int[] n={0,1,2,3,4,5};
 *  3) char[] day={'일','월','화','수','목','금','토'};
 *  4) boolean[] bool={true,false,false,true};
 * 5. int i=0;i<alpha.length;i++
 * 
 * 또는
 *    for(char c:alpha)
 *    {
 *       System.out.print(c);
 *    }
 */
public class 문제_1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha= {'a','b','c','d'};
		for(char i=0;i<alpha.length;i++)
			System.out.print(alpha[i]);

	}

}
