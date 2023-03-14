package com.ejemplos.clases.record;

public record Rectangle(double length, double width) {

    public Rectangle {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException(
                    String.format("Invalid dimensions: %f, %f", length, width));
        }
    }

    public Rectangle(){
        this(1.0, 1.0);
    }

    // Static field
    static double goldenRatio;

    // Static initializer
    static {
        goldenRatio = (1 + Math.sqrt(5)) / 2;
    }

    // Static method
    public static Rectangle createGoldenRectangle(double width) {
        return new Rectangle(width, width * goldenRatio);
    }


    // Public accessor method
    public double length() {
        System.out.println("Length is " + length);
        return length;
    }
}
