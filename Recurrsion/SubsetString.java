package Recurrsion;

import java.util.ArrayList;
import java.util.List;

public class SubsetString {
    public static void main(String[] args) {
    subsetsOfstring("","ABCD");
        System.out.println(subsetsOfString2("ABD",""));
        ArrayList<String> list = new ArrayList<>();
        subset2("Abd", "" ,list);
        subsequence("ABD","");
    }
    //subset all combination of a string
    static void subsetsOfstring(String ans , String s){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        subsetsOfstring(ans+ch,s.substring(1));
        subsetsOfstring(ans,s.substring(1));
    }
    // returning an arraylist of all subsets of a string
    static ArrayList<String> subsetsOfString2(String s, String ans ){
        if(s.isEmpty()){
            ArrayList<String> lsit = new ArrayList<>();
            lsit.add(ans);
            return lsit;
        }
        char ch = s.charAt(0);
        ArrayList<String> left = subsetsOfString2(s.substring(1),ans+ch);
        ArrayList<String> right = subsetsOfString2(s.substring(1),ans);
        left.addAll(right);
        return left;


    }
    // same question passing ArrayList in Argument
    static void subset2(String s , String ans , ArrayList<String> list){
        if(s.isEmpty()){
            list.add(ans);
            System.out.println(list);
            return;
        }
        char ch = s.charAt(0);
        subset2(s.substring(1),ans+ch,list);
        subset2(s.substring(1),ans,list);
    }
    // getting subsequences from a string
    static void subsequence(String s , String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        subsequence(s.substring(1),ans+ch);
        subsequence(s.substring(1),ans);
        subsequence(s.substring(1),ans+(ch+0));

    }

}
