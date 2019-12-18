package com.quantitymeasurement;

public class Convertor {

    public Unit unit;
    public double value;

    public Convertor(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convertor convertor = (Convertor) o;
        return Double.compare(convertor.value, value) == 0 &&
                unit == convertor.unit;
    }

    public boolean compare(Convertor l1, Convertor l2) {
        return Unit.compare(l1, l2);
    }

}
