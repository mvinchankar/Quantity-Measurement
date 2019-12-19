package com.quantitymeasurement;

public class UnitsComparison {
    public static boolean compareUnitsOfSimilarTypes(QuantityMeasurement l1, QuantityMeasurement l2) throws QuantityMeasurementException {
        if (l1.typesOfUnits.type.equals(l2.typesOfUnits.type)) {
            return Double.compare(Math.round(l1.value * l1.typesOfUnits.baseUnit),
                    Math.round(l2.value * l2.typesOfUnits.baseUnit)) == 0;
        }
        throw new QuantityMeasurementException("Please Enter Correct Type Of Units."
                , QuantityMeasurementException.ExceptionType.INVALID_QUANTITY);

    }

    public static boolean temperatureComparision(QuantityMeasurement l1, QuantityMeasurement l2) {
        if (TypesOfUnits.FAHRENHEIT.equals(l1.typesOfUnits))
            return Double.compare(Math.round((l1.value - 32) * 5 / 9),
                    Math.round(l2.value)) == 0;
        return Double.compare(Math.round((l1.value * 9 / 5) + 32),
                Math.round(l2.value)) == 0;

    }
}
