/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clase.biblioteca;

import com.github.javafaker.Faker;
import items.Item;
import items.Libro;
import items.Revista;
import items.Tematica;
import items.Usuario;
import java.util.Locale;
import java.util.Random;

/**
 *
 * @author ProfDiurno
 */
public class Run {
 public static Faker f = new Faker(new Locale("es"));
       public static Random r = new Random();
    public static bibliotecas.Biblioteca b = new bibliotecas.Biblioteca(r.nextInt(1, 5), 
                r.nextInt(20, 200), 
                f.artist().name(), f.address().fullAddress());
    public static void main(String[] args) {
        
        
     
        
        for (int i = 1; i < 101; i++) {
            b.altaItem(new Libro(i + "", 
                    r.nextInt(50, 100), 
                    false, f.book().title(), 
                    f.book().publisher(), Tematica.ROMANCE, 
                    f.book().author(), f.code().isbn13() + ""));
             b.altaItem(new Revista(f.date().birthday().getYear(), 
                     r.nextInt(1, 12), "Sin adjunto", ++i + "", 
                     r.nextInt(50, 100),
                     false, f.book().title(),
                     f.book().publisher(), Tematica.ROMANCE));
        }
        Libro l=new Libro("1515", 159, false, "hola", "Ana", Tematica.ROMANCE, "Ivam", f.code().isbn13());
        Usuario u =new Usuario("1234", "16666666K", "Totoro", "60000000");
        
        tomar("1",u);
        tomar("1000",u);
        tomar("3",u);
        tomar("4",u);
        tomar("5",u);
        tomar("6",u);
        tomar("7",u);
        devolver("3", u);
        devolver("7", u);
        System.out.println(u);
        System.out.println(u.isSancionado());
        
        
//        System.out.println(b.listadoFondo());
//        System.out.println(b.numeroItems());
    }
    public static void tomar(String i,Usuario u){
        switch (u.tomarPrestado(b.getItem(i))) {
            case -4 -> System.out.println("Item no existe");
            case -3 -> System.out.println("Usuario sancionado");
            case -2 -> System.out.println("El libro ya esta prestado");
            case -1 -> System.out.println("No puede tomar mas libros prestados");
            case 0 -> System.out.println("Prestamo exitoso ");
        }
    }
    
    public static void devolver(String i,Usuario u){
        if (u.devolverItem(b.getItem(i))) {
            System.out.println("Devolucion exitosa");
        }else{
             System.out.println("Error en la devolucion");  
    }
}
}
