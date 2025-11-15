package src;
import java.util.*;

public class TRIPLET_ZERO_SUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt ();
		int m[]=new int [n];
		for(int i=0;i<n;i++) m[i]=sc.nextInt ();
		int ans=0;
		
//		for(int i=0;i<n;i++)
//		{		
//			for(int j=i+1;j<n;j++)
//			{
//				for(int k=j+1;k<n;k++)
//				{
//					if(m[i]+m[j]+m[k]==0)
//					{
//						ans++;
//					}
//				}
//			}
//		}
//		System.out.println (ans);
		
		Arrays.sort(m);
		for(int i=0;i<n-2;i++)
		{
			int left=i+1;
			int right=n-1;
			while(left<=right)
			{
				if(m[i]+m[left]+m[right]==0)
				{
					System.out.println (ans+1+". ["+m[i]+" "+m[left]+" "+m[right]+"]");
					ans++;
					left++;
					right--;
				}
				else if(m[i]+m[left]+m[right]<0)
				{
					left++;
				}
				else
				{
					right--;
				}
			}
		}
		
	}

}
