import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class 动态规划 {
    public static void main(String[] args) throws IOException {//大小写敏感
//        File f=new File("F:\\JAVA\\lesson1\\src\\nums.txt");
//        Scanner in=new Scanner(f);
//        String str=in.nextLine();
//        String[] s=str.split(",");
//        int[] nums=new int[s.length];
//        for(int i=0;i<s.length;i++)
//            nums[i]=Integer.valueOf(s[i]);
        int[] nums ={7,1,5,3,6,4};


        System.out.println(maxProfit(nums));

    }
    public static int maxProfit(int[] prices) {
        int n=prices.length;

        int[][] dp=new int[2][n];
        dp[1][0]=0;
        dp[0][0]=0-prices[0];
        for(int i=1;i<n;i++)
        {
            //只能买入一次，所以不能是,dp[1][i-1]-prices[i]，只能是从0-
            // dp[0][i]=Math.max(dp[0][i-1],dp[1][i-1]-prices[i]);
            dp[0][i]=Math.max(dp[0][i-1],0-prices[i]);
            dp[1][i]=Math.max(dp[0][i-1]+prices[i],dp[1][i-1]);
        }
        return dp[1][n-1];

    }
}