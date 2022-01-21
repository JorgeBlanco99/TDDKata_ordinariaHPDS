import org.junit.Test;
import static org.junit.Assert.*;
public class FibonacciTest {
        @Test
        public void TestFibonnaci() {
            Fibonacci fibo = new Fibonacci(6);
            assertEquals(fibo.calFibonacci(9),34);
            assertEquals(fibo.calFibonacci(8),21);
        }
}

