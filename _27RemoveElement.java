package leetcode;

/**
 * @Author Eric Zhang
 * @Date 2017/3/22 10:38
 */
public class _27RemoveElement {
    public static void main(String[] args) {
        _27RemoveElement a=new _27RemoveElement();
        int nums[]={3,2,2,3,3,2};
        System.out.println(a.removeElement(nums,3));
        for (int i=0;i<nums.length;i++)
            System.out.println(nums[i]);
    }
    public int removeElement(int[] nums, int val) {
        int j=0;
        for (int i=0;i<nums.length;i++){
           if (nums[i]!=val)
               nums[j++]=nums[i];
        }
        return j;
    }
}
