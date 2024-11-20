package ec.edu.uce.util;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {
    /**
     * Valida que la cadena ingresada tenga el formato  dd/mm/aaaa
     * dd dia, mm mes, aaaa anio
     * @param fecha fecha a validar
     * @return true si es fecha valida y false si no es vàlida
     */
    public boolean validarFecha(String fecha){
        Pattern p = Pattern.compile("[0-9]*b");
        Matcher m = p.matcher(fecha);
        boolean b = m.matches();

        return b;

    }
}