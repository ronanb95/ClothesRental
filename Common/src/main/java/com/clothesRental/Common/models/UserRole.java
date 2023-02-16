package com.clothesRental.Common.models;

import org.springframework.security.core.GrantedAuthority;

public class UserRole implements GrantedAuthority {
    
    private Role role;

    @Override
    public String getAuthority() {
        return role.toString();
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
