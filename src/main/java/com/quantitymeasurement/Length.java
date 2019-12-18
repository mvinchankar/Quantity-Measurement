package com.quantitymeasurement;

import java.util.Objects;

public class Length {

    private static final double FEET_TO_INCH = 12.0;
    private static final double YARD_TO_FEET = 3.0;
    private static final double YARD_TO_INCH = 36.0;
    public Unit unit;
    public double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    public boolean compare(Unit unit1, Unit unit2, Length that, Conversion conversion, Conversion conversion1) {
        if (this.unit.equals(unit1) && (that.unit.equals(unit2)))
            return Double.compare(conversion.convertTo(this.value), conversion1.convertTo(that.value)) == 0;
        return false;
    }
}
