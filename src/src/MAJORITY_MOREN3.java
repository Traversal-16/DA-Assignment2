package src;
import java.util.*;

public class MAJORITY_MOREN3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt ();
		int m[]=new int [n];
		for (int i=0;i<n;i++) m[i]=sc.nextInt ();
		
		int cand1=-1;
		int cand2=-1;
		int c1=0;
		int c2=0;
		
		for (int i=0;i<n;i++)
		{
			if(m[i]==cand1)
			{
				c1++;
			}
			else if(m[i]==cand2)
			{
				c2++;
			}
			else if(c1==0)
			{
				cand1=m[i];
				c1=1;
			}
			else if(c2==0)
			{
				cand2=m[i];
				c2=1;
			}
			else
			{
				c1--;
				c2--;
			}
		}
		c1=0;c2=0;
		for(int i:m)
		{
			if(i==cand1) c1++;
			else if(i==cand2) c2++;
		}
		if(c1>n/3)
		{
			System.out.println (cand1);
		}
		if(c2>n/3)
		{
			System.out.println (cand2);
		}

	}

}
