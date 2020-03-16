/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fesa.test;

import ico.fesa.tennis.Player;
import ico.fesa.tennis.Tennis;
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
public class TestTennis {
    
    public TestTennis() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testUno(){
        Player p1 = new Player("Juan", 0, false,false);
        Player p2 = new Player("Pedro", 0, false,false);
        Tennis juego = new Tennis(p1, p2);
        //Prueba uno, marcador empatado a 15
        int[] esperado = new int[2];
        esperado[0] = 15;
        esperado[1] = 15;
        //anotan ambos
        p1.marcar_punto();
        juego.marcador();
        p2.marcar_punto();
        juego.marcador();
        assertArrayEquals(esperado, juego.marcador());   
    }
    
    @Test
    public void testDos(){
        Player p1 = new Player("Juan", 0, false,false);
        Player p2 = new Player("Pedro", 0, false,false);
        Tennis juego = new Tennis(p1, p2);
        //Prueba dos, marcador 40 - 30
        int[] esperado = new int[2];
        esperado[0] = 40;
        esperado[1] = 30;
        //anota Juan 40
        p1.marcar_punto();
        juego.marcador();
        p1.marcar_punto();
        juego.marcador();
        p1.marcar_punto();
        juego.marcador();
        //anota Pedro 30
        p2.marcar_punto();
        juego.marcador();
        p2.marcar_punto();
        juego.marcador();
        assertArrayEquals(esperado, juego.marcador());   
    }
    
    @Test
    public void testTres(){
        Player p1 = new Player("Juan", 0, false,false);
        Player p2 = new Player("Pedro", 0, false,false);
        Tennis juego = new Tennis(p1, p2);
        //Prueba tres, empate a 40 con set para Juan pero Pedro empareja y gana
        int[] esperado = new int[2];
        esperado[0] = 40;
        esperado[1] = 50;
        //anota Juan 40
        p1.marcar_punto();
        juego.marcador();
        p1.marcar_punto();
        juego.marcador();
        //anota Pedro 40
        p2.marcar_punto();
        juego.marcador();
        p2.marcar_punto();
        juego.marcador();
        //set para Juan
        p1.marcar_punto();
        juego.marcador();
        //punto para Pedro, regresan a 40
        p2.marcar_punto();
        juego.marcador();
        //set para Pedro
        p2.marcar_punto();
        juego.marcador();
        //gana Pedro
        p2.marcar_punto();
        juego.marcador();
        assertArrayEquals(esperado, juego.marcador());   
    }
    
    @Test
    public void testCuatro(){
        Player p1 = new Player("Juan", 0, false,false);
        Player p2 = new Player("Pedro", 0, false,false);
        Tennis juego = new Tennis(p1, p2);
        //Prueba cuatro, empate a 40 intercalado
        int[] esperado = new int[2];
        esperado[0] = 40;
        esperado[1] = 40;
        //anotan ambos
        p1.marcar_punto();
        juego.marcador();
        p2.marcar_punto();
        juego.marcador();
        //anotan ambos
        p1.marcar_punto();
        juego.marcador();
        p2.marcar_punto();
        juego.marcador();
        //anotan ambos
        p1.marcar_punto();
        juego.marcador();
        p2.marcar_punto();
        juego.marcador();
        assertArrayEquals(esperado, juego.marcador());   
    }
    
    @Test
    public void testCinco(){
        Player p1 = new Player("Juan", 0, false,false);
        Player p2 = new Player("Pedro", 0, false,false);
        Tennis juego = new Tennis(p1, p2);
        //Prueba cinco, empate a 40 intercalado con set y victoria para Juan
        int[] esperado = new int[2];
        esperado[0] = 50;
        esperado[1] = 40;
        //anotan ambos
        p1.marcar_punto();
        juego.marcador();
        p2.marcar_punto();
        juego.marcador();
        //anotan ambos
        p1.marcar_punto();
        juego.marcador();
        p2.marcar_punto();
        juego.marcador();
        //anotan ambos
        p1.marcar_punto();
        juego.marcador();
        p2.marcar_punto();
        juego.marcador();
        //set para Juan
        p1.marcar_punto();
        juego.marcador();
        //gana Juan
        p1.marcar_punto();
        juego.marcador();
        
        assertArrayEquals(esperado, juego.marcador());   
    }
    
}
