import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RectangleTest {

    @Test
    public void testForGetArea(){
        Rectangle rectangle=new Rectangle();
        int actRes=rectangle.getArea(10,30);

        assertEquals(actRes,300);
    }
    @Test
    public void testForGetAreaWithMultipleValues(){
        Rectangle rectangle=new Rectangle();
        assertEquals(rectangle.getArea(10,50),500);
        assertEquals(rectangle.getArea(20,50),1000);
        assertEquals(rectangle.getArea(5,50),250);

    }
    @Test
    public void testForGetParameter(){
        Rectangle rectangle=new Rectangle();
        assertEquals(rectangle.getParameter(10,20),60);
    }

}
