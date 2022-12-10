package immortal_abdul;

import java.util.Scanner;

public class ref21 {
    public static String timeConversion(String s) {

        int hh= (int)s.charAt(0)-'0';
        int h2=(int)s.charAt(1)-'0';
        String m1= String.valueOf(s.charAt(3)-'0');
        String m2= String.valueOf(s.charAt(4)-'0');
        String m3= String.valueOf(s.charAt(6)-'0');
        String m4= String.valueOf(s.charAt(7)-'0');
        String FinalOutPut="";

        int cal=hh+h2;



        if(s.charAt(8)=='A'){
            String ss= String.valueOf(s.charAt(0)+""+s.charAt(1)+""+s.charAt(2)+""+s.charAt(3)+""+s.charAt(4)+""+s.charAt(5)+""+s.charAt(6)+""+s.charAt(7));
            return ss;
        }
        if(s.charAt(0)=='0'){

       int fullTime=h2+12;
       String ff =String.valueOf(fullTime);
            FinalOutPut=ff+":"+m1+m2+":"+m3+m4;
        }
        else if(cal==3&&s.charAt(8)=='P'){
            String ss= String.valueOf(s.charAt(0)+""+s.charAt(1)+""+s.charAt(2)+""+s.charAt(3)+""+s.charAt(4)+""+s.charAt(5)+""+s.charAt(6)+""+s.charAt(7));
            return ss;

        }
        else if(cal==3&&s.charAt(8)=='A')
        {
            String ss= String.valueOf(0+""+0+""+s.charAt(2)+""+s.charAt(3)+""+s.charAt(4)+""+s.charAt(5)+""+s.charAt(6)+""+s.charAt(7));
            return ss;
        }
        else if(s.charAt(0)=='1'){


                String first= String.valueOf(cal-1);
                String second=String.valueOf(1);
                String fullTime=second+first;

                int getTime= Integer.parseInt(fullTime);
                int fi=getTime+12;
if(fi>23){
    FinalOutPut="00"+":"+m1+m2+":"+m3+m4;


}
else {
    FinalOutPut=fi+":"+m1+m2+":"+m3+m4;

}




        }


        return FinalOutPut;

        // Write your code here

    }

    public static void main(String[] args) {
//        System.out.println("yes this    is  working ");
        Scanner sc =new Scanner(System.in);
        String  result=sc.next();
        System.out.println(  timeConversion(result));

    }
}
