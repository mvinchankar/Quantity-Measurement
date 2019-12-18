package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

    @Test
    public void givenUnitToConvertInto_When2YardAnd72Inch_ShouldReturnTrue() {
        boolean compareCheck = Unit.compare(new Convertor(Unit.YARD, 2.0),
                new Convertor(Unit.INCH, 72.0));
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenUnitToConvertInto_When2YardAnd6Feet_ShouldReturnTrue() {
        boolean compareCheck = Unit.compare(new Convertor(Unit.YARD, 2.0),
                new Convertor(Unit.FEET, 6.0));
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenUnitToConvertInto_When2YardAnd0Inch_ShouldReturnFalse() {
        boolean compareCheck = Unit.compare(new Convertor(Unit.YARD, 2.0),
                new Convertor(Unit.INCH, 0.0));
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenUnitToConvertInto_When2YardAnd0Feet_ShouldReturnFalse() {
        boolean compareCheck = Unit.compare(new Convertor(Unit.YARD, 2.0),
                new Convertor(Unit.FEET, 0.0));
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenUnitToConvertInto_WhenOneYardAndNintyOnePointFortyCentimeters_ShouldReturnTrue() {
        boolean compareCheck = Unit.compare(new Convertor(Unit.YARD, 1.0),
                new Convertor(Unit.CENTIMETERS, 91.44));
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenUnitToConvertInto_WhenOneInchAndTwoPointFiveCentimeters_ShouldReturnTrue() {
        boolean compareCheck = Unit.compare(new Convertor(Unit.INCH, 1.0),
                new Convertor(Unit.CENTIMETERS, 2.54));
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenUnitToConvertInto_WhenOneFeetAndThirtyPointFourtyEightCentimeters_ShouldReturnTrue() {
        boolean compareCheck = Unit.compare(new Convertor(Unit.FEET, 1.0),
                new Convertor(Unit.CENTIMETERS, 30.48));
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenUnitsToAdd_WhenTwoInchAndTwoInch_ShouldReturnCorrectValue() {
        double result = Unit.additionOfDifferentUnits(new Convertor(Unit.INCH, 2.00),
                new Convertor(Unit.INCH, 2.00));
        Assert.assertEquals(4.00, result, 0.0);
    }

    @Test
    public void givenUnitsToAdd_WhenOneFeetAndTwoInch_ShouldReturnCorrectValue() {
        double result = Unit.additionOfDifferentUnits(new Convertor(Unit.FEET, 1.00),
                new Convertor(Unit.INCH, 2.00));
        Assert.assertEquals(14, result, 0.0);
    }

    @Test
    public void givenUnitsToAdd_WhenOneFeetAndOneFeet_ShouldReturnCorrectValue() {
        double result = Unit.additionOfDifferentUnits(new Convertor(Unit.FEET, 1.00),
                new Convertor(Unit.FEET, 1.00));
        Assert.assertEquals(24, result, 0.0);
    }

    @Test
    public void givenUnitsToAdd_WhenTwoInchAndTwoPointFiveCentimeters_ShouldReturnCorrectValue() {
        double result = Unit.additionOfDifferentUnits(new Convertor(Unit.INCH, 2.00),
                new Convertor(Unit.CENTIMETERS, 2.5));
        Assert.assertEquals(3.00, result, 0.0);
    }

    @Test
    public void givenUnitsToAdd_WhenTwoInchAndZeroPointFiveCentimeters_ShouldReturnInCorrectValue() {
        double result = Unit.additionOfDifferentUnits(new Convertor(Unit.INCH, 2.00),
                new Convertor(Unit.CENTIMETERS, 0.5));
        Assert.assertNotEquals(3.00, result, 0.0);
    }

    @Test
    public void givenUnitToConvertInto_WhenOneGallonAndThreePointSevenLitres_ShouldReturnTrue() {
        boolean compareCheck = Unit.compare(new Convertor(Unit.GALLON, 1.0),
                new Convertor(Unit.LITRE, 3.78));
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenUnitToConvertInto_WhenOneLitreAndOneThousandMillilitres_ShouldReturnTrue() {
        boolean compareCheck = Unit.compare(new Convertor(Unit.LITRE, 1.00),
                new Convertor(Unit.MILLILITRES, 1000));
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenUnitToConvertInto_WhenOneLitreAndTwoThousandMillilitres_ShouldReturnFalse() {
        boolean compareCheck = Unit.compare(new Convertor(Unit.LITRE, 1.00),
                new Convertor(Unit.MILLILITRES, 2000));
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenUnitOfDifferentTypesToConvertInto_WhenOneLitreAndOneFeet_ShouldReturnFalse() {
        boolean compareCheck = Unit.compare(new Convertor(Unit.LITRE, 1.00),
                new Convertor(Unit.FEET, 1.00));
        Assert.assertFalse(compareCheck);
    }
}
