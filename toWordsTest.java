package towords;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER Aspire
 */
public class ToWordsTest {
    
    public ToWordsTest() {
    }
    
    ToWords n = new ToWords();

    @Test
    public void testOnes(){
        assertEquals("two", n.convert("2.00"));
    }

    @Test
    public void testTens(){
        assertEquals("twenty", n.convert("20.00"));
    }
    
    @Test
    public void testOnesAndTens(){
        assertEquals("thirty one", n.convert("31.00"));
    }
    
    @Test
    public void testHundreds(){
        assertEquals("two hundred", n.convert("200.00"));
    }
    
    @Test
    public void testHundredsMixed(){
        assertEquals("two hundred thirty one", n.convert("231.00"));
    }
    
    @Test
    public void testDecimalOnes(){
        assertEquals("two hundred thirty one and five cents", n.convert("231.05"));
    }    
    
    

}
