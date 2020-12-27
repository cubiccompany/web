package com.example.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "usr")
public class User implements UserDetails {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;


    private String number;
    private String username;
    private String name;
    private String surname;
    private String UserAd; //Адрес пользователя.
    private boolean active;
    private String password;


    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    public User(){}

    public User(long id, String number, String password, String username, String name, String surname, String userAd, boolean active, Set<Role> roles) {
        this.id = id;
        this.number = number;
        this.password = password;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.UserAd = userAd;
        this.active = active;
        this.roles = roles;
    }

    public boolean isAdmin(){return roles.contains(Role.ADMIN);}

    public boolean isActive() {
        return active;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String email) {
        this.username = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUserAd() {
        return UserAd;
    }

    public void setUserAd(String userAd) {
        UserAd = userAd;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
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
        return active;
    }
}
