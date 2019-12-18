package com.quantitymeasurement;

public enum Unit {

    FEET(12.0, TypeOfInput.LENGTH),
    INCH(1.0, TypeOfInput.LENGTH),
    YARD(36.0, TypeOfInput.LENGTH),
    NULL(0.0,TypeOfInput.LENGTH);

    private final double baseUnit;
    private final TypeOfInput type;

    Unit(double baseUnit, TypeOfInput type) {
        this.baseUnit = baseUnit;
        this.type = type;
    }

    public static boolean compare(Length l1, Length l2) {
        if (l1.unit.type.equals(l2.unit.type)) {
            return Double.compare(l1.value * l1.unit.baseUnit,
                    l2.value * l2.unit.baseUnit) == 0;
        }
        return false;
    }

    public static double additionOfDifferentUnits(Length l1, Length l2) {
        return (l1.value * l1.unit.baseUnit + l2.value * l2.unit.baseUnit);
    }
}