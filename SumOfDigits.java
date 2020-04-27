package Recurssion.exercise;

public class SumOfDigits {

    static int sum(int val){
        if (val<10)
            return val;

        return sum(val/10) + val%10;
    }

    public static void main(String[] args) {
        System.out.println(sum(8));
    }
}
