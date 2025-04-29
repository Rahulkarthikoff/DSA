import java.util.Arrays;
import java.util.HashSet;

public class PracticeQns {
    public static void main(String[] args) {
        int n = 11;

        int coins[] = {9,6,5,1};
        int[] dp = new int [n+1];
        Arrays.fill(dp, -1);
        int count = 0;
        count = findChange(coins, n,dp);
        System.out.println(count);
    }

    public static int findChange(int[] coins,int n,int[] dp)
    {
        if(n == 0)return 0;
        if(dp[n]!=-1)return dp[n];
        int res = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++)
        {
            if(coins[i] <= n)
            {
                int sub = findChange(coins, n-coins[i],dp);
                if(sub != Integer.MAX_VALUE && sub+1<res)
                {
                    res = sub+1;
                }
            }
        }
        dp[n] = res;
        return res;
    }
}
