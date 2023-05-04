/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.Set;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;
    
    @Column(nullable = false)
    private String nomRol;
    
    @Column(nullable = false)
    private boolean actRol;
    
    @OneToMany(mappedBy = "rol")
    private Set<UserN_Rol> usern_rols;
    
    @OneToMany(mappedBy = "rol")
    private Set<Rol_Funcion> rol_funcions;

    public Rol() {
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNomRol() {
        return nomRol;
    }

    public void setNomRol(String nomRol) {
        this.nomRol = nomRol;
    }

    public boolean isActRol() {
        return actRol;
    }

    public void setActRol(boolean actRol) {
        this.actRol = actRol;
    }

    public Set<UserN_Rol> getUsern_rols() {
        return usern_rols;
    }

    public void setUsern_rols(Set<UserN_Rol> usern_rols) {
        this.usern_rols = usern_rols;
    }

    public Set<Rol_Funcion> getRol_funcions() {
        return rol_funcions;
    }

    public void setRol_funcions(Set<Rol_Funcion> rol_funcions) {
        this.rol_funcions = rol_funcions;
    }
    
    
    
}
