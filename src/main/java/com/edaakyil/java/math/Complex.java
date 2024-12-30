/**
 * Author:Eda Akyıl
 * User:edaakyil
 * Date:1.12.2024
 * Time:20:25
 */

package com.edaakyil.java.math;

public class Complex {
    public double real, imag;

    public Complex()
    {
    }

    public Complex(double real)
    {
        this.real = real;
    }

    public Complex(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }

    public void inc()
    {
        ++real;
    }

    public void dec()
    {
        --real;
    }

    public Complex conjugate()
    {
        return new Complex(real, -imag);
    }

    public Complex negate()
    {
        return new Complex(-real, -imag);
    }

    public Complex add(double val)
    {
        return add(real, imag, val, 0);
    }

    public Complex add(Complex other)
    {
        return add(real, imag, other.real, other.imag);
    }

    public static Complex add(Complex z, double val)
    {
        return add(z.real, z.imag, val, 0);
    }

    public static Complex add(double re1, double im1, double re2, double im2)
    {
        return new Complex(re1 + re2, im1 + im2);
    }

    public Complex subtract(double val)
    {
        return subtract(real, imag, val, 0);
    }

    public Complex subtract(Complex other)
    {
        return subtract(real, imag, other.real, other.imag);
    }

    public static Complex subtract(Complex z, double val)
    {
        return subtract(z.real, z.imag, val, 0);
    }

    public static Complex subtract(double re1, double im1, double re2, double im2)
    {
        return add(re1, im1, -re1, -im2);
    }

    public Complex multiply(double val)
    {
        return multiply(real, imag, val, 0);
    }

    public Complex multiply(Complex other)
    {
        return multiply(real, imag, other.real, other.imag);
    }

    public static Complex multiply(Complex z, double val)
    {
        return multiply(z.real, z.imag, val, 0);
    }

    public static Complex multiply(double re1, double im1, double re2, double im2)
    {
        return new Complex(re1 * re2 - im1 * im2, re1 * im2 + re2 * im1);
    }

    public String toString()
    {
        return String.format("%f + %fi", real, imag);
    }
}
