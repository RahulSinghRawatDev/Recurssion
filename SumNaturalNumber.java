package Recurssion.exercise;

public class SumNaturalNumber {
    public static int sumRecursively(int number) {
        if (number == 0)
            return 0;
        else
            return sumRecursively(number - 1) + number;
    }

    public static int sumIteratively(int number){
        int sum = 0;
        for (int pos = 0; pos<=number ;pos++){
            sum = sum + pos;
        }
        return sum;
    }

    public static void main(String[] args){
        sumRecursively(5);
        sumIteratively(5);
    }
}
