/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import compush.compushibernate.disp.Computadora;
import compush.compushibernate.disp.HistorialEstado;
import compush.compushibernate.disp.Periferico;
import compush.compushibernate.ops.Alquiler;
import compush.compushibernate.ops.Prestamo;
import compush.compushibernate.seguridad.UserN;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Arrays;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Jairo
 */
public class Ejecutor {
      
   public static ArrayList<Computadora> getCompus(SessionFactory sf){
        ArrayList<Computadora> compus;
        
       
        Session s;
        CriteriaBuilder cb;
        CriteriaQuery c;
        Root<Computadora> cR;
        Query q;

        s = sf.openSession();
        cb = s.getCriteriaBuilder();
        c = cb.createQuery(Computadora.class);

        cR = c.from(Computadora.class);

        q = s.createQuery(c);

        try {
            compus = (ArrayList<Computadora>)q.getResultList();
        } catch (NoResultException ex) {
            compus = null;
            System.out.println("NO HAY COMPUTADORAS");
        }

        s.close();
        
        return compus;
    }        
    
   public static ArrayList<Object[]> getDispFunc(SessionFactory sf){
        ArrayList<Object[]> dispFunc;
        ArrayList<Object[]> histFunc;
        ArrayList<Object[]> ultHist;
        
        histFunc    = getHistFunc(sf);
        ultHist     = getUltHist(sf);
        
        dispFunc = getDispFunc(histFunc, ultHist);
        
        return dispFunc;
    }
   
   public static ArrayList<Object[]> getHistFunc(SessionFactory sf) {
        ArrayList<Object[]> hist;

        Session s;
        CriteriaBuilder cb;
        CriteriaQuery<Object[]> c;
        Root<HistorialEstado> h;
        Query q;

        s = sf.openSession();
        cb = s.getCriteriaBuilder();
        c = cb.createQuery(Object[].class);

        h = c.from(HistorialEstado.class);
        c.select(cb.array(h.get("disp").get("idDisp"), h.get("fechEst"), h.get("nomEst")));
        c.where(cb.equal(h.get("nomEst"), "Funcional"));
        
        q = s.createQuery(c);

        try {
            hist = (ArrayList<Object[]>)q.getResultList();
        } catch (NoResultException ex) {
            hist = null;
            System.out.println("NO HAY HISTORIALES");
        }

        s.close();

        return hist;
    }
   
    public static ArrayList<Object[]> getEstados(SessionFactory sf){
        ArrayList<Object[]> hist;
        ArrayList<Object[]> ultHist;
       
                
        hist    = Ejecutor.getHist(sf);
        ultHist = Ejecutor.getUltHist(sf);
        
        return getEstados(sf, hist, ultHist);
    }
   
    public static ArrayList<Object[]> getEstados(SessionFactory sf, ArrayList<Object[]> hist, ArrayList<Object[]> ultHist){
         ArrayList<Object[]> est;
         Object[] sub;
         Object[] o;

         est = new ArrayList<>();

         for(int i = 0 ; i < hist.size() ; i++){
             o = hist.get(i);

             for(int j = 0 ; j < ultHist.size() ; j++){
                 if(o[0] == ultHist.get(j)[0] && o[1].equals(ultHist.get(j)[1])){
                     est.add(o);
                     break;
                 }
             }

         }

         return est;
     }
   
    public static ArrayList<Object[]> getHist(SessionFactory sf) {
         ArrayList<Object[]> hist;

         Session s;
         CriteriaBuilder cb;
         CriteriaQuery<Object[]> c;
         Root<HistorialEstado> h;
         Query q;

         s = sf.openSession();
         cb = s.getCriteriaBuilder();
         c = cb.createQuery(Object[].class);

         h = c.from(HistorialEstado.class);
         c.select(cb.array(h.get("disp").get("idDisp"), h.get("fechEst"), h.get("nomEst")));
         c.orderBy(cb.asc(h.get("disp").get("idDisp")));

         q = s.createQuery(c);

         try {
             hist = (ArrayList<Object[]>)q.getResultList();
         } catch (NoResultException ex) {
             hist = null;
             System.out.println("NO HAY HISTORIALES");
         }

         s.close();

         return hist;
     }

