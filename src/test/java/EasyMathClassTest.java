import org.junit.Test;
import sbt.pdris.EasyMathClass;

import static org.junit.Assert.assertEquals;

public class EasyMathClassTest {
    @Test
    public void testSum() {
        assertEquals(EasyMathClass.sum(3, 2), 5);
    }
}
