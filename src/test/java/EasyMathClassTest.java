import org.junit.Test;
import sbt.pdris.EasyMathClass;

import static org.junit.Assert.assertEquals;

public class EasyMathClassTest {
    @Test
    public void testSum() {
        assertEquals(EasyMathClass.sum(3, 2), 5);
    }

    @Test
    public void testMultyply() {
        assertEquals(EasyMathClass.multyply(3, 2), 6);
    }

    @Test
    public void testMinus() {
        assertEquals(EasyMathClass.minus(3, 2), 1);
    }

    @Test
    public void testSquare() {
        assertEquals(EasyMathClass.square(3), 9);
    }
}
