package br.com.coreeduc.coreeduc.aplication.ports;

import java.text.ParseException;

public interface ExecutarImportacaoPort {
    void importarLinhaArquivo(String[] conteudoLinha) throws ParseException;
}
