package com.quantitymeasurement;

public enum TypesOfUnits {

    FEET(12.00, TypeOfQuantity.LENGTH),
    INCH(1.00, TypeOfQuantity.LENGTH),
    YARD(36.00, TypeOfQuantity.LENGTH),
    CENTIMETERS(0.393701, TypeOfQuantity.LENGTH),
    NULL(0.0, TypeOfQuantity.LENGTH),
    GALLON(3.78, TypeOfQuantity.VOLUME),
    LITRE(1.00, TypeOfQuantity.VOLUME),
    MILLILITRES(0.001, TypeOfQuantity.VOLUME),
    KILOGRAMS(1.00, TypeOfQuantity.WEIGHT),
    GRAMS(0.001, TypeOfQuantity.WEIGHT),
    TONNES(1000, TypeOfQuantity.WEIGHT),
    CELSIUS(0.0, TypeOfQuantity.TEMPERATURE),
    FAHRENHEIT(0.0, TypeOfQuantity.TEMPERATURE);

    public final double baseUnit;
    public final TypeOfQuantity type;

    TypesOfUnits(double baseUnit, TypeOfQuantity type) {
        this.baseUnit = baseUnit;
        this.type = type;
    }


}