package Recurssion.exercise;

public class TowerOfHanoi {
    static void function(int n, int a, int b, int c) {
        if (n > 0) {
            function(n - 1, a, c, b);
            System.out.println("...." + n + "....a..." + a + "...b..." + b + ".......c.." + c);
            function(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        function(3, 1, 2, 3);
    }
}
