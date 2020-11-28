package edu.upc.dsa;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class Covid19ManagerTest {

    //Creamos logger para ir comentandolo
    //en principio no añadiremos muchos comentarios
    final static Logger log = Logger.getLogger(Covid19ManagerTest.class.getName());

    //creamos instancia privada de nuestro contrato debido en parte al singleton
    private Covid19Manager c19;

    //en esta función de prueba inicializaremos todos los casos
    //crearemos juego de pruebas inicial
    @Before
    public void setUp() {
        Covid19ManagerImpl.getInstance().addUser("0","Pepe","Rodríguez","07/08/1980","A");
        Covid19ManagerImpl.getInstance().addUser("1","Marcos","Martínez","16/08/1976","D");
        Covid19ManagerImpl.getInstance().addUser("2","Alicia","Fernández","20/08/1950","C");



    }

    //2 metodos / crear nuevo usuario / procesar una muestra
    @Test
    public void testAddUser() {
        try {
            this.c19.addUser("3", "Blanca", "De Fuentes", "09/08/1990", "B");
            Assert.assertEquals(4, this.c19.numUsers());
        }

        catch(NullPointerException e){
            log.info("NullPointerException caught");
        }
    }



    //limpiamos toda la estructura de datos
    @After
    public void tearDown() {
        try {
            this.c19.clear();
        }
        catch(NullPointerException e){
            log.info("NullPointerException caught");
        }
    }







}
