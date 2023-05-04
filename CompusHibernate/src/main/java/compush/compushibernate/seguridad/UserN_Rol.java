/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
public class UserN_Rol {
    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idUsrN")
    private UserN userN;
    
    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idRol")
    private Rol rol;
    
    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date fechIniUR;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date fechFinUR;

    public UserN_Rol() {
    }

    public UserN getUserN() {
        return userN;
    }

    public void setUserN(UserN userN) {
        this.userN = userN;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Date getFechIniUR() {
        return fechIniUR;
    }

    public void setFechIniUR(Date fechIniUR) {
        this.fechIniUR = fechIniUR;
    }

    public Date getFechFinUR() {
        return fechFinUR;
    }

    public void setFechFinUR(Date fechFinUR) {
        this.fechFinUR = fechFinUR;
    }
    
    
}
