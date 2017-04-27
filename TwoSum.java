package leetcode;

/**
 * @Author Eric Zhang
 * @Date 2017/3/1 16:11
 */
public class TwoSum {
    public int[] twoSum(int[] nums,int target){
        int len=nums.length;
        for (int i=0;i<len;i++)
            for (int j=i+1;j<len;j++)
                if (nums[i]+nums[j]==target)
                    return new int[]{i,j};
        return null;
    }

    public static void main(String[] args) {
       int nums[]={2,7,11,15};
       int target=9;
       TwoSum sum=new TwoSum();
       int out[]=sum.twoSum(nums,target);
        System.out.println(out[0]+" and "+out[1]);
    }

}
