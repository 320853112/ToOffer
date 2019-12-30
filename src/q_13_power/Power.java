package q_13_power;

/*
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

保证base和exponent不同时为0
 */
public class Power {
    public static double power(double base, int exponent) {
        double res  = 1;
        int abs = Math.abs(exponent);
        for (int i = 0; i < abs; i++) {
            res*=base;

        }
        if(exponent<0) res = 1/res;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(power(2, -3));
    }
}
