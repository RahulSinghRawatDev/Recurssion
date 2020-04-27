package Recurssion.exercise;

public class StringSubString {


    static void function(String val,String curr,int index)
    {
        if (index == val.length()){
            System.out.println(curr);
            return;
        }


        function(val,curr,index+1);
        function(val,curr+val.charAt(index),index+1);
    }
    public static void main(String[] args) {
        function("ABCDEFGH","",0);
    }
}
