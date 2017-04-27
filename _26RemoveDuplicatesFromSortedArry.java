package leetcode;

/**
 * @Author Eric Zhang
 * @Date 2017/3/21 15:48
 */
public class _26RemoveDuplicatesFromSortedArry {
    public static void main(String[] args) {
        _26RemoveDuplicatesFromSortedArry a=new _26RemoveDuplicatesFromSortedArry();
        int nums[]={1,1,1,1,5};
        //System.out.println(a.removeDuplicates(nums));
        System.out.println(a.removeDup(nums));
    }
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        int i=1;
        while (i<len){
            if (nums[i]==nums[i-1]){
                for (int j=i;j<len-1;j++){
                    nums[j]=nums[j+1];
                }
                len--;
            }
            else i++;
        }
        return len;
    }

    public int removeDup(int[] nums){
        int j=1;//j指向需要被重新赋值的地址
        for (int i=1;i<nums.length;i++){
            if (nums[i]!=nums[i-1])
                nums[j++]=nums[i];
        }
        return j;
    }
}
