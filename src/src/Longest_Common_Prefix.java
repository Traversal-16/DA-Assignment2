package src;
import java.util.*;
public class Longest_Common_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt ();
		String m[]=new String [n];
		for(int i=0;i<n;i++)
		{
			m[i]=sc.next();
		}
		
		Arrays.sort(m);
		String prefix="";
		int st=0;
		int last=0;
		while(st<=m[0].length()-1 && last<=m[n-1].length()-1 && m[0].charAt(st)==m[n-1].charAt(last))
		{
			st++;
			last++;
		}
		prefix=m[0].substring(0,st);
		System.out.println (prefix);

	}

}
