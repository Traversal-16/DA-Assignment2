package src;
import java.util.*;

public class LIS 
{
	public static int lis(int m[],int i,int prev,int dp[][])
	{
		int ans1=0;
		if(i==m.length)
		{
			return 0;
			
		}
		if(dp[i][prev+1]!=-1) return dp[i][prev+1];
		if(prev==-1 || m[i]>m[prev])
		{
			ans1=1+lis(m,i+1,i,dp);
		}
		int ans2=lis(m,i+1,prev,dp);
		return dp[i][prev+1]=Math.max(ans1, ans2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt ();
		int m[]=new int [n];
		for (int i=0;i<n;i++)  m[i]=sc.nextInt ();
		int dp[][]=new int [n][n+1];
		for(int t[]:dp) Arrays.fill(t,-1);
		System.out.println (lis(m,0,-1,dp));

	}

}
