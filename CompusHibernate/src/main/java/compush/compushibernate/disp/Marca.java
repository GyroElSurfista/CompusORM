/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.disp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;

@Entity
public class Marca {
    @Id
    @Column(nullable = false)
    private String nomMarca;
    @OneToMany(mappedBy = "marca")
    private Set<Dispositivo> disp;

    public Marca() {
    }

    public String getNomMarca() {
        return nomMarca;
    }

    public void setNomMarca(String nomMarca) {
        this.nomMarca = nomMarca;
    }

    public Set<Dispositivo> getDisp() {
        return disp;
    }

    public void setDisp(Set<Dispositivo> disp) {
        this.disp = disp;
    }

    @Override
    public String toString() {
        return "Marca{" + "nomMarca=" + nomMarca + '}';
    }

    
    
}
