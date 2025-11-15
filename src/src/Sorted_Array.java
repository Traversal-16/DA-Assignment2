package src;

import java.util.*;

public class Sorted_Array 
{
	public static int search(int m[],int target)
	{
		int left=0;
		int right=m.length-1;
		
		while(left<=right)
		{
			int mid=((int)(left+right)/2);
			if(m[mid]==target) return mid+1;
			else if(m[left]<=m[mid])
			{
				if(target>=m[left]&& target<=m[mid])
				{
					right=mid-1;
				}
				else
				{
					left=mid+1;
				}
				
			}
			else
			{
				if(target>=m[mid] && target<=m[right])
				{
					left=mid+1;
				}
				else
				{
					right=mid-1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt ();
		int m[]=new int [n];
		for (int i=0;i<n;i++) m[i]=sc.nextInt ();
		int target=sc.nextInt ();
		
		System.out.println (search(m,target));

	}

}
