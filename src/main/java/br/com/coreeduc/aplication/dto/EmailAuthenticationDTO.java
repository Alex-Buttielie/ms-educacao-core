package br.com.coreeduc.aplication.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EmailAuthenticationDTO {

    private String email;
    private String lastPassword;
    private String newPassword;

}
