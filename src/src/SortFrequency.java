package src;

import java.util.*;

public class SortFrequency 
{
	static class student implements Comparable<student>
	{
		int value;
		int freq;
		student(int v,int f)
		{
			this.value=v;
			this.freq=f;
		}
		@Override
		public int compareTo(student o) {
			// TODO Auto-generated method stub
			if(this.freq==o.freq) return this.value-o.value;
			else
			{
				return o.freq-this.freq;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt ();
		int m[]=new int [n];
		for (int i=0;i<n;i++) m[i]=sc.nextInt ();
		
		HashMap<Integer,Integer> hmap=new HashMap <>();
		for(int i:m) hmap.put(i, hmap.getOrDefault (i,0)+1);
		
		List<student> l=new ArrayList <>();
		for(int i:m) l.add(new student (i,hmap.get(i)));
		
		Collections.sort(l);
		for(int i=0;i<n;i++)
		{
		System.out.println (l.get(i).value);
		}
	}

}
