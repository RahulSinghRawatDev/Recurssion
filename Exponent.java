package Recurssion.exercise;

public class Exponent {

    public static int powerRecursively(int base,int power){
        if (power == 0)
            return 1;
        else
            return powerRecursively(base,power-1) * base;
    }

    public static int powerIteravely(int base,int power){
        int val = 1;
        for (int pos = 0; pos < power ;pos++){
            val = val * base;
        }
        return val;
    }

    public static void main(String[] args){
        System.out.println(powerRecursively(2,19));
        System.out.println(powerIteravely(2,19));
    }
}
