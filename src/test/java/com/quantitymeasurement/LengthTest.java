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

    @Test
    public void givenNullAndTwoFeet_ShouldReturnNotEquals() {
        Length length1 = new Length(Unit.INCH, 0.0);
        Length length2 = null;
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenZeroInchAndZeroFeet_shouldReturnEqualLength() {
        Length length1 = new Length(Unit.FEET, 0.0);
        Length length2 = new Length(Unit.INCH, 0.0);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneInchAndOneFeet_shouldReturnEqualLength() {
        Length length1 = new Length(Unit.INCH, 1.0);
        Length length2 = new Length(Unit.FEET, 1.0);
        boolean compareCheck = length1.compare(length2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneFeet_shouldReturnEqualLength() {
        Length length1 = new Length(Unit.FEET, 1.0);
        Length length2 = new Length(Unit.FEET, 1.0);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAndOneFeet_shouldReturnEqualLength() {
        Length length1 = new Length(Unit.FEET, 1.0);
        Length length2 = new Length(Unit.INCH, 12.0);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd12Inch_shouldReturnEqualLength() {
        Length length1 = new Length(Unit.INCH, 12.0);
        Length length2 = new Length(Unit.INCH, 12.0);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd12Feet_shouldReturnNotEquals() {
        Length length1 = new Length(Unit.INCH, 1.0);
        Length length2 = new Length(Unit.FEET, 12.0);
        boolean compareCheck = length1.compare(length2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_shouldReturnTrue() {
        Length length1 = new Length(Unit.INCH, 12.00);
        Length length2 = new Length(Unit.FEET, 1.00);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenNullAnd1Feet_shouldReturnNotEquals() {
        Length length1 = new Length(Unit.NULL, 1.0);
        Length length2 = new Length(Unit.FEET, 12.0);
        boolean compareCheck = length1.compare(length2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneYardIsEqualToOneYard_shouldReturnEquals() {
        Length length1 = new Length(Unit.YARD, 1.0);
        Length length2 = new Length(Unit.YARD, 1.0);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void givenOneYardAndZeroYard_shouldReturnNotEquals() {
        Length length1 = new Length(Unit.YARD, 1.0);
        Length length2 = new Length(Unit.YARD, 0.0);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenOneYardAndOneFeet_shouldReturnNotEquals() {
        Length length1 = new Length(Unit.YARD, 1.0);
        Length length2 = new Length(Unit.FEET, 1.0);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenOneYardAndOneInch_shouldReturnNotEquals() {
        Length length1 = new Length(Unit.YARD, 1.0);
        Length length2 = new Length(Unit.INCH, 1.0);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenOneYardAndThreefeet_shouldReturnEquals() {
        Length length1 = new Length(Unit.YARD, 1.0);
        Length length2 = new Length(Unit.FEET, 3.0);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneYardAndThirtySixInch_shouldReturnEquals() {
        Length length1 = new Length(Unit.YARD, 1.0);
        Length length2 = new Length(Unit.INCH, 36.0);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenThirtySixInchAndOneYard_shouldReturnEquals() {
        Length length1 = new Length(Unit.INCH, 36.0);
        Length length2 = new Length(Unit.YARD, 1.0);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenThreeFeetAndOneYard_shouldReturnEquals() {
        Length length1 = new Length(Unit.FEET, 3.0);
        Length length2 = new Length(Unit.YARD, 1.0);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneYardAndOneYard_shouldReturnEquals() {
        Length length1 = new Length(Unit.YARD, 1.0);
        Length length2 = new Length(Unit.YARD, 1.0);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }
}
