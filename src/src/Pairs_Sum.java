package src;
import java.util.*;

public class Pairs_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt ();
		int m[]=new int [n];
		for(int i=0;i<n;i++) m[i]=sc.nextInt ();
		int ans=0;
		int target=sc.nextInt ();
		HashMap<Integer,Integer> hmap=new HashMap <>();
		for(int i=0;i<n;i++)
		{
			if(hmap.containsKey(target-m[i]))
			{
				ans+=hmap.get(target-m[i]);
			}
			hmap.put(m[i], hmap.getOrDefault(m[i], 0)+1);
		}
		System.out.println (ans);

	}

}
