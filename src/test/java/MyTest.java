import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void testOddAndEven() {
        assertEquals(true, OppositesAttract.isLove(1, 4));
    }

    @Test
    public void testEvenAndEven() {
        assertEquals(false, OppositesAttract.isLove(2, 2));
    }

    @Test
    public void testOddAndOdd() {
        assertEquals(false, OppositesAttract.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
        assertEquals(true, OppositesAttract.isLove(0, 1));
    }

    private static class OppositesAttract {
        public static boolean isLove(final int flower1, final int flower2) {
       return flower1 % 2 != flower2 % 2;
        }
    }
}

//return (flower1 == flower2) & false || (flower1 != flower2) & true;