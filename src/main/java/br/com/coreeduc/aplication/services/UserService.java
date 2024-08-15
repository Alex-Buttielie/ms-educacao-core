package br.com.coreeduc.aplication.services;


import br.com.coreeduc.aplication.authentication.security.UserSS;

public interface UserService {
    UserSS authenticated();
}
