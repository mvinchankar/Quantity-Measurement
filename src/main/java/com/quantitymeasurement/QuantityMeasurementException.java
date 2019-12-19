package com.quantitymeasurement;

public class QuantityMeasurementException extends Exception {

    enum ExceptionType {
        INVALID_QUANTITY;
    }

    ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
