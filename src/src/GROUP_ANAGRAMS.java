package src;
import java.util.*;
public class GROUP_ANAGRAMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt ();
		String arr[]=new String [n];
		for(int i=0;i<n;i++) arr[i]=sc.next();
		HashMap<String,List<String>> ans=new HashMap <>();
		for(int i=0;i<n;i++)
		{
			char ch[]=arr[i].toCharArray ();
			Arrays.sort(ch);
			String str=new String (ch);
			List<String> demo=ans.getOrDefault (str,new ArrayList<>());
			demo.add(arr[i]);
			ans.put(str,demo);
		}
		List<List<String>> res=new ArrayList <>(ans.values());
		System.out.println (res);
	}

}
