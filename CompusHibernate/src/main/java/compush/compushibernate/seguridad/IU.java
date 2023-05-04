/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;

@Entity
public class IU {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIU;
    
    @Column(nullable = false)
    private String nomIU;
    
    @Column(nullable = false)
    private boolean actIU;
    
    @OneToMany(mappedBy = "iu")
    private Set<Funcion_IU> funcion_ius;

    public IU() {
    }

    public int getIdIU() {
        return idIU;
    }

    public void setIdIU(int idIU) {
        this.idIU = idIU;
    }

    public String getNomIU() {
        return nomIU;
    }

    public void setNomIU(String nomIU) {
        this.nomIU = nomIU;
    }

    public boolean isActIU() {
        return actIU;
    }

    public void setActIU(boolean actIU) {
        this.actIU = actIU;
    }

    public Set<Funcion_IU> getFuncion_ius() {
        return funcion_ius;
    }

    public void setFuncion_ius(Set<Funcion_IU> funcion_ius) {
        this.funcion_ius = funcion_ius;
    }
    
    
}
