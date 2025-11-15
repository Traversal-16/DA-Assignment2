package src;

import java.util.*;

public class Missing_Range 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER INPUT :");
        int n = sc.nextInt();
        int m[] = new int[n];
        for (int i = 0; i < n; i++) m[i] = sc.nextInt();

        int low = sc.nextInt();
        int up = sc.nextInt();
        int st = -1, end = -1;
        int c = 0;
        List<String> ans = new ArrayList<>();

        while (low <= up) 
        {
            if (c < n && m[c] == low) 
            {
                if (st != -1) 
                {
                    if (end == -1) ans.add(String.valueOf(st));
                    else ans.add(st + "->" + end);
                    st = -1;
                    end = -1;
                }
                c++; 
            } 
            else 
            {
                if (st == -1) st = low;
                end = low; 
            }
            low++;
        }

        if (st != -1) {
            if (end == -1) ans.add(String.valueOf(st));
            else ans.add(st + "->" + end);
        }

        System.out.println(ans);
    }
}
