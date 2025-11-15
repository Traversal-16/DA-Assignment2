package src;
import java.util.*;

public class KTH_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt ();
		int m[]=new int [n];
		for(int i=0;i<n;i++) m[i]=sc.nextInt ();
		int k=sc.nextInt ();
		
		PriorityQueue<Integer> pq=new PriorityQueue <>((a,b)->(b-a));
		
		for(int i:m) pq.add(i);
		
		while(k-->1)
		{
			pq.poll();
		}
		
		System.out.println (pq.peek());
		

	}

}
