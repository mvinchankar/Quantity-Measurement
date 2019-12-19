package com.quantitymeasurement;

public class QuantityMeasurement {

    public TypesOfUnits typesOfUnits;
    public double value;

    public QuantityMeasurement(TypesOfUnits typesOfUnits, double value) {
        this.typesOfUnits = typesOfUnits;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;
        return Double.compare(quantityMeasurement.value, value) == 0 &&
                typesOfUnits == quantityMeasurement.typesOfUnits;
    }
}
