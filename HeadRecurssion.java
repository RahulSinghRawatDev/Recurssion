package Recurssion;

public class HeadRecurssion {

    public static void main(String args[]){
            function(3);
    }

    static void function(int pos){
        if (pos>0) {
            function(pos-1);
            System.out.println(pos);
        }
    }
}
