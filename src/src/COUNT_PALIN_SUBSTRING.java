package src;
import java.util.*;

public class COUNT_PALIN_SUBSTRING 
{
	public static int expand(String s,int left,int right)
	{
		int cnt=0;
		while(left>=0 && right<s.length()  && s.charAt(left)==s.charAt(right))
		{
			cnt++;
			left--;
			right++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String s=sc.next();
		
		int n=s.length();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int len=expand(s,i,i);
			int len2=expand(s,i,i+1);
			sum+=len+len2;
		}
		System.out.println (sum);

	}

}
