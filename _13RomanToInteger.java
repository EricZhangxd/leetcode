package leetcode;

import java.util.HashMap;

/**
 * @Author Eric Zhang
 * @Date 2017/3/17 10:36
 */
public class _13RomanToInteger {
    public static void main(String[] args) {
        _13RomanToInteger obj = new _13RomanToInteger();
       // obj.romanToInt("XI");
        System.out.println(obj.romanToInt("MMMCCCXCIII"));
        //System.out.println(obj.romanToIntMapMethod("MMMCCCXCIII"));
    }
    //使用Map
    public int romanToIntMapMethod(String s){
        if (s==null&&s.length()==0)
            return -1;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int len=s.length();
        int result=0;
        for (int i=0;i<len-1;i++){
            if (map.get(s.charAt(i+1))>map.get(s.charAt(i)))
                result-=map.get(s.charAt(i));
            else
                result+=map.get(s.charAt(i));
        }
        return result+map.get(s.charAt(len-1));
    }

    //用数组的方法
    public int romanToInt(String s) {
        int nums[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1])
                sum -= nums[i];
            else
                sum += nums[i];
        }
        return sum + nums[nums.length - 1];
    }
}
