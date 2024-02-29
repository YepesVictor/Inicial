/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package items;

/**
 *
 * @author Diurno
 */
public class Usuario {
    
    private final String num;
    private String dni,nombre,telefono;
    private final Item[] libroPoder;
    private boolean sancionado;

    public Usuario(String num, String dni, String nombre, String telefono) {
        this.num = num;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.libroPoder = new Item[5];
        this.sancionado = false;
    }

    public int tomarPrestado(Item libro) {
        if (libro==null) {
            return -4;
        }
        if (sancionado==true) {
            return -3;
        }else if (libro.isEstaPrestado()) {
            return -2;
        }
        for (int i = 0; i < libroPoder.length; i++) {
            if (libroPoder[i]==null) {
                libroPoder[i]=libro;
                return 0;
            }
        }
        return -1;
    }
    
    public boolean devolverItem(Item libro){
        for (int i = 0; i < libroPoder.length; i++) {
            if (libroPoder[i].equals(libro)) {
                return true;
            }
            
        }
        return false;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSancionado(boolean sancionado) {
        this.sancionado = sancionado;
    }

    public String getNum() {
        return num;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public Item[] getLibroPoder() {
        return libroPoder;
    }

    public boolean isSancionado() {
        return sancionado;
    }
    
    public String listadoPrestado(){
        String aux="";
        for (int i = 0; i < libroPoder.length; i++) {
            aux+= libroPoder[i]+"\n";
            
        }
        return aux;
    }
    @Override
    public String toString() {
     
        return "Usuario{" + "num=" + num + ", dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", sancionado=" + sancionado + ", libroPoder=\n" + listadoPrestado();
    }

   
    
    
}
