import org.junit.Test;
import static org.junit.Assert.*;
public class FibonacciTest {
        @Test
        public void TestFibonnaci() {
            Fibonacci fibo = new Fibonacci();
            assertEquals(fibo.calFibonacci(9),34);
            assertEquals(fibo.calFibonacci(8),21);
        }
        @Test
        public void TestproductFib(){
            Fibonacci fibo = new Fibonacci();
            assertEquals(fibo.productFib(714),new int[]{21,34,1});
            assertEquals(fibo.productFib(8), new int[]{35, 55, 0});
        }
}

