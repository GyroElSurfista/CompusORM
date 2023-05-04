/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate.reg;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
public class Bitacora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBitacora;
    
    private String datoNBit;
    
    private String datoVBit;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fecAccBit;
    
    @Column(nullable = false)
    private String accbit;
    
    @Column(nullable = false)
    private String nomUsrBit;

    public Bitacora() {
    }

    public int getIdBitacora() {
        return idBitacora;
    }

    public void setIdBitacora(int idBitacora) {
        this.idBitacora = idBitacora;
    }

    public String getDatoNBit() {
        return datoNBit;
    }

    public void setDatoNBit(String datoNBit) {
        this.datoNBit = datoNBit;
    }

    public String getDatoVBit() {
        return datoVBit;
    }

    public void setDatoVBit(String datoVBit) {
        this.datoVBit = datoVBit;
    }

    public Date getFecAccBit() {
        return fecAccBit;
    }

    public void setFecAccBit(Date fecAccBit) {
        this.fecAccBit = fecAccBit;
    }

    public String getAccbit() {
        return accbit;
    }

    public void setAccbit(String accbit) {
        this.accbit = accbit;
    }

    
    public String getNomUsrBit() {
        return nomUsrBit;
    }

    public void setNomUsrBit(String nomUsrBit) {
        this.nomUsrBit = nomUsrBit;
    }
    
    
    
}
