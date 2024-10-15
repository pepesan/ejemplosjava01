package com.ejemplos.datos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fechas {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println(fecha);
        Date fecha2=(new GregorianCalendar(2024, Calendar.OCTOBER,15)).getTime();
        System.out.println(fecha2);

        Date fecha3=new Date();//fecha actual
        DateFormat df= DateFormat.getInstance();//Formato básico
        System.out.println(df.format(fecha3));
        df=DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(df.format(fecha3));
        df=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.FULL);
        System.out.println(df.format(fecha3));

        // Definir el formato de fecha
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // La fecha en formato de cadena que se va a parsear
        String fechaStr = "15/10/2024";

        try {
            // Parsear la cadena a un objeto Date
            Date fecha4 = dateFormat.parse(fechaStr);
            System.out.println("Fecha parseada: " + fecha4);
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }

        DateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // La fecha y hora en formato de cadena que se va a parsear
        String fechaHoraStr = "15/10/2024 14:30:45";

        try {
            // Parsear la cadena a un objeto Date
            Date fechaHora = dateTimeFormat.parse(fechaHoraStr);
            System.out.println("Fecha y hora parseada: " + fechaHora);
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha y hora: " + e.getMessage());
        }
    }
}
