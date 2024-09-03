package br.com.coreeduc.aplication.records;

public record EmailAuthenticationRecord(String email, String lastPassword, String newPassword){
}
