package com.quantitymeasurement;

public enum Conversion {
    YARD_TO_INCH {
        private double yardToInch;

        @Override
        public double convertTo(double value) {
            return yardToInch = value * 36.0;
        }
    }, YARD_TO_FEET {
        private double yardToFeet;

        @Override
        public double convertTo(double value) {
            return yardToFeet = value * 3.0;
        }
    }, INCH_TO_YARD {
        private double inchToYard;

        @Override
        public double convertTo(double value) {
            return inchToYard = value * 1.0;
        }
    }, INCH_TO_FEET {
        private double inchToFeet;

        @Override
        public double convertTo(double value) {
            return inchToFeet = value * 1.0;
        }
    }, FEET_TO_YARD {
        private double feetToYard;

        @Override
        public double convertTo(double value) {
            return feetToYard = value * 1.0;
        }
    }, FEET_TO_INCH {
        private double feetToInch;

        @Override
        public double convertTo(double value) {
            return feetToInch = value * 12.0;
        }
    }, FEET_TO_FEET {
        private double feetToFeet;

        @Override
        public double convertTo(double value) {
            return feetToFeet = value * 1.0;
        }
    }, INCH_TO_INCH {
        private double inchToInch;

        @Override
        public double convertTo(double value) {
            return inchToInch = value * 1.0;
        }
    };

    public abstract double convertTo(double value);
}
