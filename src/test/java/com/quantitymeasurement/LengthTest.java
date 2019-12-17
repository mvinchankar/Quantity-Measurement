package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class LengthTest {

    @Test
    public void givenOfZeroFeetAndZeroFeet_ShouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenZeroFeetAndTwoFeet_ShouldReturnNotEquals() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 2.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOfZeroInchAndZeroInch_ShouldReturnEqual() {
        Length length1 = new Length(Unit.INCH, 0.0);
        Length length2 = new Length(Unit.INCH, 0.0);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void givenZeroInchAndTwoInch_ShouldReturnNotEquals() {
        Length length1 = new Length(Unit.INCH, 0.0);
        Length length2 = new Length(Unit.INCH, 2.0);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenZeroInchAndTwoFeet_ShouldReturnNotEquals() {
        Length length1 = new Length(Unit.INCH, 0.0);
        Length length2 = new Length(Unit.FEET, 2.0);
        Assert.assertNotEquals(length1, length2);
    }
}
