package org.apps.quantitymeasurement;

public class QuantityMeasurementAppUC3 {

    public static boolean demonstrateLengthEquality(
            QuantityMeasurementApp.Length length1,
            QuantityMeasurementApp.Length length2) {

        return length1.equals(length2);
    }


    public static void demonstrateFeetEquality() {

        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1, QuantityMeasurementApp.Length.LengthUnit.FEET);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(1, QuantityMeasurementApp.Length.LengthUnit.FEET);

        System.out.println(demonstrateLengthEquality(l1, l2));
    }


    public static void demonstrateInchesEquality() {

        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(1, QuantityMeasurementApp.Length.LengthUnit.INCHES);

        System.out.println(demonstrateLengthEquality(l1, l2));
    }


    public static void demonstrateFeetInchesComparison() {

        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1, QuantityMeasurementApp.Length.LengthUnit.FEET);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(12, QuantityMeasurementApp.Length.LengthUnit.INCHES);

        System.out.println(demonstrateLengthEquality(l1, l2));
    }


    public static void main(String[] args) {

        demonstrateFeetEquality();
        demonstrateInchesEquality();
        demonstrateFeetInchesComparison();
    }
}