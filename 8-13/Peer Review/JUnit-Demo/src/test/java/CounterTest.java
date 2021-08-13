
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    Counter counter;

    @BeforeEach
    public void setup() {
        System.out.println("Before Test");
        counter = new Counter();
    }

    @Test
    public void testForCounterIncre() {
        System.out.println("Increment test");
        int countValue = counter.increment();
        assertEquals(countValue, 1);
    }

    @Test
    public void testForCounterDecre() {
        System.out.println("Decrement test");
        int countValue = counter.decrement();
        assertEquals(countValue, -1);
    }

    @AfterEach
    public void tearDown(){
        System.out.println("After Test");
        counter=null;
    }
}
