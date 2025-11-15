package src;
import java.util.*;

public class MAJORITY_MORE_N2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt ();
		int m[]=new int [n];
		for (int i=0;i<n;i++) m[i]=sc.nextInt ();
		
		int cand=0;
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(c==0)
			{
				cand=m[i];
			}
			else if(m[i]==cand)
			{
				c++;
			}
			else
			{
				c--;
			}
		}
		c=0;
		for(int i:m)
		{
			if(i==cand) c++;
		}
		if(c>n/2)
		{
			System.out.println ("MAJOR ELEMENT : "+cand);
		}
		else
		{
			System.out.println ("NO MAJORITY ELEMENT");
		}

	}

}
