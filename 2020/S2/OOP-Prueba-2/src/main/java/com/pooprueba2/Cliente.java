package com.pooprueba2;

import com.pooprueba2.helper.CanastaVaciaException;

/**
 * @author Jorge M.
 */

public class Cliente {
    private String nombre;
    private String rut;
    private Canasta canastaCliente;

    public Cliente(String nombre, String rut, Canasta canastaCliente) {
        this.nombre = nombre;
        this.rut = rut;
        this.canastaCliente = canastaCliente;
    }

    public String getRut() {
        return rut;
    }
    
    // este método deberia limpiar la canasta para un nuevo cliente.
    // llamar a un método que pregunte si se desea realizar otra compra
    // y pedir nuevo nombre y rut para la siguiente compra
    // TODO evaluar donde sería mejor práctica la exception
    // en cliente o canasta
    // o ambos?o donde sería mejor hacer catch,
    // talvez hacer throw en canasta y solo hacer catch acá
    // realmente si hago throw y catch en Canasta jamás debiera propagarse acá,
    // diría
    // TODO
    public boolean realizarCompra() {
        Boleta boleta = new Boleta(this);
        
        try {
            
        } catch (Exception e) {
            System.err.println(e);
        }
        
        // si no existen elementos en la canasta, no se pueda comprar
        return false;
    }

    public Canasta getCanastaCliente() {
        return canastaCliente;
    }

    public void setCanastaCliente(Canasta canastaCliente) {
        this.canastaCliente = canastaCliente;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nRUT: " + rut;
    }
    
    
    
    
     
    
}
