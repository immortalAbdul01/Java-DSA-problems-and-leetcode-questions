package leetcode;

public class AssignCookies {
    public static void main(String[] args) {
        int [] a = {10,9,8,7,10,9,8,7};
        int [] b ={10,9,8,7};
        System.out.println(findContentChildren(a,b));

    }
    static int findContentChildren(int [] g , int [] s ){
        int count =0;
        int ans = 0 ;
        int j = 0 ;
        for (int i = 0; i < g.length; i++) {

            for ( j = 0; j < s.length; j++) {
                if(ans<count){
                    j++;
                    ans=count;
                }
                if(g[i]==s[j]){
                    count++;

                    break;
                }


            }

        }
        return count;
    }
}
