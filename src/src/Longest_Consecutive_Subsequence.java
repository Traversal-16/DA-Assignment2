package src;

import java.util.*;

public class Longest_Consecutive_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt ();
		int m[]=new int [n];
		for(int i=0;i<n;i++) m[i]=sc.nextInt ();
		
		int c=1;
		Arrays.sort(m);
		int ans=0;
		for(int i=1;i<n;i++)
		{
			if(m[i]==m[i-1]+1)
			{
				c++;
			}
			else if(m[i]==m[i-1])
			{
				continue;
			}
			else
			{
				ans=Math.max(ans, c);
				c=1;
			}
				
		}
		ans=Math.max(ans, c);
		System.out.println (ans);

	}

}
