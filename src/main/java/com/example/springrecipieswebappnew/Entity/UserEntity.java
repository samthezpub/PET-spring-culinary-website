package com.example.springrecipieswebappnew.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "user_entity")
public class UserEntity implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role_junction",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    private Set<Role> authoritites;

    @JsonIgnore
    @Nullable
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<DishEntity> dishes;

    @JsonIgnore
    @Nullable
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<RecipeEntity> recipes;

    public UserEntity(){
        super();
        this.authoritites = new HashSet<Role>();
    }

    public UserEntity(long id, String username, String password, Set<Role> authoritites) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.authoritites = authoritites;
    }

    /**
     * @return
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public String getPassword() {
        return this.password;
    }

    /**
     * @return
     */
    @Override
    public String getUsername() {
        return this.username;
    }

    /**
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * @return
     */
    @Override
    public boolean isEnabled() {
        return true;
    }
}
