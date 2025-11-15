package src;

import java.util.*;

public class LPS_optimised {
	
	public static int expand (String s,int left,int right)
	{
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
		{
			left--;
			right++;
		}
		return right-left-1;
	}
	public static void main (String args[])
	{
		System.out.println ("ENTER INPUT :");
		Scanner sc=new Scanner (System.in);
		String s=sc.next();
		int n=s.length();
		int maxLen=1;
		String ans="";
		
		for(int i=0;i<n;i++)
		{
			int len1=expand(s,i,i);
			int len2=expand(s,i,i+1);
			int len=Math.max(len1,len2);
			int start=i-(len-1)/2;
			if(len>maxLen)
			{
				maxLen=len;
				ans=s.substring(start,start+len);
			}
			
		}
		System.out.println (ans);
	}

}
