/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.ejb.GruposAlumnosFacadeLocal;
import com.sv.udb.modelo.GruposAlumnos;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.primefaces.context.RequestContext;

/**
 *
 * @author REGISTRO
 */
@Named(value = "gruposAlumnosBean")
@ViewScoped
public class GruposAlumnosBean implements Serializable{

    @EJB
    private GruposAlumnosFacadeLocal gruposAlumnosFacade;
    private GruposAlumnos objeGrupAlum;
    /**
     * Creates a new instance of GruposAlumnosBean
     */
    public GruposAlumnosBean() {
    }

    @PostConstruct
    public void init()
    {
        this.objeGrupAlum = new GruposAlumnos();
    }
    public GruposAlumnos getObjeGrupAlum() {
        return objeGrupAlum;
    }

    public void setObjeGrupAlum(GruposAlumnos objeGrupAlum) {
        this.objeGrupAlum = objeGrupAlum;
    }
    
    public void guar()
    {
        RequestContext ctx = RequestContext.getCurrentInstance(); //Capturo el contexto de la página
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try
        {
//          FCDEAlum.create(this.objeAlum);
//            this.guardar = true;
            ctx.execute("setMessage('MESS_SUCC','Atencion','Datos guardados')");
        }
        catch(Exception ex)
        {
            ctx.execute("setMessage('MESS_ERRO', 'Atención', 'Error al guardar ')");
            tx.rollback();
        }
        finally
        {
            em.close();
            emf.close();            
        }
    }
}
