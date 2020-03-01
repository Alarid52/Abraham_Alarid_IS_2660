/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.camisa;

/**
 *
 * @author Abraham
 */
public class Camisas {
    private int id;
    private int stock;
    private int precio;
    private String tipo;

    public Camisas() {
    }

    public Camisas(int id, int stock, int precio, String tipo) {
        this.id = id;
        this.stock = stock;
        this.precio = precio;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int comprarCamisas(int cantidad) {
        if (cantidad > this.getStock()) {
            System.out.println("No hay suficientes camisas en bodega");
            return 0;
        } else {
            int nuevo = this.getStock() - cantidad;
            this.setStock(nuevo);
            int dinero = this.getPrecio() * cantidad;
            return dinero;
        }
        
    }
    
    public void pedirCamisas(int cantidad){
        if(cantidad > this.getStock()){
            this.setStock(cantidad);
        }
        else{
            System.out.println("Ya hay camisas suficientes");
        }      
    }

}