    public static ArrayList<Object[]> getUltHist(SessionFactory sf){
        ArrayList<Object[]> ultHist;
        
        Session s;
        CriteriaBuilder cb;
        CriteriaQuery c;
        Root<HistorialEstado> h;
        Query q;
        
        s = sf.openSession();
        cb = s.getCriteriaBuilder();
        c = cb.createQuery();
        
        h = c.from(HistorialEstado.class);
        c.multiselect(h.get("disp").get("idDisp"), cb.max(h.get("fechEst")));
        c.groupBy(h.get("disp").get("idDisp"));
        
        q = s.createQuery(c);
        
        try{
            ultHist = (ArrayList<Object[]>)q.getResultList();
            
        }catch(NoResultException ex){
            ultHist = null;
            System.out.println("NO HAY HISTORIALES");            
            s.close();
        }
        
        s.close();
        
        return ultHist;
    }
    
    public static ArrayList<Object[]> getDispFunc(ArrayList<Object[]> histFunc, ArrayList<Object[]> ultHist){
        ArrayList<Object[]> dispFunc;
        Object[] o, aux;
        
        dispFunc = new ArrayList<>();
        
        for(int i = 0 ; i < histFunc.size(); i++){
            o   = histFunc.get(i);
            for(int j = 0 ; j < ultHist.size(); j++){
                if(o[0] == ultHist.get(j)[0] && o[1].equals(ultHist.get(j)[1])){
                    aux = Arrays.copyOfRange(o, 0, 1);
                    dispFunc.add(aux);
                    break;
                }
            }
        }
        
        return dispFunc;
    }
    
    public static ArrayList<Computadora> getCompusFunc(SessionFactory sf){
        ArrayList<Computadora> compusFunc;
        ArrayList<Computadora> compus;
        ArrayList<Object[]> dispFunc;
        
        
        compus = getCompus(sf);
        dispFunc = getDispFunc(sf);
        
        compusFunc = getCompusFunc(sf, compus, dispFunc);
        
        return compusFunc;
    }
    
    public static ArrayList<Computadora> getCompusFunc(SessionFactory sf, ArrayList<Computadora> compus, ArrayList<Object[]> dispFunc){
        ArrayList<Computadora> compusFunc;
        Computadora c;
        
        compusFunc = new ArrayList<>();
        
        for(int i = 0 ; i < compus.size() ; i++){
            c = compus.get(i);
            
            for(int j = 0 ; j < dispFunc.size() ; j++){
                if(c.getDisp().getIdDisp() == (Integer)dispFunc.get(j)[0] && todosDispFunc(sf, c)){
                    compusFunc.add(c);
                    break;
                }
            }
        }
        
        return compusFunc;
    }
    
    private static boolean todosDispFunc(SessionFactory sf, Computadora c){
        boolean todosFunc;
        ArrayList<HistorialEstado> estPerifComp;
        
        todosFunc = true;
        estPerifComp = getEstPerifComp(sf, c.getDisp().getIdDisp());
        if(!estPerifComp.isEmpty()){
            for(HistorialEstado h : estPerifComp){
                if(!h.getNomEst().equals("Funcional")){
                    todosFunc = false;
                    break;
                }
            }
        }
        
        return todosFunc;
    }
    
