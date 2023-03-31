import java.util.Scanner;

/*정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
        작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
        나머지는 F)*/

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner Scan=new Scanner(System.in);
		System.out.println("점수를 입력하세요(90 90 90):");
		int kor=Scan.nextInt();
		int eng=Scan.nextInt();
		int math=Scan.nextInt();
		
		int total=kor+eng+math;
		System.out.println("총점:"+total);
		double avg=total/3.0;
		System.out.println("평균:"+avg);
		
		if(avg>=90)
		{
			System.out.println("A");
		}
		if(avg>=80)
		{
			System.out.println("B");
		}
		if(avg>=70)
		{
			System.out.println("C");
		}
		if(avg>=60)
		{
			System.out.println("D");
		}
		if(avg>60)
		{
			System.out.println("F");
		}*/
		
		int kor=(int)(Math.random()*101);
		int eng=(int)(Math.random()*101);
		int math=(int)(Math.random()*101);
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
		
		int temp=(kor+eng+math)/3;
		char ch='A';
		if(temp>=90 && temp<=100)
			ch='A';
		if(temp>=80 && temp<90)
			ch='B';
		if(temp>=70 && temp<80)
			ch='C';
		if(temp>=0 && temp<70)
			ch='D';
		if(temp<60)
			ch='E';
		System.out.println("학점:"+ch);
		
		
		
		

	}

}
