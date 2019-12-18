package com.quantitymeasurement;

public class Length {

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

    public boolean compare(Length l1, Length l2) {
        return Unit.compare(l1, l2);
    }

}
