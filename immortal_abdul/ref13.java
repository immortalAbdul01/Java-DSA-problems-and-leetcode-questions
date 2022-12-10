package immortal_abdul;

public class ref13 {
    // Problem Tower of honai

  public static void towerOfHonai(int n, String s , String h , String d){
      if(n==1){
          System.out.println("transfered "+n+" from "+s+" to "+ d);
return;
      }

      towerOfHonai(n-1,s,d,h);
      System.out.println("transfered "+n+" from "+s+" to "+ d);
      towerOfHonai(n-1,h,s,d);


  }
    // problem Reverse a string
    public static void reverseStr(String s ,int n ){
        if(n==0){
            System.out.println(s.charAt(n));
            return;

        }
        System.out.print(s.charAt(n));
        reverseStr(s,n-1);// going from n -1 to 0
    }

    // Problem
    // find the first and last occurence of a string
    //solution
    /* first declare two varibles to get track of the first and last occurrence and if the character is found
    at first(-1) then update the first as index otherwise update the last as index
     */
    public static int first=-1;
    public static int last=-1;
    public static void FirstAndLast(String name, int index, char element){
        if(index==name.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar=name.charAt(index);

        if(currentChar==element){
            if(first==-1){
                first=index;
            }
            else {
                last=index;
            }
        }

        FirstAndLast(name,index+1,element);
    }
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
          return   false;
        }
        return isSorted(arr,idx+1);


    }
    public static String name2="";

    public static void moveChar(String name ,int idx,String newStr,int count,char ch ){
        if(idx== name.length()){
            for (int i =0 ;i<count;i++){
                newStr+=ch;
            }
            System.out.println(newStr);
            return;

        }
        char Cch=name.charAt(idx);
        if(Cch==ch){
          count++  ;
          moveChar(name,idx+1,newStr,count,ch);
        }
        else {
            newStr+=Cch;
            moveChar(name,idx+1,newStr,count,ch);

        }


    }
    public static boolean map []= new boolean[26];
    public static void removeDuplicate (int idx ,String name ,String newStr){
        if(idx==name.length()){
            System.out.println(newStr);
            return;
        }
        char Cc= name.charAt(idx);
        if(map[Cc-'a']){
            removeDuplicate(idx+1,name,newStr);

        }else {
            newStr+=Cc;
            map[Cc-'a']=true;
            removeDuplicate(idx+1,name,newStr);
        }
    }
    public static void AanaHaiTohAa(int idx, String name , String newString){
        if(idx==name.length()){
            System.out.println(newString);
            return;
        }
        char CureenCh=name.charAt(idx);
        AanaHaiTohAa(idx+1,name,newString+CureenCh);

        AanaHaiTohAa(idx+1,name,newString);
    }
    public static void main(String[] args) {
        System.out.println("This is file is for recursion problems part 2 ");
        // calling towerOfHonai proble function
        towerOfHonai(3,"S","H","D");
        String str="xyzaxx";
        // calling reverse string function
        reverseStr(str, str.length()-1);
        // calling first and last function here
        FirstAndLast(str,0,'x');
        // calling is sorted function here
        int array[]={1,2,3,4,4,6,7,8,9};
        System.out.println(  isSorted(array,0));
        //calling moveChar
    moveChar("abbdbudbbb",0,"",0,'b');
    removeDuplicate(0,"aabbddkhajutyr","");
    // subsequences of a strin IMP question for interview
    AanaHaiTohAa(0,"abdc","");
    }
}
