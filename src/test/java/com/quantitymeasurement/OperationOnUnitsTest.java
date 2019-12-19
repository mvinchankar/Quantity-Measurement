
package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class OperationOnUnitsTest {

    @Test
    public void givenUnitsToAdd_WhenTwoInchAndTwoInch_ShouldReturnCorrectValue() {
        double result = 0;
        try {
            result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.INCH, 2.00),
                    new QuantityMeasurement(TypesOfUnits.INCH, 2.00));
            Assert.assertEquals(4.00, result, 0.0);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitsToAdd_WhenOneFeetAndTwoInch_ShouldReturnCorrectValue() {
        double result = 0;
        try {
            result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.FEET, 1.00),
                    new QuantityMeasurement(TypesOfUnits.INCH, 2.00));
            Assert.assertEquals(14, result, 0.0);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitsToAdd_WhenOneFeetAndOneFeet_ShouldReturnCorrectValue() {
        double result = 0;
        try {
            result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.FEET, 1.00),
                    new QuantityMeasurement(TypesOfUnits.FEET, 1.00));
            Assert.assertEquals(24, result, 0.0);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitsToAdd_WhenTwoInchAndTwoPointFiveCentimeters_ShouldReturnCorrectValue() {
        double result = 0;
        try {
            result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.INCH, 2.00),
                    new QuantityMeasurement(TypesOfUnits.CENTIMETERS, 2.5));
            Assert.assertEquals(3.00, result, 0.0);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitsToAdd_WhenTwoInchAndZeroPointFiveCentimeters_ShouldReturnInCorrectValue() {
        double result = 0;
        try {
            result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.INCH, 2.00),
                    new QuantityMeasurement(TypesOfUnits.CENTIMETERS, 0.5));
            Assert.assertNotEquals(3.00, result, 0.0);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitsToAdd_WhenOneGallonAndThreePointSevenEightLitres_ShouldReturnCorrectValue() {
        double result = 0;
        try {
            result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.GALLON, 1.00),
                    new QuantityMeasurement(TypesOfUnits.LITRE, 3.78));
            Assert.assertEquals(8.0, result, 0.0);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitsToAdd_WhenOneGallonAndTwoLitres_ShouldReturnInCorrectValue() {
        double result = 0;
        try {
            result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.GALLON, 1.00),
                    new QuantityMeasurement(TypesOfUnits.LITRE, 2.00));
            Assert.assertNotEquals(4.00, result, 0.0);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitsToAdd_WhenOneLitreAndOneThousandMillilitres_ShouldReturnCorrectValue() {
        double result = 0;
        try {
            result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.LITRE, 1.00),
                    new QuantityMeasurement(TypesOfUnits.MILLILITRES, 1000));
            Assert.assertEquals(2.00, result, 0.0);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitsToAdd_WhenOneLitreAndTwoThousandMillilitres_ShouldReturnInCorrectValue() {
        double result = 0;
        try {
            result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.LITRE, 1.00),
                    new QuantityMeasurement(TypesOfUnits.MILLILITRES, 2000.00));
            Assert.assertNotEquals(2.00, result, 0.0);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitsToAddUnitsOfDifferentTypes_WhenOneLitreAndTwoInches_ShouldReturnInCorrectValue() {
        double result = 0;
        try {
            result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.LITRE, 1.00),
                    new QuantityMeasurement(TypesOfUnits.INCH, 2.00));
            Assert.assertNotEquals(2.00, result, 0.0);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitsToAdd_WhenOneTonnesAndOneThousandGrams_ShouldReturnCorrectValue() {
        double result = 0;
        try {
            result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.TONNES, 1.00),
                    new QuantityMeasurement(TypesOfUnits.GRAMS, 1000));
            Assert.assertEquals(1001, result, 0.0);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitsToAdd_WhenTwoTonnesAndOneThousandGrams_ShouldReturnInCorrectValue() {
        double result = 0;
        try {
            result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.TONNES, 2.00),
                    new QuantityMeasurement(TypesOfUnits.GRAMS, 1000));
            Assert.assertNotEquals(1001, result, 0.0);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitsToAdd_WhenOneKilogramsAndOneThousandGrams_ShouldReturnCorrectValue() {
        double result = 0;
        try {
            result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.KILOGRAMS, 1.00),
                    new QuantityMeasurement(TypesOfUnits.GRAMS, 1000));
            Assert.assertEquals(2, result, 0.0);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenUnitsToAdd_WhenOneTonnesAndOneThousandKilograms_ShouldReturnCorrectValue() {
        double result = 0;
        try {
            result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.TONNES, 1.00),
                    new QuantityMeasurement(TypesOfUnits.KILOGRAMS, 1000));
            Assert.assertEquals(2000, result, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenUnitsToAdd_WhenOneCelciousAndOneCelcious_ShouldThrowException() {
        try {
            double result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.CELSIUS, 1.00),
                    new QuantityMeasurement(TypesOfUnits.CELSIUS, 1.00));
            Assert.assertEquals(1, result, 0.0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.INVALID_QUANTITY, e.type);
        }
    }

    @Test
    public void givenUnitsToAdd_WhenOneCelciousAndOneFahrenheit_ShouldThrowException() {
        try {
            double result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.FAHRENHEIT, 1.00),
                    new QuantityMeasurement(TypesOfUnits.FAHRENHEIT, 1.00));
            Assert.assertEquals(1, result, 0.0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.INVALID_QUANTITY, e.type);
        }
    }

    @Test
    public void givenUnitsToAdd_WhenOneCelciousAndOneFeet_ShouldThrowException() {
        try {
            double result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.FAHRENHEIT, 1.00),
                    new QuantityMeasurement(TypesOfUnits.FEET, 1.00));
            Assert.assertEquals(1, result, 0.0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.INVALID_QUANTITY, e.type);
        }
    }

    @Test
    public void givenUnitsToAdd_WhenOneCelciousAndOneKiloGrams_ShouldThrowException() {
        try {
            double result = OperationOnUnit.additionOfDifferentUnits(new QuantityMeasurement(TypesOfUnits.CELSIUS, 1.00),
                    new QuantityMeasurement(TypesOfUnits.KILOGRAMS, 1.00));
            Assert.assertEquals(1, result, 0.0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.INVALID_QUANTITY, e.type);
        }
    }
}

