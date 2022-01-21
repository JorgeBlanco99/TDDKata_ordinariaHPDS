import org.junit.Test;
import static org.junit.Assert.*;
public class FibonacciTest {
        @Test
        public void TestFibonnaci() {
            Fibonacci fibo = new Fibonacci(6);
            assertEquals(fibo.calFibonacci(1),1);
            assertEquals(fibo.calFibonacci(2),1);
        }
}

