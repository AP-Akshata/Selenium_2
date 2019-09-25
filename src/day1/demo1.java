package day1;
import java.util.*;

/*public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of subjects");
		float n=sc.nextInt();
		System.out.println("Enter student marks");
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			sum+=a;
		}
		float avg=sum/n;
		System.out.println(sum);
		System.out.println(avg);
		
	}

}*/
public class demo1 {

	public static void main(String[] args) {
		int rev=0,rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int a=sc.nextInt();
		while(a>0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println("Reverse of the no is:"+rev);
	}
		
}