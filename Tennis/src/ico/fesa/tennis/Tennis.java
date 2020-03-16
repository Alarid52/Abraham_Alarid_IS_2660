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
public class Tennis {

    private Player p1;
    private Player p2;

    public Tennis() {
    }

    public Tennis(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Player getP2() {
        return p2;
    }

    public void setP2(Player p2) {
        this.p2 = p2;
    }

    public Player getP1() {
        return p1;
    }

    public void setP1(Player p1) {
        this.p1 = p1;
    }

    @Override
    public String toString() {
        return "Jugador 1: " + p1.getNombre() + " | Puntos: " + p1.getPuntos() + " | Victoria: " + p1.isVictoria() + "\nJugador 2: " + p2.getNombre() + " | Puntos: " + p2.getPuntos() + " | Victoria: " + p2.isVictoria();
    }

    public int[] marcador() {
        int[] marcador = new int[2];
        marcador[0] = p1.getPuntos();
        marcador[1] = p2.getPuntos();

        if (marcador[0] == 50 && marcador[1] != 40) {
            System.out.println("xxxxxxxxxxxxxxx\n" + "Gana " + p1.getNombre() + "\nxxxxxxxxxxxxxxx");
            p1.setVictoria(true);
        } else if (marcador[0] != 40 && marcador[1] == 50) {
            System.out.println("xxxxxxxxxxxxxxx\n" + "Gana " + p2.getNombre() + "\nxxxxxxxxxxxxxxx");
            p2.setVictoria(true);
        } else if (marcador[0] == 40 && marcador[1] == 40) {
            System.out.println("=============\n" + "Deuce\n" + "=============");
        } else if (marcador[1] == 50 && marcador[0] == 40 && p2.isSet() == false && p1.isSet() == true) {
            System.out.println("=============\n" + "Deuce\n" + "=============");
            p2.setPuntos(40);
            p1.setSet(false);
        } else if (marcador[0] == 50 && marcador[1] == 40 && p1.isSet() == false && p2.isSet() == true) {
            System.out.println("=============\n" + "Deuce\n" + "=============");
            p1.setPuntos(40);
            p2.setSet(false);
        } else if (marcador[0] == 50 && marcador[1] == 40 && p1.isSet() == false) {
            System.out.println("=============\n" + "SetPoint para " + p1.getNombre() + "\n" + "=============");
            p1.setPuntos(40);
            p1.setSet(true);
        } else if (marcador[0] == 40 && marcador[1] == 50 && p2.isSet() == false) {
            System.out.println("=============\n" + "SetPoint para " + p2.getNombre() + "\n" + "=============");
            p2.setPuntos(40);
            p2.setSet(true);
        } else if (marcador[0] == 50 && marcador[1] == 40 && p1.isSet() == true) {
            System.out.println("xxxxxxxxxxxxxxx\n" + "Gana " + p1.getNombre() + "\nxxxxxxxxxxxxxxx");
            p1.setVictoria(true);
        } else if (marcador[0] == 40 && marcador[1] == 50 && p2.isSet() == true) {
            System.out.println("xxxxxxxxxxxxxxx\n" + "Gana " + p2.getNombre() + "\nxxxxxxxxxxxxxxx");
            p2.setVictoria(true);
        }

        System.out.println(p1.getNombre() + " " + p1.getPuntos() + " - " + p2.getPuntos() + " " + p2.getNombre());

        return marcador;
    }
}
