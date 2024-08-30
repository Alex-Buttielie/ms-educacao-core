package br.com.coreeduc.aplication.dto;

import java.io.Serializable;

public record CredentialsDTO(String email, String password) implements Serializable {
}
