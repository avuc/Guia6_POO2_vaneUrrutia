/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.ejb;

import com.sv.udb.modelo.Cursos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Laboratorio
 */
@Stateless
public class CursosFacade extends AbstractFacade<Cursos> implements CursosFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Guia6_POO2_VaneUrrutia_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CursosFacade() {
        super(Cursos.class);
    }
    
}
