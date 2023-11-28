package br.com.coreeduc.adapters.outbound.authentication.dto;

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
