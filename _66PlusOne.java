package leetcode;

/**
 * @Author Eric Zhang
 * @Date 2017/3/24 16:16
 */
public class _66PlusOne {
    public static void main(String[] args) {
        int[] nums={9,9,9};
        _66PlusOne obj=new _66PlusOne();
        obj.plusOne(nums);
    }
    public int[] plusOne(int[] digits) {
        int flag=0;
        for (int i=digits.length-1;i>=0;i--){
            if (digits[i]+1>9){
                digits[i]=(digits[i]+1)%10;
                if (i==0)
                    flag=1;
            }
            else {
                digits[i]=digits[i]+1;
                break;
            }
        }
        if (flag==1)
             return resort(digits);
        else return digits;
    }

    public  int[] resort(int[] digits){
        int[] dig=new int[digits.length+1];
        for (int i=digits.length-1;i>=0;i--){
            dig[i+1]=digits[i];
        }
        dig[0]=1;
        return dig;
    }
}
