package com.sistema.examenes.sistemaexamenesbacken.Entities;


import jakarta.persistence.*;

@Entity
@Table(name = "user_rol")
public class UserRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRol_Id ;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user ;

    @ManyToOne
    private Rol rol ;

    public UserRol() {
    }


    public Long getUserRol_Id() {
        return userRol_Id;
    }

    public void setUserRol_Id(Long userRol_Id) {
        this.userRol_Id = userRol_Id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
