/**
 * Author:Eda Akyıl
 * User:edaakyil
 * Date:1.12.2024
 * Time:21:37
 */

package com.edaakyil.java.math.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    public double x, y;

    public Point()
    {
    }

    public Point(double x)
    {
        this.x = x;
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double distance()
    {
        return distance(0, 0);
    }

    public double distance(Point other)
    {
        return distance(other.x, other.y);
    }

    public double distance(double x, double y)
    {
        return sqrt(pow(this.x - x, 2) + pow(this.y - y, 2));
    }

    public void offset(double dxy)
    {
        offset(dxy, dxy);
    }

    public void offset(double dx, double dy)
    {
        x += dx;
        y += dy;
    }

    public String toString()
    {
        return String.format("(%f, %f)", x, y);
    }
}
