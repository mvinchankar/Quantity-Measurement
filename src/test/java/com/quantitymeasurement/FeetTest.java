package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class FeetTest {

    @Test
    public void givenOfZeroFeetAndZeroFeet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenZeroFeetAndTwoFeet_ShouldReturnNotEquals() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(2.0);
        Assert.assertNotEquals(feet1,feet2);
    }
}
