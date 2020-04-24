package Recurssion;

public class InDirectRecurssion {

    public static void main(String args[]){
          functionA(20);
    }

    static void functionA(int val){
        if (val>0){
            System.out.println(val);
            functionB(val - 2);
        }
    }

    static void functionB(int val){
        if (val>0) {
            System.out.println(val);
            functionA(val / 2);
        }
    }


}
