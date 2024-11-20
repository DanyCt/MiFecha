package dominio;

import ec.edu.uce.dominio.Fecha;

public class TestFecha {
    private static Fecha fecha;

    public static void main(String[] args) {

        pruebaConstructor1(10,2,2024);
        pruebaSetDia(-1);
        pruebaSetMes(0);
        System.out.println(fecha.toString());

        testAgregarDias(25);
    }

    public static void pruebaConstructor(){
        fecha = new Fecha();
    }

    public static void pruebaConstructor1(int dia, int mes, int anio){
        fecha = new Fecha(dia, mes, anio);
    }

    public static void pruebaSetDia(int dia){
        fecha.setDia(dia);
    }

    public static void pruebaSetMes(int mes){
        fecha.setMes(mes);
    }

    public static void testAgregarDias(int dias){
        System.out.println( fecha.agregarDia(dias));
    }
}
