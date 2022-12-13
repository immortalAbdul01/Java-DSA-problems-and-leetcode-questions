package leetcode;

public class LongesCommonPrefix {
    public static void main(String[] args) {
String [] arr ={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));

    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;

    }
    static String longestPrefix(String [ ] strs){
        if(strs==null||strs.length==0) {
            return "";
        }
            int i= 1 ;
            String pre = strs[0];
            while(i<strs.length){
                while (strs[i].indexOf(pre)!=0){
                    pre=pre.substring(0,pre.length()-1);
                }
                i++;


            }
        return pre;
    }
}
