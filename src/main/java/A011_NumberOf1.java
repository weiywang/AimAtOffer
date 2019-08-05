package main.java;

public class A011_NumberOf1 {
    public int NumberOf1(int n) {
        int mask = 0x01;

        int res = 0;
        int t = n;
        while(t != 0){
            if((t & mask) == 1){//必须要加括号，== 优先级高于 &
                res += 1;
            }
            t = t >>> 1;
        }
        return res;
    }
}
