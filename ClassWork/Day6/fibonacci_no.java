package ICP.ClassWork.Day6;

public class fibonacci_no {
    
    public int fib(int n) {
        return fibo(n);
    }
    public static int fibo(int n){
        if(n==1 || n==0) return n;
        return fibo(n-1)+fibo(n-2);
    }
}
