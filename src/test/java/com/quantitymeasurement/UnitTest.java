package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

    @Test
    public void givenUnitToConvertInto_When2YardAnd72Inch_ShouldReturnTrue() {
        boolean compareCheck = Unit.compare(new Length(Unit.YARD, 2.0),
                new Length(Unit.INCH, 72.0));
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenUnitToConvertInto_When2YardAnd6Feet_ShouldReturnTrue() {
        boolean compareCheck = Unit.compare(new Length(Unit.YARD, 2.0),
                new Length(Unit.FEET, 6.0));
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenUnitToConvertInto_When2YardAnd0Inch_ShouldReturnFalse() {
        boolean compareCheck = Unit.compare(new Length(Unit.YARD, 2.0),
                new Length(Unit.INCH, 0.0));
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenUnitToConvertInto_When2YardAnd0Feet_ShouldReturnFalse() {
        boolean compareCheck = Unit.compare(new Length(Unit.YARD, 2.0),
                new Length(Unit.FEET, 0.0));
        Assert.assertFalse(compareCheck);
    }

}
