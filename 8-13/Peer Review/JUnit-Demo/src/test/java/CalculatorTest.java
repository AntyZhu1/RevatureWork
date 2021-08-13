import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void setUp(){
        calculator=new Calculator();
    }

    @Test
    public void test_addNum(){
        // Arrange
        Calculator cal=new Calculator();

        // Act
        int actualRes;
        actualRes= cal.addNum(20,20);

        // Assert
        int expectedRes=40;
        assertEquals(expectedRes, actualRes);

        //assertEquals(actualRes,expectedRes);

    }

@Test
    public void testForFinMaxNum(){
        int actRes=calculator.findMaxNumber(new int[]{1,5,7});

        int expRes=7;
        assertEquals(expRes,actRes);

        int act2=calculator.findMaxNumber(new int[]{-12,-13,-5,-7,-1});
        int exp2=-1;

        assertEquals(exp2,act2);
}

@Test
    public void testForGetCube(){
        int actRes=calculator.getCube(3);
        assertEquals(27,actRes);

}
@Test
    public void testForReverseString(){
        assertEquals("cba",calculator.reverseString("abc"));
}

@Test
    public void testforMultiple(){
        Calculator calculator=new Calculator();
       int actRes= calculator.multipe(20,20);
        assertEquals(400,actRes);

}


}
