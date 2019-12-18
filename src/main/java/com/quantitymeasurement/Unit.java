package com.quantitymeasurement;

public enum Unit {

    FEET(12.00, TypeOfInput.LENGTH),
    INCH(1.00, TypeOfInput.LENGTH),
    YARD(36.00, TypeOfInput.LENGTH),
    CENTIMETERS(0.393701, TypeOfInput.LENGTH),
    NULL(0.0, TypeOfInput.LENGTH),
    GALLON(3.78,TypeOfInput.VOLUME),
    LITRE(1.00,TypeOfInput.VOLUME),
    MILLILITRES(0.001,TypeOfInput.VOLUME);

    private final double baseUnit;
    private final TypeOfInput type;

    Unit(double baseUnit, TypeOfInput type) {
        this.baseUnit = baseUnit;
        this.type = type;
    }

    public static boolean compare(Convertor l1, Convertor l2) {
        if (l1.unit.type.equals(l2.unit.type)) {
            return Double.compare(Math.round(l1.value * l1.unit.baseUnit),
                    Math.round(l2.value * l2.unit.baseUnit)) == 0;
        }
        return false;
    }

    public static double additionOfDifferentUnits(Convertor l1, Convertor l2) {
        if (l1.unit.type.equals(l2.unit.type)) {
            return Math.round(l1.value * l1.unit.baseUnit + l2.value * l2.unit.baseUnit);
        }
        return 0.0;
    }
}