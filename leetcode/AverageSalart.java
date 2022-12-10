package leetcode;

public class AverageSalart {
    public static void main(String[] args) {
        int [] arr ={4000,3000,1000,2000};
        System.out.println(avg(arr));
    }
    static double avg(int [] salary) {

        int min = 5050050;
        int max = 0;
        int ans = 0;
        int count = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > max) {
                max = salary[i];
            }
            if (salary[i] < min) {
                min = salary[i];
            }


        }
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] != max && salary[i] != min) {
                ans += salary[i];
                count++;
            }
        }
        return (double)(Math.abs((double)ans) /Math.abs((double) count));
    }
}
