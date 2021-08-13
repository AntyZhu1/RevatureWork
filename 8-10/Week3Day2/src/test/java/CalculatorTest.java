import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception{

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() {
        int i = Calculator.addNumber(2,4);
        assert (i == 6);
    }


}
