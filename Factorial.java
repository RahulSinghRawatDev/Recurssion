package Recurssion.exercise;

public class Factorial {

    static int factRecurssively(int number){
        if (number == 0)
            return 1;
        else
            return factRecurssively(number - 1)* number;
    }

    static int factIteratively(int number){
        int fact = 1;
        for (int pos = 1; pos <= number; pos++){
            fact = fact * pos;
        }
        return fact;
    }

    public static void main(String[] args){
        factRecurssively(5);
        factIteratively(5);
    }


}