    public static ArrayList<Computadora> getCompusAlqui(SessionFactory sf){
        ArrayList<Computadora> compusAlqui;
        
        Session s;
        CriteriaBuilder cb;
        CriteriaQuery c;
        Root<Alquiler> a;
        Query q;
        
        s = sf.openSession();
        cb = s.getCriteriaBuilder();
        c = cb.createQuery();
        a = c.from(Alquiler.class);
        
        c.select(a.get("compu"));
        c.where(cb.isNull(a.get("fechDevAlqui")));
        
        q = s.createQuery(c);
        
        try{
            compusAlqui = (ArrayList<Computadora>)q.getResultList();
            
        }catch(NoResultException ex){
            compusAlqui = null;
            System.out.println("NO HAY COMPUTADORAS ALQUILADAS");            
            s.close();
        }
        
        s.close();   
        
        return compusAlqui;
        
    }
    
    public static ArrayList<Object[]> getAlqNoPrest(SessionFactory sf, UserN usern){
        ArrayList<Object[]> alqNPr;
        ArrayList<Object[]> alqNPrAux;
        ArrayList<Object[]> idCoPr;
        
        alqNPr = new ArrayList<>();
        alqNPrAux = qGetAlqNoPrest(sf, usern);
        idCoPr = getIdCompusPrest(sf);
        
        if(idCoPr.isEmpty()){
            alqNPr = alqNPrAux;
        }else{
            for(Object[] a : alqNPrAux){
                for(Object[] p : idCoPr){
                    if(a[1] == p[0]){
                        alqNPr.add(a);
                        break;
                    }
                }
               
            }
        }
        
        
            
        return alqNPr;
    }
    
    private static ArrayList<Object[]> qGetAlqNoPrest(SessionFactory sf, UserN usern){
        ArrayList<Object[]> alqs;
        
        Session s;
        CriteriaBuilder cb;
        Root<Alquiler> a;
        CriteriaQuery c;
        Query q;
        
        
        s  = sf.openSession();
        cb = s.getCriteriaBuilder();
        c  = cb.createQuery();
        a = c.from(Alquiler.class);
        
        c.multiselect(
                a.get("idAlqui"),
                a.get("compu").get("disp").get("idDisp"),
                a.get("fechIniAlqui"),
                a.get("fechFinAlqui") 
                
        ).where(
                cb.and(
                        cb.equal(a.get("alquilador"), usern),
                        cb.isNull(a.get("fechDevAlqui")))
                
        );
                
        q = s.createQuery(c);
        
        try{
            alqs = (ArrayList<Object[]>)q.getResultList();
            
        }catch(NoResultException ex){
            alqs = new ArrayList<>();
            System.out.println("NO HAY COMPUS ALQUILADAS");
            s.close();
        }
        
        s.close();
        
        return alqs;
    }
    
    
    public static ArrayList<Object[]> getIdCompusPrest(SessionFactory sf){
        ArrayList<Object[]> prest;
        Session s;
        CriteriaBuilder cb;
        Root<Prestamo> p;
        CriteriaQuery c;
        Query q;
        
        s = sf.openSession();
        cb = s.getCriteriaBuilder();
        c = cb.createQuery();
        p = c.from(Prestamo.class);
        
        c.select(p.get("compu").get("disp").get("idDisp"));
        c.where(cb.isNull(p.get("fechDevPrest")));
        
        q = s.createQuery(c);
        
        try{
            prest = (ArrayList<Object[]>)q.getResultList();
            
        }catch(NoResultException ex){
            prest = new ArrayList<>();
            System.out.println("NO HAY COMPUS PRESTADAS");
            s.close();
        }
        
        s.close();
        
        return prest;
    }
 
    public static ArrayList<Alquiler> getAlqui(SessionFactory sf){
        ArrayList<Alquiler> alqui;
        
        Session s;
        CriteriaBuilder cb;
        CriteriaQuery c;
        Root<Alquiler> a;
        Query q;
        
        s = sf.openSession();
        cb = s.getCriteriaBuilder();
        c = cb.createQuery();
        a = c.from(Alquiler.class);
        
        c.select(a);
        c.where(cb.isNull(a.get("fechDevAlqui")));
        
        q = s.createQuery(c);
        
        try{
            alqui = (ArrayList<Alquiler>)q.getResultList();
            
        }catch(NoResultException ex){
            alqui = null;
            System.out.println("NO HAY ALQUILERES");            
            s.close();
        }
        
        s.close();   
        
        return alqui;
    }
    
