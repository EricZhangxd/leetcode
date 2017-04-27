package leetcode;

/**
 * @Author Eric Zhang
 * @Date 2017/3/24 18:43
 */
public class _69Sqrtx {
    public static void main(String[] args) {
        _69Sqrtx a=new _69Sqrtx();
        System.out.println(a.mySqrt(36));
    }
    public int mySqrt(int x){
        double begin=0;
        double end=x;
        double result=1;
        double mid=1;
        while (Math.abs(result-x)>0.000001){
            mid=(begin+end)/2;
            result=mid*mid;
            if (result>x)
                end=mid;
            else begin=mid;
        }
        return (int)mid;
    }
}
