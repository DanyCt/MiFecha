package ec.edu.uce.dominio;

/**
 *
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(){
        this.dia = 1;
        this.mes = 1;
        this.anio=2000;
    }

    public Fecha(int dia, int mes, int anio) {
        if (validarFecha(dia, mes, anio)){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        }
        else {
            System.out.println("Fecha no valida");
        }
    }

    public Fecha(Fecha fecha){
        this.dia= fecha.dia;
        this.mes = fecha.mes;
        this.anio = fecha.anio;
    }

    public Fecha agregarDia(int masDias){
        Fecha nuevaFecha = new Fecha(this);
        nuevaFecha.dia += masDias;
        return nuevaFecha;
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (validarFecha(dia,this.mes, this.anio)){
            this.dia = dia;
        } else {
            System.out.println("Error día no vàlido:"+ dia);
        }

    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(validarFecha(dia, mes, anio)){
            this.mes = mes;
        }
        System.out.println("Error en el mes: " + mes + " no valido");
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    public boolean validarFecha(int dia,  int mes, int anio) {

        if (anio < 2000) {
            return false; // Años anteriores al 2000 no son válidos
        }

        if (mes < 1 || mes > 12) {
            return false; // Mes inválido
        }

        int diasMaximos;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasMaximos = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasMaximos = 30;
                break;
            case 2:
                diasMaximos = esBisiesto(anio) ? 29 : 28;
                break;
            default:
                return false; // Esto no debería ocurrir debido a la validación anterior
        }

        return dia >= 1 && dia <= diasMaximos;
    }

    public boolean esBisiesto(int anio) {
        if (anio < 2000) {
            return false; // Solo consideramos años bisiestos a partir del 2000
        }
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}