package q_13_power;

/**
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

    public static double powerBit(double base, int n) {
        double res = 1,curr = base;
        int exponent;
        if(n>0){
            exponent = n;
        }else if(n<0){
            if(base==0)
                throw new RuntimeException("分母不能为0");
            exponent = -n;
        }else{// n==0
            return 1;// 0的0次方
        }
        //1）当b是奇数时，那么有 a^b = a * a^*(b-1)
        //2）当b是偶数时，那么有 a^b = a^(b/2) * a^(b/2)
        while(exponent!=0){
            if((exponent&1)==1)
                res*=curr;
            curr*=curr;// 翻倍
            exponent>>=1;// 右移一位
        }
        return n>=0?res:(1/res);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 0));
    }
}
