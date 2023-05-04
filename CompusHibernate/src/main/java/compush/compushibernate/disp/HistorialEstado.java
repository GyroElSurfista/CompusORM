/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.disp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import java.util.Objects;

@Entity
public class HistorialEstado {
    @Id
    @Temporal(TemporalType.DATE)
    private Date fechEst;
    
    @Column(nullable = false)
    private String nomEst;
    
    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idDisp", nullable = false)
    private Dispositivo disp;

    public HistorialEstado() {
    }

    public Date getFechEst() {
        return fechEst;
    }

    public void setFechEst(Date fechEst) {
        this.fechEst = fechEst;
    }

    public String getNomEst() {
        return nomEst;
    }

    public void setNomEst(String nomEst) {
        this.nomEst = nomEst;
    }

    public Dispositivo getDisp() {
        return disp;
    }

    public void setDisp(Dispositivo disp) {
        this.disp = disp;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.fechEst);
        hash = 47 * hash + Objects.hashCode(this.disp);
        return hash;
    }
    

    
    @Override
    public boolean equals(Object o){
        return o instanceof HistorialEstado && fechEst.equals(((HistorialEstado)o).getFechEst()) && disp.equals(((HistorialEstado)o).getDisp());
    }
}
