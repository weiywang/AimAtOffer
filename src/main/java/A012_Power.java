package main.java;

public class A012_Power {
    public double Power(double base, int exponent) {
        if(exponent == 0){
            return 1;
        }
        if(exponent == 1){
            return base;
        }

        int t_exponent = Math.abs(exponent);
        double res = positivePower(base, t_exponent);

        return exponent > 0 ? res : 1/res;
    }

    public double positivePower(double base, int exponent){
        if(exponent == 0){
            return 1;
        }
        if(exponent == 1){
            return base;
        }

        double t = positivePower(base, exponent>>1);
        t *= t;

        if((exponent & 0x01) == 1){
            t *= base;
        }
        return t;
    }
}
