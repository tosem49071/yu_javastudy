import java.util.Arrays;

public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		//초기화		
		for(int i=0;i<arr.length;i++)
		{ 
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		// 출력(3의 배수)
		for(int i:arr)
		{
			if(i%3==0)
				System.out.print(i+" ");		
		}
		

	}

}
