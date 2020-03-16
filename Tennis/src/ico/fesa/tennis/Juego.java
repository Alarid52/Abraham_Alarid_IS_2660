/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fesa.tennis;

/**
 *
 * @author Abraham
 */
public class Juego {

    public static void main(String[] args) {
        Player p1 = new Player("Juan", 0, false,false);
        Player p2 = new Player("Pedro", 0, false,false);
        Tennis juego = new Tennis(p1, p2);
        
        juego.marcador();
        p1.marcar_punto();
        juego.marcador();
        p2.marcar_punto();
        juego.marcador();

    }
}
