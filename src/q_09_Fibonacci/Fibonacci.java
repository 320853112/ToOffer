package q_09_Fibonacci;

public class Fibonacci {
    public static int fibonacci(int n) {
        int next1 =0;
        int next2 =1;
        if(n==0) return next1;
        if(n==1) return next2;
        int res = 1;
        for(int i=2;i<=n;i++){
            res = next1+next2;
            next1=next2;
            next2 = res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(2));
    }
}
