package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class ConvertorTest {

    @Test
    public void givenOfZeroFeetAndZeroFeet_ShouldReturnEqual() {
        Convertor feet1 = new Convertor(Unit.FEET, 0.0);
        Convertor feet2 = new Convertor(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenZeroFeetAndTwoFeet_ShouldReturnNotEquals() {
        Convertor feet1 = new Convertor(Unit.FEET, 0.0);
        Convertor feet2 = new Convertor(Unit.FEET, 2.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOfZeroInchAndZeroInch_ShouldReturnEqual() {
        Convertor convertor1 = new Convertor(Unit.INCH, 0.0);
        Convertor convertor2 = new Convertor(Unit.INCH, 0.0);
        Assert.assertEquals(convertor1, convertor2);
    }

    @Test
    public void givenZeroInchAndTwoInch_ShouldReturnNotEquals() {
        Convertor convertor1 = new Convertor(Unit.INCH, 0.0);
        Convertor convertor2 = new Convertor(Unit.INCH, 2.0);
        Assert.assertNotEquals(convertor1, convertor2);
    }

    @Test
    public void givenZeroInchAndTwoFeet_ShouldReturnNotEquals() {
        Convertor convertor1 = new Convertor(Unit.INCH, 0.0);
        Convertor convertor2 = new Convertor(Unit.FEET, 2.0);
        Assert.assertNotEquals(convertor1, convertor2);
    }

    @Test
    public void givenNullAndTwoFeet_ShouldReturnNotEquals() {
        Convertor convertor1 = new Convertor(Unit.INCH, 0.0);
        Convertor convertor2 = null;
        Assert.assertNotEquals(convertor1, convertor2);
    }

    @Test
    public void givenOneYardAndThirtySixInch_shouldReturnEquals() {
        Convertor convertor1 = new Convertor(Unit.YARD, 1.0);
        Convertor convertor2 = new Convertor(Unit.INCH, 36.0);
        boolean compareCheck = convertor1.compare(convertor1, convertor2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenZeroInchAndZeroFeet_shouldReturnEqualLength() {
        Convertor convertor1 = new Convertor(Unit.FEET, 0.0);
        Convertor convertor2 = new Convertor(Unit.INCH, 0.0);
        Assert.assertNotEquals(convertor1, convertor2);
    }

    @Test
    public void givenOneInchAndOneFeet_shouldReturnEqualLength() {
        Convertor convertor1 = new Convertor(Unit.INCH, 1.0);
        Convertor convertor2 = new Convertor(Unit.FEET, 1.0);
        boolean compareCheck = convertor1.compare(convertor1, convertor2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneYardIsEqualToOneYard_shouldReturnEquals() {
        Convertor convertor1 = new Convertor(Unit.YARD, 1.0);
        Convertor convertor2 = new Convertor(Unit.YARD, 1.0);
        boolean equals = convertor1.equals(convertor2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOneFeetAndOneFeet_shouldReturnEqualLength() {
        Convertor convertor1 = new Convertor(Unit.FEET, 1.0);
        Convertor convertor2 = new Convertor(Unit.FEET, 1.0);
        boolean compareCheck = convertor1.compare(convertor1, convertor2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAndOneFeet_shouldReturnEqualLength() {
        Convertor convertor1 = new Convertor(Unit.FEET, 1.0);
        Convertor convertor2 = new Convertor(Unit.INCH, 12.0);
        boolean compareCheck = convertor1.compare(convertor1, convertor2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd12Inch_shouldReturnEqualLength() {
        Convertor convertor1 = new Convertor(Unit.INCH, 12.0);
        Convertor convertor2 = new Convertor(Unit.INCH, 12.0);
        boolean compareCheck = convertor1.compare(convertor1, convertor2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd12Feet_shouldReturnNotEquals() {
        Convertor convertor1 = new Convertor(Unit.INCH, 1.0);
        Convertor convertor2 = new Convertor(Unit.FEET, 12.0);
        boolean compareCheck = convertor1.compare(convertor1, convertor2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_shouldReturnTrue() {
        Convertor convertor1 = new Convertor(Unit.INCH, 12.00);
        Convertor convertor2 = new Convertor(Unit.FEET, 1.00);
        boolean compareCheck = convertor1.compare(convertor1, convertor2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenNullAnd1Feet_shouldReturnNotEquals() {
        Convertor convertor1 = new Convertor(Unit.NULL, 1.0);
        Convertor convertor2 = new Convertor(Unit.FEET, 12.0);
        boolean compareCheck = convertor1.compare(convertor1, convertor2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneYardAndZeroYard_shouldReturnNotEquals() {
        Convertor convertor1 = new Convertor(Unit.YARD, 1.0);
        Convertor convertor2 = new Convertor(Unit.YARD, 0.0);
        Assert.assertNotEquals(convertor1, convertor2);
    }

    @Test
    public void givenOneYardAndOneFeet_shouldReturnNotEquals() {
        Convertor convertor1 = new Convertor(Unit.YARD, 1.0);
        Convertor convertor2 = new Convertor(Unit.FEET, 1.0);
        Assert.assertNotEquals(convertor1, convertor2);
    }

    @Test
    public void givenOneYardAndOneInch_shouldReturnNotEquals() {
        Convertor convertor1 = new Convertor(Unit.YARD, 1.0);
        Convertor convertor2 = new Convertor(Unit.INCH, 1.0);
        Assert.assertNotEquals(convertor1, convertor2);
    }

    @Test
    public void givenOneYardAndThreefeet_shouldReturnEquals() {
        Convertor convertor1 = new Convertor(Unit.YARD, 1.0);
        Convertor convertor2 = new Convertor(Unit.FEET, 3.0);
        boolean compareCheck = convertor1.compare(convertor1, convertor2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenThirtySixInchAndOneYard_shouldReturnEquals() {
        Convertor convertor1 = new Convertor(Unit.INCH, 36.0);
        Convertor convertor2 = new Convertor(Unit.YARD, 1.0);
        boolean compareCheck = convertor1.compare(convertor1, convertor2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenThreeFeetAndOneYard_shouldReturnEquals() {
        Convertor convertor1 = new Convertor(Unit.FEET, 3.0);
        Convertor convertor2 = new Convertor(Unit.YARD, 1.0);
        boolean compareCheck = convertor1.compare(convertor1,
                convertor2);
        Assert.assertTrue(compareCheck);
    }
}
