/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.ejb;

import com.sv.udb.modelo.Alumnos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Laboratorio
 */
@Stateless
public class AlumnosFacade extends AbstractFacade<Alumnos> implements AlumnosFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Guia6_POO2_VaneUrrutia_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlumnosFacade() {
        super(Alumnos.class);
    }
    
}
