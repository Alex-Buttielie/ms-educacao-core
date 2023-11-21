package br.com.coreeduc.adapters.outbound.authentication.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;


public class UserSS implements UserDetails {
    private static final long serialVersionUID = 1L;

    private Long idUser;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public UserSS() {
    }

    public UserSS(Long idUser, String email, String password, String token) {

        super();
        this.idUser = idUser;
        this.email = email;
        this.password = password;
        //this.authorities = perfis.stream().map(x -> new SimpleGrantedAuthority(x.getDescricao())).collect(Collectors.toList());

    }

    public Long getIdUser() {
        return idUser;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    //public boolean hasRole(Perfil perfil) {
    //  return getAuthorities().contains(new SimpleGrantedAuthority(perfil.getDescricao()));
    //}
}
