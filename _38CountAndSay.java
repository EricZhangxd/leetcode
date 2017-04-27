package leetcode;


/**
 * @Author Eric Zhang
 * @Date 2017/3/23 21:48
 */
public class _38CountAndSay {

    public static void main(String[] args) {
        _38CountAndSay a=new _38CountAndSay();
        System.out.println(a.countAndSay(6));
    }
    public String countAndSay(int n) {
        String result="1";
        int i=1;
        while (i<n){
            result=countAndSayForOneString(result);
            i++;
        }
        return  result;
    }
    public String countAndSayForOneString(String str){
        String st="";
        char temp=str.charAt(0);
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==temp)
                count++;
            else{
                st=st+Integer.toString(count)+temp;
                count=1;
                temp=str.charAt(i);
            }
        }
        st=st+Integer.toString(count)+temp;
        return st;
    }
}
