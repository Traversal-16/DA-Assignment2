package src;
import java.util.*;
public class Peak_Element 
{
	public static int ans(int arr[])
	{
		if(arr.length==0) return -1;
		if(arr.length==1) return 0+1;
		if(arr[0]>arr[1]) return 0+1;
		if(arr[arr.length-2]<arr[arr.length-1]) return arr.length;
		
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
			{
				return i+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt ();
		int m[]=new int [n];
		for(int i=0;i<n;i++) m[i]=sc.nextInt ();
		
		System.out.println (ans(m));
	}

}
