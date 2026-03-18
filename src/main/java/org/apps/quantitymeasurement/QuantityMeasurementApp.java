package org.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static class Feet{
        private final double value;

        public Feet(double value){
            this.value=value;
        }

        @Override
        public boolean equals(Object obj){
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;

        }
    }

    public static class Length {

        private double value;
        private LengthUnit unit;

        public enum LengthUnit {

            FEET(12.0),
            INCHES(1.0);

            private final double conversionFactor;

            LengthUnit(double conversionFactor) {
                this.conversionFactor = conversionFactor;
            }

            public double getConversionFactor() {
                return conversionFactor;
            }
        }


        // constructor
        public Length(double value, LengthUnit unit) {

            if (unit == null) {
                throw new IllegalArgumentException("Unit cannot be null");
            }

            this.value = value;
            this.unit = unit;
        }


        // convert to base unit (inches)
        private double convertToBaseUnit() {

            return value * unit.getConversionFactor();
        }


        // compare two Length objects
        public boolean compare(Length thatLength) {

            if (thatLength == null) return false;

            return Double.compare(
                    this.convertToBaseUnit(),
                    thatLength.convertToBaseUnit()
            ) == 0;
        }


        @Override
        public boolean equals(Object o) {

            if (this == o) return true;

            if (o == null) return false;

            if (getClass() != o.getClass()) return false;

            Length thatLength = (Length) o;

            return compare(thatLength);
        }


        public static void main(String[] args) {

            Length length1 = new Length(1.0, apps.quantitymeasurement.Length.LengthUnit.FEET);
            Length length2 = new Length(12.0, apps.quantitymeasurement.Length.LengthUnit.INCHES);

            System.out.println(length1.equals(length2));
        }
    }
}
