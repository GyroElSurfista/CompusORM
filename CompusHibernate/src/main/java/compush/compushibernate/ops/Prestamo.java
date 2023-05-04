/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.ops;

import compush.compushibernate.disp.Computadora;
import compush.compushibernate.seguridad.UserN;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
public class Prestamo {
    @Id
    private String idPrest;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechIniPrest;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechFinPrest;
    
    @Temporal(TemporalType.DATE)
    private Date fechDevPrest;
    
    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idComp", nullable = false)
    private Computadora compu;
    
    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idPresta", nullable = false)
    private UserN presta;
    
    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idSePresta", nullable = false)
    private UserN sePresta;

    public Prestamo() {
    }

    public String getIdPrest() {
        return idPrest;
    }

    public void setIdPrest(String idPrest) {
        this.idPrest = idPrest;
    }
    
    public Date getFechIniPrest() {
        return fechIniPrest;
    }

    public void setFechIniPrest(Date fechIniPrest) {
        this.fechIniPrest = fechIniPrest;
    }

    public Date getFechFinPrest() {
        return fechFinPrest;
    }

    public void setFechFinPrest(Date fechFinPrest) {
        this.fechFinPrest = fechFinPrest;
    }

    public Date getFechDevPrest() {
        return fechDevPrest;
    }

    public void setFechDevPrest(Date fechDevPrest) {
        this.fechDevPrest = fechDevPrest;
    }

    public Computadora getCompu() {
        return compu;
    }

    public void setCompu(Computadora compu) {
        this.compu = compu;
    }

    public UserN getPresta() {
        return presta;
    }

    public void setPresta(UserN presta) {
        this.presta = presta;
    }

    public UserN getSePresta() {
        return sePresta;
    }

    public void setSePresta(UserN sePresta) {
        this.sePresta = sePresta;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "idPrest=" + idPrest + ", fechIniPrest=" + fechIniPrest + ", fechFinPrest=" + fechFinPrest + ", fechDevPrest=" + fechDevPrest + ", compu=" + compu.getDisp().getIdDisp() + ", presta=" + presta.getIdUsrN() + ", sePresta=" + sePresta.getIdUsrN() + '}';
    }
    
    
   
    
}
