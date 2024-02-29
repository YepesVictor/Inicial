/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.Map;

/**
 *
 * @author Diurno
 */
public class Biblioteca {
    private int seccion;
    private String nombre;
    private String direccion;
    private int numItem;
    private int numPlaza;
    private Map fondo;

    public Biblioteca(int seccion, String nombre, String direccion, int numItem, int numPlaza, Map fondo) {
        this.seccion = seccion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numItem = numItem;
        this.numPlaza = numPlaza;
        this.fondo = fondo;
    }
    
}
