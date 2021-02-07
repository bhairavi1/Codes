import java.util.ArrayList;
import java.util.Scanner;

public class PythTripet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		int n=sc.nextInt();
		int sum=0;
		
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		flag=checkTriplet(a, n);
		if(flag==true)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}
	}

	private static boolean checkTriplet(int[] a, int n) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		int sum=0;
		boolean flag=false;
		for(int j=0;j<a.length;j++)
		{
			list.add(a[j]*a[j]);
		}
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				sum=list.get(i)+list.get(j);
				if(list.contains(sum))
				{
					flag=true;
					return flag;
				}
				else
				{
					flag=false;
				}
			}
		}
		// TODO Auto-generated method stub
		return flag;
	}

}
