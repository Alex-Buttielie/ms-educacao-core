package br.com.coreeduc.aplication.authentication.services.impl;

import br.com.coreeduc.aplication.authentication.security.UserSS;
import br.com.coreeduc.aplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return Optional
                .ofNullable(repo.findByEmail(email))
                .map(user -> new UserSS(user.getIdUser(), user.getEmail(), user.getPasswordUser(), null, user.getTenant()))
                .orElseThrow(() -> new UsernameNotFoundException(email));
    }


}
