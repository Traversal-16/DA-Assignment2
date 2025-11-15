package src;
import java.util.*;

public class MINIMUM_WINDOW_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String a=sc.nextLine ();
		String b=sc.nextLine ();
		
		HashMap<Character,Integer> need=new HashMap<>();
		for(char nn:b.toCharArray()) need.put(nn, need.getOrDefault(nn,0)+1);
		
		int left=0;
		HashMap<Character,Integer> window=new HashMap<>();
		int have=0;
		int max=Integer.MAX_VALUE;
		int start=-1;
		for(int right=0;right<a.length();right++)
		{
			char k=a.charAt(right);
			window.put(k,window.getOrDefault(k,0)+1);
			if(need.containsKey(k)&& need.get(k)==window.get(k))
			{
				have++;
			}
			
			while(have==need.size()) 
			{
				if(max>=right-left+1)
				{
					max=right-left+1;
					start=left;
				}
				
				char leftchar=a.charAt(left);
				window.put(leftchar,window.get(leftchar)-1);
				if(need.containsKey(leftchar)&& window.get(leftchar)<need.get(leftchar))
				{
					have--;
				}
				left++;
			}
			
		}
		System.out.println (max==Integer.MAX_VALUE?"NULL":a.substring(start,start+max));
		

	}

}
