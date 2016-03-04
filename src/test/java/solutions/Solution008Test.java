package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution008.
 */
public class Solution008Test {
    @Test
    public void input__b11228552307_Is0() {
        Solution008 solution008 = new Solution008();
        assertEquals(0, solution008.myAtoi(" b11228552307"));
    }

    @Test
    public void input_abc_Is0() {
        Solution008 solution008 = new Solution008();
        assertEquals(0, solution008.myAtoi("abc"));
    }

    @Test
    public void inputNullIs0() {
        Solution008 solution008 = new Solution008();
        assertEquals(0, solution008.myAtoi(null));
    }

    @Test
    public void inputEmptyIs0() {
        Solution008 solution008 = new Solution008();
        assertEquals(0, solution008.myAtoi(""));
    }

    @Test
    public void inputAllSpacesIs0() {
        Solution008 solution008 = new Solution008();
        assertEquals(0, solution008.myAtoi("     "));
    }

    @Test
    public void input0Is0() {
        Solution008 solution008 = new Solution008();
        assertEquals(0, solution008.myAtoi("0"));
    }

    @Test
    public void input1Is1() {
        Solution008 solution008 = new Solution008();
        assertEquals(1, solution008.myAtoi("  1  "));
    }

    @Test
    public void inputPlus1IsPlus1() {
        Solution008 solution008 = new Solution008();
        assertEquals(1, solution008.myAtoi("  +1  "));
    }

    @Test
    public void inputMinus1IsMinus1() {
        Solution008 solution008 = new Solution008();
        assertEquals(-1, solution008.myAtoi("  -1  "));
    }

    @Test
    public void input123Is123() {
        Solution008 solution008 = new Solution008();
        assertEquals(123, solution008.myAtoi("  123  "));
    }

    @Test
    public void inputInvalidPlusMinus2Is0() {
        Solution008 solution008 = new Solution008();
        assertEquals(0, solution008.myAtoi("  +-2  "));
    }

    @Test
    public void inputMinus0012a42IsMinus12() {
        Solution008 solution008 = new Solution008();
        assertEquals(-12, solution008.myAtoi("  -0012a42  "));
    }

    @Test
    public void inputMinus2147483647IsMinus2147483647() {
        Solution008 solution008 = new Solution008();
        assertEquals(Integer.MAX_VALUE * -1L, solution008.myAtoi("-2147483647"));
    }

    @Test
    public void input2147483648IsMinus2147483647() {
        Solution008 solution008 = new Solution008();
        assertEquals(Integer.MAX_VALUE, solution008.myAtoi("2147483648"));
    }

    @Test
    public void input9223372036854775809Is2147483647() {
        Solution008 solution008 = new Solution008();
        assertEquals(Integer.MAX_VALUE, solution008.myAtoi("9223372036854775809"));
    }

    @Test
    public void inputMinus9223372036854775809IsMinus2147483648() {
        Solution008 solution008 = new Solution008();
        assertEquals(Integer.MIN_VALUE, solution008.myAtoi("-9223372036854775809"));
    }

    @Test
    public void input18446744073709551617Is2147483647() {
        Solution008 solution008 = new Solution008();
        assertEquals(Integer.MAX_VALUE, solution008.myAtoi("18446744073709551617"));
    }
}
