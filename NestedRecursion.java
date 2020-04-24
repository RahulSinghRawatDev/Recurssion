package Recurssion;

public class NestedRecursion {

    public static void main(String args[]){
        System.out.println(function(98));
    }

    static int function(int val){
        if (val>100){
            return (val - 10);
        }else {
            return function(function(val + 11));
        }
    }

}
