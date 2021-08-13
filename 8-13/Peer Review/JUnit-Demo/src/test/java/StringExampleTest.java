import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StringExampleTest {
    @Test
    public void TestForCompareFirstAndLastCharacterAreSame(){

        StringExample se=new StringExample();
        boolean actVal=se.compareFirstAndLastCharactersAreSame("abab");
        boolean exptValue=true;
        assertEquals(actVal,true);
       // assertTrue(actVal);
        //assertFalse(actVal);
        //assertEquals(actVal,false);

    }
}
