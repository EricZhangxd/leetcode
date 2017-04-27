package leetcode;

/**
 * @Author Eric Zhang
 * @Date 2017/3/23 21:34
 */
public class _35SearchInsertPosition {
    public static void main(String[] args) {
        _35SearchInsertPosition a=new _35SearchInsertPosition();
        int nums[]={1,3,5,6};
        System.out.println(a.searchInsert(nums,7));
    }
    public int searchInsert(int[] nums,int target){
        int i=0;
        while (i<nums.length){
            if (target>nums[i])
                i++;
            else return i;
        }
        return i;
    }
}
