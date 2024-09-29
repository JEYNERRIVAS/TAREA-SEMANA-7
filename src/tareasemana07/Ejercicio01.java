
package tareasemana07;

/*Escribir un programa en java que solicite un numero correspondiente al dia de
la semana. los valores permitidos seran del 1 al 7.y que muestre el dia ingresado
el nombre del dia,y si se ingresa otro valor, debera mostrar mensaje 
"Ingrese un numero correcto de la semana", por lo tanto el programa
debera pedir nuevamente que se un numero del 1 al 7.
por ejemplo:
Ingrese un dia a la semana(1-7) : 10
Ingrese un numero correcto de la semana
Ingrese un dia a la semana(1-7) : 5
El dia ingresado es : VIERNES
Dia ingresado es : 5
 */
import java.util.Scanner;
public class Ejercicio01 {
 public static void main(String[] args) {
     int dia=1;
     String mensaje="";
     boolean esdiainvalido=true;
     Scanner lectura=new Scanner(System.in);
     //proceso
     do { 
         System.out.print("Ingrese un dia de la semana(1-7) : ");
         dia=lectura.nextInt();
         esdiainvalido=(dia<1||dia>7);
         if (dia<1||dia>7) {
             mensaje="Ingrese un dia correcto de la semana";
             System.out.println(mensaje);
         } else {
             switch (dia) {
                 case 1:mensaje="LUNES"; break;
                 case 2:mensaje="MARTES"; break;
                 case 3:mensaje="MIERCOLES"; break;
                 case 4:mensaje="JUEVES"; break;
                 case 5:mensaje="VIERNES"; break;
                 case 6:mensaje="SABADO"; break;
                 case 7:mensaje="DOMINGO"; break;
        
             }
             System.out.println("el numero corressponde al dia : "+mensaje);
         }

         
     } while (esdiainvalido);
     System.out.println("El dia ingresado es : "+dia);
     
     

    }
    
}
