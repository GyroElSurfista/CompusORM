/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.seguridad;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Objects;


@Entity
public class Rol_Funcion {
    
    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idRol")
    private Rol rol;
    
    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idFunc")
    private Funcion funcion;

    public Rol_Funcion() {
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.rol);
        hash = 59 * hash + Objects.hashCode(this.funcion);
        return hash;
    }
    
    
    @Override
    public boolean equals(Object o){
        return o instanceof Rol_Funcion && rol.equals(((Rol_Funcion)o).getRol()) && funcion.equals(((Rol_Funcion)o).getFuncion());
    }
    
}
