package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void whenX0Y0X2Y0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX0Y0X2Y2() {
        int x1 = 0;
        int y1 = 2;
        int x2 = 2;
        int y2 = 4;
        double expected = 2.82;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX0Y7X1Y0() {
        int x1 = 0;
        int y1 = 7;
        int x2 = 1;
        int y2 = 0;
        double expected = 7.07;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX0Y0X0Y0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double expected = 0;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenA000B333then3() {
        double expected = 3;
        Point a = new Point(3, 0, 3);
        Point b = new Point(3, 3, 3);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenA000B000then0() {
        double expected = 0;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance6() {
        double expected = 6;
        Point a = new Point(3, 3, 3);
        Point b = new Point(3, 3, -3);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}