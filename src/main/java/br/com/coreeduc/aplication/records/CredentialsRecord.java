package br.com.coreeduc.aplication.records;

import java.io.Serializable;

public record CredentialsRecord(String email, String password) implements Serializable {
}
