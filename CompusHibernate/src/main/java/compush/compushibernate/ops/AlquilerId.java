/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.ops;

import compush.compushibernate.disp.Computadora;
import compush.compushibernate.seguridad.UserN;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AlquilerId implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idAlqui;
    
    private Computadora compu;
    
    private UserN alquilador;
    
    // Constructores, getters y setters

    public AlquilerId() {
    }

    public int getIdAlqui() {
        return idAlqui;
    }

    public void setIdAlqui(int idAlqui) {
        this.idAlqui = idAlqui;
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
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.idAlqui;
        hash = 47 * hash + Objects.hashCode(this.compu);
        hash = 47 * hash + Objects.hashCode(this.alquilador);
        return hash;
    }
    
    public boolean equals(Object o){
        return o instanceof AlquilerId && idAlqui == (((AlquilerId)o).idAlqui) && 
                    compu.equals(((AlquilerId)o).compu) && alquilador.equals(((AlquilerId)o).alquilador);
    }
}