package Recurssion;

public class TreeRecursion {
    public static void main(String args[]){
        function(3);
    }

    static void function(int val){
        if (val>0){
            System.out.println(val);
            function(val-1);
            function(val-1);
        }
    }
}
