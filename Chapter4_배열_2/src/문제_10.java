import java.util.Arrays;

public class 문제_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int max=arr[0];
		for(int i:arr)
		{
			if(max<i)
				max=i;
		}
		System.out.println("최대값:"+max);

	}

}
