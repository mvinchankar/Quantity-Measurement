package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenOfZeroFeetAndZeroFeet_ShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(TypesOfUnits.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(TypesOfUnits.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenZeroFeetAndTwoFeet_ShouldReturnNotEquals() {
        QuantityMeasurement feet1 = new QuantityMeasurement(TypesOfUnits.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(TypesOfUnits.FEET, 2.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOfZeroInchAndZeroInch_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(TypesOfUnits.INCH, 0.0);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(TypesOfUnits.INCH, 0.0);
        Assert.assertEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenZeroInchAndTwoInch_ShouldReturnNotEquals() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(TypesOfUnits.INCH, 0.0);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(TypesOfUnits.INCH, 2.0);
        Assert.assertNotEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenZeroInchAndTwoFeet_ShouldReturnNotEquals() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(TypesOfUnits.INCH, 0.0);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(TypesOfUnits.FEET, 2.0);
        Assert.assertNotEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenNullAndTwoFeet_ShouldReturnNotEquals() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(TypesOfUnits.INCH, 0.0);
        QuantityMeasurement quantityMeasurement2 = null;
        Assert.assertNotEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenZeroInchAndZeroFeet_shouldReturnEqualLength() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(TypesOfUnits.FEET, 0.0);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(TypesOfUnits.INCH, 0.0);
        Assert.assertNotEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenOneYardAndZeroYard_shouldReturnNotEquals() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(TypesOfUnits.YARD, 1.0);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(TypesOfUnits.YARD, 0.0);
        Assert.assertNotEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenOneYardAndOneFeet_shouldReturnNotEquals() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(TypesOfUnits.YARD, 1.0);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(TypesOfUnits.FEET, 1.0);
        Assert.assertNotEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenOneYardAndOneInch_shouldReturnNotEquals() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(TypesOfUnits.YARD, 1.0);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(TypesOfUnits.INCH, 1.0);
        Assert.assertNotEquals(quantityMeasurement1, quantityMeasurement2);
    }
}
