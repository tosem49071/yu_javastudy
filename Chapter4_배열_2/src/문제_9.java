import java.util.Arrays;

public class 문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		// 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[2]+" "+arr[4]+" "+arr[arr.length-1]);
		System.out.println("세번째 숫자:"+arr[2]);
		System.out.println("다섯번째 숫자:"+arr[4]);
		System.out.println("마지막 숫자:"+arr[arr.length-1]);
		                                 //------------ 마지막 숫자

	}

}
