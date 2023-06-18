// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] nums= {-1,0,3,5,9,12};
    System.out.println(search(nums,9));
    }
    public static int BSearch(int[] nums, int low, int high,int target)
    {
        if(low>high)return -1;
        int mid=(low+high)/2;
        if(nums[mid]<target)
            return (BSearch(nums,mid+1,high,target));
        else if(nums[mid]>target)
            return (BSearch(nums,low,mid-1,target));
        else
            return mid;

    }
    public static int search(int[] nums, int target) {
        int low,high;
        low=0;
        high=nums.length;
        return BSearch(nums,low,high,target);
    }
}