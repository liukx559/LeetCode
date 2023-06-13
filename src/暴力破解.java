// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class 暴力破解 {
    public static void main(String[] args) {//大小写敏感
        int[] nums = {7,1,5,3,6,4};

        System.out.println(maxProfit(nums));

    }
    public static int maxProfit(int[] prices) {
        int p1,p2;
        int n=prices.length;
        int cur_max=0;
        for(p1=0;p1<n;p1++)
        {
            int max=0;
            for(p2=p1+1;p2<n;p2++)
            {
                max=prices[p2]-prices[p1];
                if(max>cur_max)
                    cur_max=max;
            }
        }
        return cur_max;

    }
}