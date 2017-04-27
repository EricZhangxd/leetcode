package leetcode;

import java.util.Stack;

/**
 * @Author Eric Zhang
 * @Date 2017/3/22 11:44
 */
public class _28ImplementstrStr {
    public static void main(String[] args) {
        _28ImplementstrStr a=new _28ImplementstrStr();
        String haystack="a";
        String needle="a";
        System.out.println(a.strStr(haystack,needle));
    }
    public int strStr(String haystack, String needle) {
        if (haystack.length()<needle.length())
            return -1;
        if (needle.length()==0)
            return 0;
        int count;
        for (int i=0;i<=haystack.length()-needle.length();i++) {
            count=0;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) == needle.charAt(j))
                    count++;
                else break;
            }
            if (count==needle.length())
                return  i;
        }
        return -1;
    }
}
