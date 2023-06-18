import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class 贪心 {
    public static void main(String[] args) throws IOException {//大小写敏感
        File f=new File("F:\\JAVA\\lesson1\\src\\nums.txt");
        Scanner in=new Scanner(f);
        String str=in.nextLine();
        String[] s=str.split(",");
        int[] nums=new int[s.length];
        for(int i=0;i<s.length;i++)
            nums[i]=Integer.valueOf(s[i]);


        System.out.println(maxProfit(nums));

    }
    public static int maxProfit(int[] prices) {
        int p1,p2;
        int n=prices.length;
        int cur_max=0;
        int low=Integer.MAX_VALUE;
        //取左边最大值
        for(p1=0;p1<n;p1++)
        {
            low=Math.min(low,prices[p1]);
            if(prices[p1]-low>cur_max)
            cur_max=prices[p1]-low;
        }



        return cur_max;

    }
}