package Recurssion.exercise;

public class StringPalindromCheck {

    static boolean isCheck(String val,int start,int end){
        if (start == end)
            return true;
        if (start>end)
            return true;
        if (val.charAt(start) != val.charAt(end))
            return false;
        return isCheck(val,start+1,end-1);
    }

    public static void main(String[] args) {
        String name = "RaaR";
        System.out.println("Number is palindrome  "+isCheck(name,0,name.length()-1));
    }
}
