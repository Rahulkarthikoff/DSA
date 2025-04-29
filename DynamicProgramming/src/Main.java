//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        //System.out.println(fibo(dp,n));

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2;i<=n;i++)
        {
            dp[i] = dp[i-2]+dp[i-1];
        }

        System.out.println(dp[n]);
    }

    public static  int fibo(int[] dp,int a)
    {
        if(a==0 || a== 1)return a;

        if(dp[a] != -1)return dp[a];

        dp[a] = fibo(dp,a-2) + fibo(dp,a-1);

        return dp[a];
    }
}