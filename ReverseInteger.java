package leetcode;

import java.util.Random;

/**
 * @Author Eric Zhang
 * @Date 2017/3/3 11:41
 */
public class ReverseInteger {
    public static void main(String[] args) {
        //Random rand=new Random(50);
        //int test=rand.nextInt();
        int value=-2147483648;
        //int value=-2147483641;
        System.out.println(reverse(value));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
    public static int reverse(int x){
   /*     int result=0;
        if(x<0 && x>Integer.MIN_VALUE) {
            x=-x;
            while (x>=10){
                result=x%10+result*10;
                x/=10;
                if (result>(Integer.MAX_VALUE/10))
                    return 0;
            }
            if(result==(Integer.MAX_VALUE/10)&&x>(Integer.MAX_VALUE%10+1))
                return 0;
            else {
                result = result * 10 + x;
                return result * -1;
            }
        }
        else if(x>0)
        {
            while (x>=10){
                result=x%10+result*10;
                x/=10;
                if (result>(Integer.MAX_VALUE/10))
                    return 0;
            }
            if(result==(Integer.MAX_VALUE/10)&&x>(Integer.MAX_VALUE%10)) {
                return 0;
            }
            else {
                result = result * 10 + x;
                return result;
            }
        }
        else if(x==0){
            return 0;
        }
        else return 0;
    }*/
        long res = 0;
        int p =Math.abs(x);
        System.out.println(p);
        while (p > 0) {
            int mod = p % 10;
            p = p / 10;
            if(res * 10 >=Integer.MAX_VALUE) return 0;
            res = res * 10 + mod;
        }
        if(x<0) res=0-res;
        return (int)res;

    }
}
