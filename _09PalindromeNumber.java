package leetcode;

/**
 * @Author Eric Zhang
 * @Date 2017/3/17 10:08
 */
public class _09PalindromeNumber {
    public static void main(String[] args) {
        _09PalindromeNumber obj=new _09PalindromeNumber();
        System.out.println( obj.isPalindrome(-12321));
    }
    //判断回文数---》把数转置过来在判断相不相等
    //复数肯定不是回文数
    //若一个数%10得0肯定也不是回文数
    public boolean isPalindrome(int x){
        int temp=x;
        int rev=0;
        while (temp>0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        return rev==x;
    }
}
