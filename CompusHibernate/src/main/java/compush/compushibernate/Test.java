/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compush.compushibernate;

import compush.compushibernate.disp.Computadora;
import compush.compushibernate.disp.Dispositivo;
import compush.compushibernate.disp.Marca;
import compush.compushibernate.ops.Alquiler;
import compush.compushibernate.seguridad.UserN;
import java.util.Date;
import java.util.HashSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Jairo
 */
public class Test {
    private SessionFactory sf;
    
    public Test(){
        sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }
    
    public void test(){
        Session s;
        sf.openSession(); 
        
        Marca m;
        
        m = new Marca();
        
        m.setDisp(new HashSet<>());
        m.setNomMarca("MarcaChida");
        
        
        Dispositivo d;
        
        d = new Dispositivo();
        
        d.setHistEst(new HashSet<>());
        d.setMarca(m);
        
        m.getDisp().add(d);
        
        Computadora c;
        
        c = new Computadora();
        
        c.setCapaCompu(1024);
        c.setRamCompu(323);
        c.setPerifs(new HashSet<>());
        c.setFotos(new HashSet<>());
        c.setPrestamos(new HashSet<>());
        c.setAlquileres(new HashSet<>());
        c.setDisp(d);
        
        UserN usr;
        
        usr = new UserN();
        
        usr.setAlquileres(new HashSet<>());
        usr.setNomUsrN("Juanito");
        usr.setPassUsrN("123");
        usr.setNomPUsrN("Juan");
        usr.setApePUsrN("García");
        usr.setPrestRecib(new HashSet<>());
        usr.setPrestados(new HashSet<>());
        usr.setSesiones(new HashSet<>());
        usr.setUsern_rols(new HashSet<>());
        
        Alquiler a;
        
        a = new Alquiler();
        
       // a.setIdAlqui(1);
        a.setAlquilador(usr);
        a.setCompu(c);
        a.setFechIniAlqui(new Date());
        a.setFechFinAlqui(new Date());
        
        
        s = sf.openSession();
        
        s.beginTransaction();
        
        s.save(m);
        s.save(d);
        s.save(c);
        s.save(usr);
        s.save(a);
        
        s.getTransaction().commit();
        
        s.close();
        
        sf.close();
    }
}
