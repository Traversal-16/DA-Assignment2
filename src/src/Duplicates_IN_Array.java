package src;
import java.util.*;

public class Duplicates_IN_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt ();
		int m[]=new int [n];
		for(int i=0;i<n;i++) m[i]=sc.nextInt ();
		HashMap<Integer,Integer> hmap=new HashMap <>();
		for(int i:m) hmap.put(i,hmap.getOrDefault(i, 0)+1);
		
		System.out.print ("RESULT : [");
		for(Map.Entry<Integer,Integer> ent:hmap.entrySet())
		{
			if(ent.getValue()>1)
			{
				System.out.print(ent.getKey()+" ");
			}
		}
		System.out.print("]");

	}

}
