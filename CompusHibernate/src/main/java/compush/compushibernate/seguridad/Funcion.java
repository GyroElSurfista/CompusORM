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
import jakarta.persistence.OneToMany;
import java.util.Set;

@Entity
public class Funcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFunc;
    
    @Column(nullable = false)
    private String nomFunc;
    
    @Column(nullable = false)
    private boolean actFunc;
    
    @OneToMany(mappedBy = "funcion")
    private Set<Rol_Funcion> rol_funcions;
    
    @OneToMany(mappedBy = "funcion")
    private Set<Funcion_IU> funcion_ius;

    public Funcion() {
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomFunc() {
        return nomFunc;
    }

    public void setNomFunc(String nomFunc) {
        this.nomFunc = nomFunc;
    }

    public boolean isActFunc() {
        return actFunc;
    }

    public void setActFunc(boolean actFunc) {
        this.actFunc = actFunc;
    }

    public Set<Rol_Funcion> getRol_funcions() {
        return rol_funcions;
    }

    public void setRol_funcions(Set<Rol_Funcion> rol_funcions) {
        this.rol_funcions = rol_funcions;
    }

    public Set<Funcion_IU> getFuncion_ius() {
        return funcion_ius;
    }

    public void setFuncion_ius(Set<Funcion_IU> funcion_ius) {
        this.funcion_ius = funcion_ius;
    }
    
    
}
