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
public class Player {

    private String nombre;
    private int puntos;
    private boolean victoria;
    private boolean set;

    public Player() {
    }

    public Player(String nombre, int puntos, boolean victoria, boolean set) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.victoria = victoria;
        this.set = set;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public boolean isVictoria() {
        return victoria;
    }

    public void setVictoria(boolean victoria) {
        this.victoria = victoria;
    }

    public boolean isSet() {
        return set;
    }

    public void setSet(boolean set) {
        this.set = set;
    }

    public int marcar_punto() {
        if (this.getPuntos() < 30) {
            this.setPuntos(this.getPuntos() + 15);
        } else if (this.getPuntos() >= 30 && this.getPuntos() <= 50) {
            this.setPuntos(this.getPuntos() + 10);
        }
        System.out.println("\n---------------------------\n" + "Punto para " + this.getNombre() + "\n---------------------------\n");
        return this.getPuntos();
    }
}
