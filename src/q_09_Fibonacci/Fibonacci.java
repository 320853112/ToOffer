package q_09_Fibonacci;

public class Fibonacci {
    public static int fibonacci(int n) {
        if ( n < 1 ) return 0;
        int g = 1, f = 2;
        while ( --n!=0 ) {
            f = f + g;
            g = f - g;
        }
        return g;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(2));
    }
}
