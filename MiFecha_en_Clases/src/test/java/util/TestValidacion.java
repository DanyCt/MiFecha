package util;

import ec.edu.uce.util.Validacion;

public class TestValidacion {
    private static Validacion v;

    public static void main(String[] args) {
        v = new Validacion();
        if (testValidarFecha("11888b")){
            System.out.println("Fecha válida");
        }else
            System.out.println("Fecha no válida");
    }

    public static boolean testValidarFecha(String fecha){
        return v.validarFecha(fecha);
    }
}
