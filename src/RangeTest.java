import org.junit.Test;

import static org.junit.Assert.*;

public class RangeTest {

    @Test
    public void isInRange() {
        Range range = new Range(10, 20);
        assertTrue(range.isInRange(15));
    }
}