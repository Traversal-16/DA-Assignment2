package src;
import java.util.*;
public class Subset_Sets 
{
	static List<List<Integer>> ans=new ArrayList<>();
	public static void subset(int m[],int i,List<Integer> l)
	{
		if(i==m.length)
		{
			ans.add(new ArrayList <>(l));
			return;
		}
		l.add(m[i]);
		subset(m,i+1,l);
		l.remove(l.size()-1);
		subset(m,i+1,l);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt ();
		int m[]=new int [n];
		for (int i=0;i<n;i++) m[i]=sc.nextInt ();
		subset(m,0,new ArrayList<>());
		System.out.println (ans);

	}

}
