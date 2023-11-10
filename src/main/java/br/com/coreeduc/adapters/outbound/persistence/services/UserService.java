package br.com.coreeduc.adapters.outbound.persistence.services;


import br.com.coreeduc.adapters.outbound.authentication.security.UserSS;

public interface UserService {
    UserSS authenticated();
}
