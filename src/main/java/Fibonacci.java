public class Fibonacci {
    public Fibonacci(int product){

    }
    public int calFibonacci(int n){
        if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        return calFibonacci(n-1) + calFibonacci(n-2);
    }
}