    public static ArrayList<Computadora> getCompusPrest(SessionFactory sf){
        ArrayList<Computadora> prest;
        Session s;
        CriteriaBuilder cb;
        Root<Prestamo> p;
        CriteriaQuery c;
        Query q;
        
        s = sf.openSession();
        cb = s.getCriteriaBuilder();
        c = cb.createQuery();
        p = c.from(Prestamo.class);
        
        c.select(p.get("compu"));
        c.where(cb.isNull(p.get("fechDevPrest")));
        
        q = s.createQuery(c);
        
        try{
            prest = (ArrayList<Computadora>)q.getResultList();
            
        }catch(NoResultException ex){
            prest = new ArrayList<>();
            System.out.println("NO HAY COMPUS PRESTADAS");
            s.close();
        }
        
        s.close();
        
        return prest;
    }
    
    public static ArrayList<Alquiler> getAlquiDispPrest(SessionFactory sf){
        ArrayList<Alquiler> alquiDisp;
        ArrayList<Alquiler> alqui;
        ArrayList<Alquiler> alquiFunc;
        ArrayList<Computadora> compusFunc;
        ArrayList<Computadora> compusPrest;
        
        alqui = getAlqui(sf);
        compusFunc = getCompusFunc(sf);
        compusPrest = getCompusPrest(sf);
        
        alquiFunc = Ejecutor.getAlquiFunc(alqui, compusFunc);
        alquiDisp = Ejecutor.getCompusDispPrest(alquiFunc, compusPrest);
        
        return alquiDisp;
    }
    
    public static ArrayList<Alquiler> getAlquiFunc(ArrayList<Alquiler> alqui, ArrayList<Computadora> compusFunc){
        ArrayList<Alquiler> alquiFunc;
        alquiFunc = new ArrayList<>();
        
        for(Alquiler a : alqui){
            for(Computadora c : compusFunc){
                if(a.getCompu().equals(c)){
                    alquiFunc.add(a);
                    break;
                }
            }
        }
        
        return alquiFunc;
    }
    
    public static ArrayList<Alquiler> getCompusDispPrest(ArrayList<Alquiler> alquiFunc, ArrayList<Computadora> compusPrest){
        ArrayList<Alquiler> dispPrest;
        dispPrest = new ArrayList<>();
        
        
        
        if(compusPrest.isEmpty()){
            dispPrest = alquiFunc;
        }else{
            for(Alquiler a : alquiFunc){
                if(!compusPrest.contains(a.getCompu())){
                    dispPrest.add(a);
                }
            }
        }
        
        return dispPrest;
    }
    
    
    public static ArrayList<Prestamo> getPrest(SessionFactory sf, UserN sePresta){
        ArrayList<Prestamo> prest;
        Session s;
        CriteriaBuilder cb;
        Root<Prestamo> p;
        CriteriaQuery c;
        Query q;
        
        s = sf.openSession();
        cb = s.getCriteriaBuilder();
        c = cb.createQuery();
        p = c.from(Prestamo.class);
        
        c.select(p);
        c.where(cb.and(cb.isNull(p.get("fechDevPrest")), cb.equal(p.get("sePresta"), sePresta)));
        
        q = s.createQuery(c);
        
        try{
            prest = (ArrayList<Prestamo>)q.getResultList();
            
        }catch(NoResultException ex){
            prest = new ArrayList<>();
            System.out.println("NO HAY PRESTAMOS");
            s.close();
        }
        
        s.close();
        
        return prest;
        
    }
    
