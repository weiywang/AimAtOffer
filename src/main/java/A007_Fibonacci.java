package main.java;

public class A007_Fibonacci {


    //递归方法实现
//    public int Fibonacci(int n) {
//        if(n == 0) return 0;
//        if(n == 1) return 1;
//        return Fibonacci(n-1) + Fibonacci(n-2);
//    }


    //非递归方法实现
    public int Fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        int f0 = 0, f1 = 1;
        for(int i = 0; i < n-1; i++){
            int temp = f0 + f1;
            f0 = f1;
            f1 = temp;
        }
        return f1;//在退出时，f1,temp值相同
    }
}
