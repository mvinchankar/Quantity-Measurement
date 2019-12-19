package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class UnitsComparisonTest {

    @Test
    public void givenUnitToConvertInto_When2YardAnd72Inch_ShouldReturnTrue() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes
                    (new QuantityMeasurement(TypesOfUnits.YARD, 2.0),
                            new QuantityMeasurement(TypesOfUnits.INCH, 72.0));
            Assert.assertTrue(compareCheck);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitToConvertInto_When2YardAnd6Feet_ShouldReturnTrue() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes
                    (new QuantityMeasurement(TypesOfUnits.YARD, 2.0),
                            new QuantityMeasurement(TypesOfUnits.FEET, 6.0));
            Assert.assertTrue(compareCheck);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitToConvertInto_When2YardAnd0Inch_ShouldReturnFalse() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes
                    (new QuantityMeasurement(TypesOfUnits.YARD, 2.0),
                            new QuantityMeasurement(TypesOfUnits.INCH, 0.0));
            Assert.assertFalse(compareCheck);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitToConvertInto_When2YardAnd0Feet_ShouldReturnFalse() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes
                    (new QuantityMeasurement(TypesOfUnits.YARD, 2.0),
                            new QuantityMeasurement(TypesOfUnits.FEET, 0.0));
            Assert.assertFalse(compareCheck);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitToConvertInto_WhenOneYardAndNintyOnePointFortyCentimeters_ShouldReturnTrue() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes
                    (new QuantityMeasurement(TypesOfUnits.YARD, 1.0),
                            new QuantityMeasurement(TypesOfUnits.CENTIMETERS, 91.44));
            Assert.assertTrue(compareCheck);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitToConvertInto_WhenOneInchAndTwoPointFiveCentimeters_ShouldReturnTrue() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes
                    (new QuantityMeasurement(TypesOfUnits.INCH, 1.0),
                            new QuantityMeasurement(TypesOfUnits.CENTIMETERS, 2.54));
            Assert.assertTrue(compareCheck);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitToConvertInto_WhenOneFeetAndThirtyPointFourtyEightCentimeters_ShouldReturnTrue() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes
                    (new QuantityMeasurement(TypesOfUnits.FEET, 1.0),
                            new QuantityMeasurement(TypesOfUnits.CENTIMETERS, 30.48));
            Assert.assertTrue(compareCheck);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitToConvertInto_WhenOneGallonAndThreePointSevenLitres_ShouldReturnTrue() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes
                    (new QuantityMeasurement(TypesOfUnits.GALLON, 1.0),
                            new QuantityMeasurement(TypesOfUnits.LITRE, 3.78));
            Assert.assertTrue(compareCheck);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitToConvertInto_WhenOneLitreAndOneThousandMillilitres_ShouldReturnTrue() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes
                    (new QuantityMeasurement(TypesOfUnits.LITRE, 1.00),
                            new QuantityMeasurement(TypesOfUnits.MILLILITRES, 1000));
            Assert.assertTrue(compareCheck);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitToConvertInto_WhenOneLitreAndTwoThousandMillilitres_ShouldReturnFalse() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes
                    (new QuantityMeasurement(TypesOfUnits.LITRE, 1.00),
                            new QuantityMeasurement(TypesOfUnits.MILLILITRES, 2000));
            Assert.assertFalse(compareCheck);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitOfDifferentTypesToConvertInto_WhenOneLitreAndOneFeet_ShouldReturnFalse() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes(new QuantityMeasurement(TypesOfUnits.LITRE, 1.00),
                    new QuantityMeasurement(TypesOfUnits.FEET, 1.00));
            Assert.assertFalse(compareCheck);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.INVALID_QUANTITY, e.type);
        }
    }

    @Test
    public void givenUnitToConvertInto_WhenOneKiloGramAndOneThousandGrams_ShouldReturnTrue() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes(new QuantityMeasurement(TypesOfUnits.KILOGRAMS, 1.00),
                    new QuantityMeasurement(TypesOfUnits.GRAMS, 1000));
            Assert.assertTrue(compareCheck);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitToConvertInto_WhenOneTonneAndOneThousandKiloGram_ShouldReturnTrue() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes(new QuantityMeasurement(TypesOfUnits.TONNES, 1.00),
                    new QuantityMeasurement(TypesOfUnits.KILOGRAMS, 1000));
            Assert.assertTrue(compareCheck);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitToConvertInto_WhenOneKiloGramAndOneTonne_ShouldReturnFalse() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes(new QuantityMeasurement(TypesOfUnits.KILOGRAMS, 1.00),
                    new QuantityMeasurement(TypesOfUnits.TONNES, 1));
            Assert.assertFalse(compareCheck);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitToConvertInto_WhenTwoKiloGramAndOneThousandTonne_ShouldReturnFalse() {
        try {
            boolean compareCheck = UnitsComparison.compareUnitsOfSimilarTypes(new QuantityMeasurement(TypesOfUnits.KILOGRAMS, 2.00),
                    new QuantityMeasurement(TypesOfUnits.TONNES, 1000));
            Assert.assertFalse(compareCheck);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitToConvertInto_WhenOneHundredCelsiusAndTwoHundredAndTwelveFahrenheit_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(TypesOfUnits.CELSIUS, 100);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(TypesOfUnits.FAHRENHEIT, 212);
        boolean compareCheck = UnitsComparison.temperatureComparision(quantityMeasurement1, quantityMeasurement2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenUnitToConvertInto_WhenTwoHundredCelsiusAndTwoHundredAndTwelveFahrenheit_ShouldReturnFalse() {
        boolean compareCheck = UnitsComparison.temperatureComparision(new QuantityMeasurement(TypesOfUnits.CELSIUS, 200),
                new QuantityMeasurement(TypesOfUnits.FAHRENHEIT, 212));
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenUnitToConvertInto_WhenHundredFahrenheitAndCelcius_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(TypesOfUnits.FAHRENHEIT, 100);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(TypesOfUnits.CELSIUS, 37.7778);
        boolean compareCheck = UnitsComparison.temperatureComparision(quantityMeasurement1, quantityMeasurement2);
        Assert.assertTrue(compareCheck);
    }
}