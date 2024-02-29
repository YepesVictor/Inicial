package metodos;

import java.util.Scanner;

/**
 *
 * @author Diurno
 */
public class Nif {
    public static Scanner s=new Scanner(System.in);
    private int dni;
    private char letra;

    protected Nif() {
        dni = 0;
        letra = ' ';
    }

    protected Nif(int dni) {
        this.dni = dni;
        this.letra = aux(dni);
    }

    protected int getDni() {
        return dni;
    }

    protected void setLetra(int dni) {
        this.dni = dni;
        this.letra = aux(dni);
    }
   
    private char aux(int dni) {
        char letra = ' ';
        if (dni == 0) {
            letra = ' ';
        } else {
            switch (dni % 23) {
                case 0:
                    letra = 'T';
                    break;
                case 1:
                    letra = 'R';
                    break;
                case 2:
                    letra = 'W';
                    break;
                case 3:
                    letra = 'A';
                    break;
                case 4:
                    letra = 'G';
                    break;
                case 5:
                    letra = 'M';
                    break;
                case 6:
                    letra = 'Y';
                    break;
                case 7:
                    letra = 'F';
                    break;
                case 8:
                    letra = 'P';
                    break;
                case 9:
                    letra = 'D';
                    break;
                case 10:
                    letra = 'X';
                    break;
                case 11:
                    letra = 'B';
                    break;
                case 12:
                    letra = 'N';
                    break;
                case 13:
                    letra = 'J';
                    break;
                case 14:
                    letra = 'Z';
                    break;
                case 15:
                    letra = 'S';
                    break;
                case 16:
                    letra = 'Q';
                    break;
                case 17:
                    letra = 'V';
                    break;
                case 18:
                    letra = 'H';
                    break;
                case 19:
                    letra = 'L';
                    break;
                case 20:
                    letra = 'C';
                    break;
                case 21:
                    letra = 'K';
                    break;
                case 22:
                    letra = 'E';
                    break;
                default:
                    letra = ' ';
                    break;
            }
        }
        return letra;
    }

    @Override
    public String toString() {
        return dni + "-" + letra;
    }
    
     public static int introduceDNI() {
        System.out.println("Introduzca el numero de DNI");
        int dn = s.nextInt();
        if (comprobarDNI(dn) == false) {
            System.out.println("El dni debe tener 8 numeros");
            return 0;
        } else {
            return dn;
        }
    }

    public static boolean comprobarDNI(int dn) {
        if (Integer.toString(dn).length() != 8) {
            return false;
        }
        return true;
    } 
}
