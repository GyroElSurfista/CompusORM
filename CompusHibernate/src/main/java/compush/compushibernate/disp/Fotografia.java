/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.disp;

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
public class Fotografia {
    @Id
    private String idFoto;
    
    @Column(nullable = false)
    private byte[] imgFoto;
    
    private String descFoto;
    
    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idComp", nullable = false)
    private Computadora compu;

    public Fotografia() {
    }

    public String getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(String idFoto) {
        this.idFoto = idFoto;
    }

    
    public byte[] getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(byte[] imgFoto) {
        this.imgFoto = imgFoto;
    }

    public String getDescFoto() {
        return descFoto;
    }

    public void setDescFoto(String descFoto) {
        this.descFoto = descFoto;
    }

    public Computadora getCompu() {
        return compu;
    }

    public void setCompu(Computadora compu) {
        this.compu = compu;
    }
    
    @Override
    public boolean equals(Object o){
        boolean equals;
        
        if(o instanceof Fotografia){
            equals = this.idFoto.equals(((Fotografia)o).idFoto) && this.compu.equals(((Fotografia)o).compu);
        }else{
            equals = false;
        }
        
        return equals;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.idFoto);
        hash = 67 * hash + Objects.hashCode(this.compu);
        return hash;
    }
    
}
