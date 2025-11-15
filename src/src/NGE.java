package src;
import java.util.*;

public class NGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt ();
		int arr[]=new int [n];
		int ans[]=new int [n];
		ans[n-1]=-1;
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		Stack<Integer> st=new Stack <>();
		st.push(arr[n-1]);
		
		for(int i=n-2;i>=0;i--)
		{
			while(!st.isEmpty() && arr[i]>st.peek()) {
				st.pop();
			}
			if(st.isEmpty()) ans[i]=-1;
			else
			{
				ans[i]=st.peek();
			}
			st.push(arr[i]);
			
		}
		for(int i:ans)
		{
			System.out.println (i);
		}

	}

}
