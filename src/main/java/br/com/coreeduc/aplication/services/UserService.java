package br.com.coreeduc.aplication.services;


import br.com.coreeduc.architecture.authentication.security.UserSS;

public interface UserService {
    UserSS authenticated();
}
