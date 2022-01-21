import java.sql.SQLOutput;
import java.util.Arrays;

public class Fibonacci {
    public Fibonacci(){
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
    public int[] productFib(int product){
        int n = 0;
        int fibN = 0;
        int fibN1 = 0;
        while(fibN*fibN1 < product){
            n++;
            fibN = calFibonacci(n);
            fibN1 = calFibonacci(n+1);
            if (fibN*fibN1 == product) {
                return new int[]{fibN, fibN1, 1};
            }
        }
        return new int[]{fibN,fibN1,0};

    }
}
