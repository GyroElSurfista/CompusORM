/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Sesion {
    @Id 
    private String idSesion;
    
    @Column(nullable = false)
    private int pidSesion;
    
    @Column(nullable = false)
    private boolean actSesion;
    
    @Id 
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idUsrN", nullable = false)
    private UserN userN;

    public Sesion() {
    }

    public String getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(String idSesion) {
        this.idSesion = idSesion;
    }

    

    public int getPidSesion() {
        return pidSesion;
    }

    public void setPidSesion(int pidSesion) {
        this.pidSesion = pidSesion;
    }

    public boolean isActSesion() {
        return actSesion;
    }

    public void setActSesion(boolean actSesion) {
        this.actSesion = actSesion;
    }

    public UserN getUserN() {
        return userN;
    }

    public void setUserN(UserN userN) {
        this.userN = userN;
    }
   
}
