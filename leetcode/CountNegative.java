package leetcode;

public class CountNegative {
    public static void main(String[] args) {
        int[][] grid = {{5, 1, 0}, {-5, -5, -5}};
        System.out.println(countNegative2(grid));
    }

    static int countNegatives(int[][] grid) {
        int negativeCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                if (grid[i][j] < 0) {
                    negativeCount++;
                }
              else break;


            }

        }
        return negativeCount;

    }
    // fast approch
    static int countNegative2(int [] [ ] grid){
        int c = grid[0].length;
        int i = grid.length-1;
        int j = 0;
        int count = 0;
        while(i>=0&&j<c){
            if(grid[i][j]<0){
                count+=c-j;
                i--;
            }
            else
                j++;
        }
        return count;
    }
}
