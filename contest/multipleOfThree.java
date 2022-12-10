package contest;

public class multipleOfThree {
    public static void main(String[] args) {
        System.out.println(mulOf3(10));

    }
    static String mulOf3(int n){
        if(n%3==0){
            return "YES";
        }
        return "NO";
    }
}
