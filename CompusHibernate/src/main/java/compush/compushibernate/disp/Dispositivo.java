/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.disp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.Set;

@Entity
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDisp;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idMarca", nullable = false)
    private Marca marca;
    
    @OneToMany(mappedBy = "disp", cascade = CascadeType.ALL)
    private Set<HistorialEstado> histEst;

    public Dispositivo() {
    }

    public int getIdDisp() {
        return idDisp;
    }

    public void setIdDisp(int idDisp) {
        this.idDisp = idDisp;
    }


    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    public Set<HistorialEstado> getHistEst() {
        return histEst;
    }

    public void setHistEst(Set<HistorialEstado> histEst) {
        this.histEst = histEst;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "idDisp=" + idDisp + ", marca=" + marca.toString() + '}';
    }

    @Override
    public boolean equals(Object o){
        boolean equals;
        
        if(o instanceof Dispositivo){
            equals = this.idDisp == ((Dispositivo)o).idDisp;
        }else{
            equals = false;
        }
        
        return equals;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.idDisp;
        return hash;
    }
    
    
}
