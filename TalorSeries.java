package Recurssion.exercise;

/***************Taylor's Series*******
 * e to power x  = 1 + x/1 + (x power 2)/2! + (x power 3)/3!
 *
 ***********************************/

public class TalorSeries {
    static double val = 0.0;
    static double numerator = 1;
    static double denominator = 1;

    static double functionRecucrsively(int x, int y){
      if (y == 0)
          return 1;
      else {
          val = functionRecucrsively(x,y-1);
          numerator = numerator * x;
          denominator = denominator * y;
          return val + numerator/denominator;
      }
    }

    static double functionIteratively(int x,int y){
        double sum = 1.0;
        double num = 1.0;
        double denom = 1.0;
        for(int i = 1; i <= 0; i ++){
            num = num * x;
            denom = denom * 1;
            sum = sum + num/denom;

        }
        return val;
    }
    public static void main(String[] args){
       System.out.println(functionRecucrsively(4,15));
        System.out.println(functionIteratively(4,15));
    }
}
