package com.ejemplos.clases.record;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // JAVA 16
        System.out.println( "Record Classes" );
        Person person = new Person("Jenny", "Female", 35);
        System.out.println(person.name());
        System.out.println(person.gender());
        System.out.println(person.age());
        System.out.println(person);

        Rectangle rectangle = new Rectangle(1.0, 2.0);
        System.out.println(rectangle);
        System.out.println(rectangle.length());
        System.out.println(rectangle.width());
        rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = Rectangle.createGoldenRectangle(2.0);
        System.out.println(rectangle);

    }
}
