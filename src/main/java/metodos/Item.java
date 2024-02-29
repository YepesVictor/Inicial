/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author Diurno
 */
public class Item {
    private String titulo;
    private short numPag;
    private String editorial;
    private String fecha;
    private boolean prestado;
    private String tematica;

    public Item(String titulo, short numPag, String editorial, String fecha, boolean prestado, String tematica) {
        this.titulo = titulo;
        this.numPag = numPag;
        this.editorial = editorial;
        this.fecha = fecha;
        this.prestado = prestado;
        this.tematica = tematica;
    }
    
    
}
