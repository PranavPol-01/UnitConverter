package com.example.unitconverter;

public enum Unit {
    METER_TO_KILOMETER(0.001),
    KILOMETER_TO_METER(1000),
    METER_TO_CENTIMETER(100),
    CENTIMETER_TO_METER(0.01);

    private final double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}
