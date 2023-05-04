/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.disp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.util.Objects;

@Entity
public class Periferico {
    @Column(nullable = false)
    private String nomPerif;
    
    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDisp")
    private Dispositivo disp;
    
    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idComp", nullable = false)
    private Computadora compu;
            
    public Periferico() {
    }

    public String getNomPerif() {
        return nomPerif;
    }

    public void setNomPerif(String nomPerif) {
        this.nomPerif = nomPerif;
    }

    public Dispositivo getDisp() {
        return disp;
    }

    public void setDisp(Dispositivo disp) {
        this.disp = disp;
    }

    public Computadora getCompu() {
        return compu;
    }

    public void setCompu(Computadora compu) {
        this.compu = compu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.disp);
        hash = 29 * hash + Objects.hashCode(this.compu);
        return hash;
    }
    
    @Override
    public boolean equals(Object o){
        return o instanceof Periferico && disp.equals(((Periferico)o).getDisp()) && compu.equals(((Periferico)o).getCompu());
    }
    
}
