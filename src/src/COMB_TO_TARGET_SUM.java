package src;
import java.util.*;
public class COMB_TO_TARGET_SUM 
{
	static HashSet<List<Integer>> hs=new HashSet <>();
	public static void comb (int arr[],int i,int target,List<Integer> l)
	{
		if(i==arr.length)
		{
			if(target==0)
			{
				hs.add(new ArrayList <>(l));
			}
			return ;
		}
		if(target<0)
		{
			return ;
		}
		l.add(arr[i]);
		comb(arr,i,target-arr[i],l);
		l.remove(l.size()-1);
		comb(arr,i+1,target,l);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt ();
		int m[]=new int [n];
		for(int i=0;i<n;i++)
		{
			m[i]=sc.nextInt ();
		}
		int target=sc.nextInt ();
		comb(m,0,target,new ArrayList <>());
		System.out.println (hs);
	}

}
