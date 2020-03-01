/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.test;

import ico.fes.camisa.Camisas;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abraham
 */
public class TestCamisas {
    
    private Camisas objeto;
    
    public TestCamisas() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //Creación de camisas de manga corta con 10 ejemplares en bodega
        objeto = new Camisas(1, 10, 190, "corta");
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void probarComprarCamisas(){
        //Me devuelve el dinero total de las camisas que solicito y las retira de stock
        int comprados = 5;
        int dinero_total = comprados * objeto.getPrecio();
        assertEquals(dinero_total, objeto.comprarCamisas(5));
        assertEquals(comprados,objeto.getStock());
    }
    
    @Test
    public void probarPedirCamisas(){
        //si tengo 10 en stock y pido 14, solicito 4 de otra bodega para llenar el stock
        int cantidad_requerida = 14;
        objeto.pedirCamisas(14);
        assertEquals(cantidad_requerida, objeto.getStock());
    }
}
