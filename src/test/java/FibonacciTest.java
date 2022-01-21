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
            assertArrayEquals(fibo.productFib(714), new int[]{21, 34,1});
            assertArrayEquals(fibo.productFib(1870),new int[]{34,55,1});
            assertArrayEquals(fibo.productFib(800), new int[]{34, 55,0});
        }
}

