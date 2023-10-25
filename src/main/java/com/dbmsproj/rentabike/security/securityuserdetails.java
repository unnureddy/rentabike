package com.dbmsproj.rentabike.security;

import com.dbmsproj.rentabike.Models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;

public class securityuserdetails implements UserDetails {

    private final User user;
    public securityuserdetails(User user){
        this.user = user;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
//        if (user.blocklist() != null) {
//            LocalDate activeFrom = user.getBlocklist().getActiveFrom();
//            LocalDate now = LocalDate.now();
//            return now.isAfter(activeFrom);
//        }
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

}