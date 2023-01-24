package com.ejemplos.clases.interfaces;

public interface Interfaz {
	void funcion1();
	int function2(Integer i);

	//nueva incorporación implementación por defecto en Java 8
    default void log(String str){
        System.out.println("I1 logging::"+str);
        hazAlgo();
    }

    // Método stático Java 8
    static boolean isNull(String str) {
        System.out.println("Interface Null Check");

        return str == null ? true : "".equals(str) ? true : false;
    }

    private static void hazAlgo() {
        System.out.println("haz Algo");
    }
}
