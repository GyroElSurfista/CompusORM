/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.seguridad;

import compush.compushibernate.ops.Alquiler;
import compush.compushibernate.ops.Prestamo;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;

@Entity
public class UserN {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsrN;
    
    @Column(nullable = false)
    private String nomUsrN;
    
    @Column(nullable = false)
    private String passUsrN;
    
    @Column(nullable = false)
    private String nomPUsrN;
    
    @Column(nullable = false)
    private String apePUsrN;
    
    @OneToMany(mappedBy = "userN", cascade = CascadeType.PERSIST)
    private Set<Sesion> sesiones;
    
    @OneToMany(mappedBy = "userN", cascade = CascadeType.PERSIST)
    private Set<UserN_Rol> usern_rols;
    
    @OneToMany(mappedBy = "alquilador", cascade = CascadeType.PERSIST)
    private Set<Alquiler> alquileres;
    
    @OneToMany(mappedBy = "presta", cascade = CascadeType.PERSIST)
    private Set<Prestamo> prestados;
    
    @OneToMany(mappedBy = "sePresta", cascade = CascadeType.PERSIST)
    private Set<Prestamo> prestRecib;

    public UserN() {
    }

    public int getIdUsrN() {
        return idUsrN;
    }

    public void setIdUsrN(int idUsrN) {
        this.idUsrN = idUsrN;
    }

    public String getNomUsrN() {
        return nomUsrN;
    }

    public void setNomUsrN(String nomUsrN) {
        this.nomUsrN = nomUsrN;
    }

    public String getPassUsrN() {
        return passUsrN;
    }

    public void setPassUsrN(String passUsrN) {
        this.passUsrN = passUsrN;
    }

    public String getNomPUsrN() {
        return nomPUsrN;
    }

    public void setNomPUsrN(String nomPUsrN) {
        this.nomPUsrN = nomPUsrN;
    }

    public String getApePUsrN() {
        return apePUsrN;
    }

    public void setApePUsrN(String apePUsrN) {
        this.apePUsrN = apePUsrN;
    }

    public Set<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(Set<Sesion> sesiones) {
        this.sesiones = sesiones;
    }

    public Set<UserN_Rol> getUsern_rols() {
        return usern_rols;
    }

    public void setUsern_rols(Set<UserN_Rol> usern_rols) {
        this.usern_rols = usern_rols;
    }

    public Set<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(Set<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public Set<Prestamo> getPrestados() {
        return prestados;
    }

    public void setPrestados(Set<Prestamo> prestados) {
        this.prestados = prestados;
    }

    public Set<Prestamo> getPrestRecib() {
        return prestRecib;
    }

    public void setPrestRecib(Set<Prestamo> prestRecib) {
        this.prestRecib = prestRecib;
    }
  
    
}
