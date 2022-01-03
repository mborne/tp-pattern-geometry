package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    public static final double EPSILON = 1.0e-15;

    @Test
    public void testDefaultConstructor() {
        Point p = new Point();
        Assert.assertEquals(Double.NaN, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(Double.NaN, p.getCoordinate().getY(), EPSILON);
		Assert.assertTrue(p.isEmpty());
    }

    @Test
    public void testConstructor() {
        Coordinate c = new Coordinate(3.14, 2.72);
        Point p = new Point(c);
        Assert.assertEquals(c, p.getCoordinate());
		Assert.assertFalse(p.isEmpty());
    }
}
