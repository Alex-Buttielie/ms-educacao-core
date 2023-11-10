package br.com.coreeduc.adapters.outbound.authentication.services.impl;

import br.com.coreeduc.adapters.outbound.authentication.security.UserSS;
import br.com.coreeduc.adapters.outbound.persistence.services.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserSS authenticated() {
        try {
            return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }
        catch (Exception e) {
            return null;
        }
    }
}
