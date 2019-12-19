package com.quantitymeasurement;

import com.sun.org.apache.bcel.internal.generic.ATHROW;

public class OperationOnUnit {
    public static double additionOfDifferentUnits(QuantityMeasurement l1, QuantityMeasurement l2)
            throws QuantityMeasurementException {
        if (l1.typesOfUnits.type.equals(l2.typesOfUnits.type)
                && (l1.typesOfUnits.type != TypeOfQuantity.TEMPERATURE)) {
            return Math.round(l1.value * l1.typesOfUnits.baseUnit +
                    l2.value * l2.typesOfUnits.baseUnit);
        }
        throw new QuantityMeasurementException("Please check correct Quantity!! Different Quantity cannot be Added."
                , QuantityMeasurementException.ExceptionType.INVALID_QUANTITY);
    }
}
