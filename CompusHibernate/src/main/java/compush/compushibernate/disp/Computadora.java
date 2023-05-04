/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.disp;

import compush.compushibernate.ops.Alquiler;
import compush.compushibernate.ops.Prestamo;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.Objects;
import java.util.Set;

@Entity
public class Computadora {
    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDisp")
    private Dispositivo disp;
    
    @Column(nullable = false)
    private int ramCompu;
    
    @Column(nullable = false)
    private int capaCompu;
    
    @OneToMany(mappedBy = "compu")
    private Set<Periferico> perifs;
    
    @OneToMany(mappedBy = "compu")
    private Set<Fotografia> fotos;
    
    @OneToMany(mappedBy = "compu", cascade = CascadeType.ALL)
    private Set<Prestamo> prestamos;
    
    @OneToMany(mappedBy = "compu", cascade = CascadeType.ALL)
    private Set<Alquiler> alquileres; 
    
    public Computadora() {
    }

    public int getRamCompu() {
        return ramCompu;
    }

    public void setRamCompu(int ramCompu) {
        this.ramCompu = ramCompu;
    }

    public int getCapaCompu() {
        return capaCompu;
    }

    public void setCapaCompu(int capaCompu) {
        this.capaCompu = capaCompu;
    }

    public Dispositivo getDisp() {
        return disp;
    }

    public void setDisp(Dispositivo disp) {
        this.disp = disp;
    }

    public Set<Periferico> getPerifs() {
        return perifs;
    }

    public void setPerifs(Set<Periferico> perifs) {
        this.perifs = perifs;
    }

    public Set<Fotografia> getFotos() {
        return fotos;
    }

    public void setFotos(Set<Fotografia> fotos) {
        this.fotos = fotos;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Set<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(Set<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    @Override
    public String toString() {
        return "Computadora{" + "disp=" + disp.toString() + ", ramCompu=" + ramCompu + ", capaCompu=" + capaCompu + '}';
    }

    
    
 
    @Override
    public boolean equals(Object o){
        boolean equals;
        
        if(o instanceof Computadora){
            equals = this.disp.equals(((Computadora)o).disp);
        }else{
            equals = false;
        }
        
        return equals;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.disp);
        return hash;
    }
}
