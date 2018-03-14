import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NumeralTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {0, ""}, { 1, "I" }, { 2, "II" }, { 3, "III" }, { 4, "IV" }, { 5, "V" }, { 6, "VI" }, { 7, "VII" }, { 8, "VIII" }
        });
    }

    public NumeralTest(int value, String expected) {
        _value = value;
        _expected = expected;
    }

    private int _value;
    private String _expected;

    @Test
    public void InputReturnsExpected() {
        assertEquals(_expected, Numeral.toNumeral(_value));
    }

}