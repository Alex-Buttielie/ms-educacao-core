package br.com.coreeduc.aplication.utils;

import br.com.caelum.stella.validation.CPFValidator;

public abstract class Util {

    public static boolean isCpfValido(String cpf) {
        CPFValidator cpfValidator = new CPFValidator();
        try {
            cpfValidator.assertValid(cpf);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public static String formatarHora(String hora) {
       if (hora == null || hora.trim().isEmpty()) {
           return null;
       } else {
           return hora.substring(0, 2) + ":" + hora.substring(2, 4);
       }
    }

}
