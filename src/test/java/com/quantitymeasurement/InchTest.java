package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class InchTest {

    @Test
    public void givenOfZeroInchAndZeroInch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenZeroInchAndTwoInch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(2.0);
        Assert.assertNotEquals(inch1,inch2);
    }
}
