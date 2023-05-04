/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.ops;

import compush.compushibernate.disp.Computadora;
import compush.compushibernate.seguridad.UserN;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import java.util.Objects;

@Entity
public class Alquiler {
    
    @Id
    private String idAlqui;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechIniAlqui;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechFinAlqui;
    
    @Temporal(TemporalType.DATE)
    private Date fechDevAlqui;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "idComp", nullable = false)
    private Computadora compu;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "idAlquilador", nullable = false)
    private UserN alquilador;
    

    public Alquiler() {
    }

    public String getIdAlqui() {
        return idAlqui;
    }

    public void setIdAlqui(String idAlqui) {
        this.idAlqui = idAlqui;
    }
    
    public Date getFechIniAlqui() {
        return fechIniAlqui;
    }

    public void setFechIniAlqui(Date fechIniAlqui) {
        this.fechIniAlqui = fechIniAlqui;
    }

    public Date getFechFinAlqui() {
        return fechFinAlqui;
    }

    public void setFechFinAlqui(Date fechFinAlqui) {
        this.fechFinAlqui = fechFinAlqui;
    }

    public Date getFechDevAlqui() {
        return fechDevAlqui;
    }

    public void setFechDevAlqui(Date fechDevAlqui) {
        this.fechDevAlqui = fechDevAlqui;
    }

    public Computadora getCompu() {
        return compu;
    }

    public void setCompu(Computadora compu) {
        this.compu = compu;
    }

    public UserN getAlquilador() {
        return alquilador;
    }

    public void setAlquilador(UserN alquilador) {
        this.alquilador = alquilador;
    }
 
    @Override
    public boolean equals(Object o){
        boolean equals;
        if(o instanceof Alquiler){
            equals = this.idAlqui.equals(((Alquiler)o).getIdAlqui());
        }else{
            equals = false;
        }
        
        return equals;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.idAlqui);
        return hash;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "idAlqui=" + idAlqui + ", fechIniAlqui=" + fechIniAlqui + ", fechFinAlqui=" + fechFinAlqui + ", fechDevAlqui=" + fechDevAlqui + ", compu=" + compu.getDisp().getIdDisp() + ", alquilador=" + alquilador.getIdUsrN() + '}';
    }
    
    
}
