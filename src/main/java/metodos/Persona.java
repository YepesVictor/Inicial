/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;
/**
 *
 * @author Diurno
 */
public class Persona {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private Nif nif;

    public Persona() {
    }

    public Persona(String nombre, String apellido1, String apellido2, Nif nif) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
    }
    public Persona(String nombre, String apellido1, String apellido2, int nif) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = new Nif(nif);
    }

    public Persona(String nombre, String apellido1, int edad, int nif) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.edad = edad;
        this.nif = new Nif(nif);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getNif(){
        return this.nif.toString();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setNif(int numero) {
        this.nif.setLetra(numero);
    }

  
    @Override
    public String toString() {
        return nombre + " " + apellido1 + " " + apellido2 + nif ;
    }

}
