package Recurrsion;

public class Subset {
    public static void main(String[] args) {
        System.out.println(removeAR("abdulKhan"));
        removeAR("abdulKhan","")                                         ;
        System.out.println(skipApple("absapplea","apple"));
        System.out.println(skipAppNotApple("absappla","app","apple"));
    }


    // Some basic String Question
    static String removeA(String s ){
        String ans = " ";
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)!='a'){
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
    static String removeAR(String s , int i,String ans  ){


        if(i==s.length()){
            return ans;
        }
        if(s.charAt(i)!='a') {

            ans += s.charAt(i);
        }
      return   removeAR(s,i+1,ans);

    }
    static void removeAR(String s , String ans ){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        if(ch=='a'){
            removeAR(s.substring(1),ans);
        }
        else removeAR(s.substring(1),ans+ch);
//        System.out.println(ans);
    }
    // only with one argument
    static String removeAR(String s ){
        if(s.isEmpty()){
            return "" ;
        }
        char ch = s.charAt(0);
        if(ch=='a'){
            return removeAR(s.substring(1));
        }
        else {
            return ch+removeAR(s.substring(1));
        }
    }
    // Remove or skip a particular String

static String skipApple(String s , String toSkip){
        if(s.isEmpty()){
            return "";

        }
        if(s.startsWith(toSkip)){
           return skipApple(s.substring(toSkip.length()),toSkip);
        }
        else
           return s.charAt(0)+skipApple(s.substring(1),toSkip);
}
static String skipAppNotApple(String s , String toSkip,String dontSkip){
        if(s.isEmpty()){
            return "";

        }
        if(s.startsWith(toSkip)&&!s.startsWith(dontSkip)){
           return skipAppNotApple(s.substring(toSkip.length()),toSkip,dontSkip);
        }
        else
           return s.charAt(0)+skipAppNotApple(s.substring(1),toSkip,dontSkip);
}
}
