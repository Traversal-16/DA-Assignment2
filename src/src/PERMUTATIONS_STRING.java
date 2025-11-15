package src;

import java.util.*;

public class PERMUTATIONS_STRING 
{
	static HashSet<String> ans=new HashSet<>();
	public static void permute(char ch[],boolean vis[],List<Character> l)
	{
		if(l.size()==ch.length)
		{
			String ansok="";
			for(int j=0;j<l.size();j++) ansok+=l.get(j);
			ans.add(ansok);
			return ;
		}
		
		for(int j=0;j<ch.length;j++)
		{
			if (!vis[j])
			{
				vis[j]=true;
				l.add(ch[j]);
				permute(ch,vis,l);
				vis[j]=false;
				l.remove(l.size()-1);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		permute(s.toCharArray(),new boolean[s.length()],new ArrayList <>());
		System.out.println (ans);
	}

}
