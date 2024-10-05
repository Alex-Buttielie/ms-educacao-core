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

}
