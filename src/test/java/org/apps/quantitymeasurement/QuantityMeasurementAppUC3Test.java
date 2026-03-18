package org.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppUC3Test {

    @Test
    public void testFeetEquality() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1, QuantityMeasurementApp.Length.LengthUnit.FEET);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(1, QuantityMeasurementApp.Length.LengthUnit.FEET);
        assertTrue(l1.equals(l2));
    }


    @Test
    public void testInchesEquality() {
        QuantityMeasurementApp.Length inches1 = new QuantityMeasurementApp.Length(1, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        QuantityMeasurementApp.Length inches2 = new QuantityMeasurementApp.Length(1, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        assertTrue(inches1.equals(inches2));
    }


    @Test
    public void testFeetInchesComparison() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1, QuantityMeasurementApp.Length.LengthUnit.FEET);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(12, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }


    @Test
    public void testFeetInequality() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1, QuantityMeasurementApp.Length.LengthUnit.FEET);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(2, QuantityMeasurementApp.Length.LengthUnit.FEET);
        assertFalse(l1.equals(l2));
    }


    @Test
    public void testInchesInequality() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(2, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        assertFalse(l1.equals(l2));
    }


    @Test
    public void testCrossUnitInequality() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1, QuantityMeasurementApp.Length.LengthUnit.FEET);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(10, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        assertFalse(l1.equals(l2));
    }


    @Test
    public void testMultipleFeetComparison() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(2, QuantityMeasurementApp.Length.LengthUnit.FEET);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(24, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }
}