    public static ArrayList<HistorialEstado> getEstPerifComp(SessionFactory sf, int idComp){
        ArrayList<HistorialEstado> estPerifsComp;
        ArrayList<Integer> idPerifsComp;
        
        estPerifsComp = new ArrayList<>();
        idPerifsComp = getIdPerifsComp(sf, idComp);
        
        for(Integer i : idPerifsComp){
            estPerifsComp.add(getEstActDisp(sf, i));
        }
        
        return estPerifsComp;
    }
    
    
    public static ArrayList<Integer> getIdPerifsComp(SessionFactory sf, int idComp){
        ArrayList<Integer> idPerifsComp;
        Session s;
        CriteriaBuilder cb;
        CriteriaQuery c;
        Root<Periferico> p;
        Query q;
        
        s = sf.openSession();
        cb = s.getCriteriaBuilder();
        c = cb.createQuery();
        p = c.from(Periferico.class);
        
        c.select(p.get("disp").get("idDisp"));
        c.where(cb.equal(p.get("compu").get("disp").get("idDisp"), idComp));
        
        q = s.createQuery(c);
        
        try{
            idPerifsComp = (ArrayList<Integer>)q.getResultList();
            
        }catch(NoResultException ex){
            idPerifsComp = new ArrayList<>();
            System.out.println("NO HAY PERIFERICOS");            
            s.close();
        }
        
        s.close();
        
        return idPerifsComp;
    }
    
    
    public static HistorialEstado getEstActDisp(SessionFactory sf, int idDisp){
        HistorialEstado estAct;
        ArrayList<HistorialEstado> hist;
        ArrayList<Object[]> ultHist;
        
        hist = getHistDisp(sf, idDisp);
        ultHist = getUltHistDisp(sf, idDisp);
        
        estAct = getEstAct(hist, ultHist);
        
        return estAct;
    }
    
    public static ArrayList<HistorialEstado> getHistDisp(SessionFactory sf, int idDisp){
        ArrayList<HistorialEstado> hist;
        
        Session s;
        CriteriaBuilder cb;
        CriteriaQuery c;
        Root<HistorialEstado> h;
        Query q;
        
        s = sf.openSession();
        cb = s.getCriteriaBuilder();
        c = cb.createQuery();
        
        h = c.from(HistorialEstado.class);
        c.select(h);
        c.where(cb.equal(h.get("disp").get("idDisp"), idDisp));
        
        q = s.createQuery(c);
        
        try{
            hist = (ArrayList<HistorialEstado>)q.getResultList();
            
        }catch(NoResultException ex){
            hist = new ArrayList<>();
            System.out.println("NO HAY HISTORIALES");            
            s.close();
        }
        
        s.close();
        
        return hist;
    }
    
    public static ArrayList<Object[]> getUltHistDisp(SessionFactory sf, int idDisp){
        ArrayList<Object[]> ultHist;
        
        Session s;
        CriteriaBuilder cb;
        CriteriaQuery c;
        Root<HistorialEstado> h;
        Query q;
        
        s = sf.openSession();
        cb = s.getCriteriaBuilder();
        c = cb.createQuery();
        
        h = c.from(HistorialEstado.class);
        c.multiselect(h.get("disp").get("idDisp"), cb.max(h.get("fechEst")));
        c.where(cb.equal(h.get("disp").get("idDisp"), idDisp));
        c.groupBy(h.get("disp").get("idDisp"));
        
        q = s.createQuery(c);
        
        try{
            ultHist = (ArrayList<Object[]>)q.getResultList();
            
        }catch(NoResultException ex){
            ultHist = null;
            System.out.println("NO HAY HISTORIALES");            
            s.close();
        }
        
        s.close();
        
        return ultHist;
    }
    
    private static HistorialEstado getEstAct(ArrayList<HistorialEstado> hist, ArrayList<Object[]> ultHist){
        HistorialEstado estAct;
        
        estAct = null;
        
        for(HistorialEstado h : hist){
            if(h.getDisp().getIdDisp() == (Integer)ultHist.get(0)[0] && h.getFechEst().equals(ultHist.get(0)[1])){
                estAct = h;
                break;
            }
        }
        
        return estAct;
    }
}
