package com.ejemplos.datos.complejos;

import java.util.Date;

public class MiJavaBeanApp {
    public static void main(String[] args) {
        MiJavaBean javaBean = new MiJavaBean();
        javaBean.setNombre("");
        System.out.println(javaBean.getNombre());
        MiJavaBean javabean2 = new MiJavaBean(
                "David",
                "Vaquero",
                new Date());
        javaBean.setNombre("");
    }
}
