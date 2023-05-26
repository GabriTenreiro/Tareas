/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6edclase;

/**
 *
 * @author gabri
 */
public class Tarea6EDClase {
    public void applyDesc(double precioProducto, int numProductos){     double Total;
    if(numProductos>PRODUCT_LIMIT)
        precioProducto-=5;
            if (numProductos!=0){
            Total = precioProducto*0.8;
            screenOutput(Total);
            salidaPantalla();
        }else {
            Total = precioProducto*0.95;
            screenOutput(Total);
            salidaPantalla();
        }   

    }

    private void salidaPantalla() {
        System.out.println("Enviado");
    }

    private void screenOutput(double Total) {
        System.out.println("El total a pagar es:"+Total);
    }
    private static final int PRODUCT_LIMIT = 3;
    public static void main(String[] args) {

    Tarea6EDClase miCarrito = new Tarea6EDClase();

    miCarrito.applyDesc(100, 5);
}
}