package leetcode;

/**
 * @Author Eric Zhang
 * @Date 2017/3/24 15:23
 */
public class _58LengthOfLastWord {
    public static void main(String[] args) {
        _58LengthOfLastWord obj=new _58LengthOfLastWord();
        System.out.println(obj.lengthOfastWord("aa  "));
    }
    public int lengthOfastWord(String s){
        int count=0;
        int index=s.length()-1;
        while (index>=0){
            if (s.charAt(index)==' ')
                index--;
            else break;
        }
        while (index>=0){
            if (s.charAt(index)!=' ')
            {
                count++;
                index--;
            }
            else break;
        }
       return count;
    }
}
