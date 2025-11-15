package src;
import java.util.*;
public class Spiral_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int m=sc.nextInt ();
		int n=sc.nextInt ();
		int arr[][]=new int [m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt ();
			}
		}
		
		ArrayList<Integer> ans=new ArrayList <>();
		int top=0;
		int bottom=m-1;
		int left=0;
		int right=n-1;
		while(left<=right && top<=bottom)
		{
			
			for(int i=left;i<=right;i++)
			{
				ans.add(arr[top][i]);
			}
			top++;
			
			for(int i=top;i<=bottom;i++)
			{
				ans.add(arr[i][right]);
			}
			right--;
			
			if(left<=right)
			{
				for(int i=right;i>=left;i--)
				{
					ans.add(arr[bottom][i]);
				}
				bottom--;
			}
			
			if(top<=bottom)
			{
				for(int i=bottom;i>=top;i--)
				{
					ans.add(arr[i][left]);
				}
				left++;
			}
		}
		System.out.println (ans);

	}

}
