/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.utils;

import java.io.InputStream;
import java.util.Properties;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author vaness
 */
public class MyLogger implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        InputStream in = getClass().getResourceAsStream("/log4j.properties");
        if(in!=null)
        {
            System.out.println("Se encontro!");
            PropertyConfigurator.configure(in);
            System.out.println("Propiedades personalizadas de logger-> ");
        }
        else
        {
            System.out.println("NBo fallo");
            BasicConfigurator.configure();
            System.out.println("Propiedades personalizadas de logger-> ");
        }
        System.out.println("yas");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }
        
}
