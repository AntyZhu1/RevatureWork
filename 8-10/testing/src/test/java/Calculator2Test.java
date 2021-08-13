import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Calculator2Test {
    @Test
    public void addNumberTest(){
        // Arrange
        Calculator2 cal = new Calculator2();

        // Act
        int actualResult = cal.addNumber(10,20);

        // Assert
        int expectedResult = 30;
        assertEquals(expectedResult, actualResult);
    }
}
