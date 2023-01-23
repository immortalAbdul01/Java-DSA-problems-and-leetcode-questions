package leetcode;

public class Find_the_Town_Judge {
    public static void main(String[] args) {
    int [] [] arr ={{1,2},{2,3}};
        System.out.println(findJudge(3,arr));
    }
    public static int findJudge(int n, int[][] trust) {
    if(n<2){
        return n;
    }
            int sum=0;
            int judge=0;
        for (int i = 0; i < trust.length; i++) {
            for (int j = 0; j <trust.length ; j++) {
                if(trust[i][1]==trust[j][1]){
                    sum++;
                }

                if(sum==n-1){

                    judge=trust[i][1];
                    break;
                }

            }
            sum=0;



        }

        if(judge>0) {


            for (int i = 0; i < trust.length; i++) {
                if (trust[i][0] == judge) {
                    return -1;
                }


            }
        }
        else{
            return -1;
        }
            return judge;
    }
}
