/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.seguridad;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Funcion_IU {
  
   @Id
   @ManyToOne(fetch=FetchType.LAZY)
   @JoinColumn(name = "idFunc")
   private Funcion funcion;
   
   @Id
   @ManyToOne(fetch=FetchType.LAZY)
   @JoinColumn(name = "idIU")
   private IU iu;

    public Funcion_IU() {
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public IU getIu() {
        return iu;
    }

    public void setIu(IU iu) {
        this.iu = iu;
    }
   
   
}
