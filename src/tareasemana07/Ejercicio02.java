
package tareasemana07;

/*Crear un programa en java,mediante el cual permita ingresar el nombre de una 
empresa,el nombre de empleados,sueldo basico y sueldo variable de los ultimos 3 meses
y, preguntar al programa si desesa continuar registrando datos.
visualizar el nombre del empleado con mayor sueldo promedio en los ultimos 3 meses.

por ejemplo:
Nombre de la empresa : Banco de credito del Peru
nº  empleado         sueldo base     svariable1   svariable2  svariable3  sueldo final  opcion(continuar)
1   Jeyner Rivas      1200            500         550             650         1766.67    si
2   Shirley Ramirez   1800            350         500             250         2166.67    si
3   Gabriel Rivas     1500             0          350             360         1736.67    si
4   Samuel  Rivas     1750            650         0               120         2006.67    no

resultados:
Empleado=Shirley Ramirez
Sueldo promedio de  los ultimos 3 meses =2166.67
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio02 {
    public static void main(String[]args){
        double sb,sbx3,sv1,sv2,sv3,svx3,sf=0,sprom=0.0,emsp=0;
        String Empresa="",Empleado="",Empleadomayorsueldo="",opcion;
        Scanner lectura=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("##.##");
        System.out.print("Ingrese nombre de la empresa : ");
        Empresa=lectura.nextLine();
        //proceso
        do {            
            System.out.print("Ingrese nombre de empleado : ");
            Empleado=lectura.nextLine();// para nombres con espacios
            System.out.print("Ingrese sueldo base : ");
            sb=lectura.nextDouble();
            System.out.print("Ingrese sueldo Variable de mes 1 : ");
            sv1=lectura.nextDouble();
            System.out.print("Ingrese sueldo Variable de mes 2 : ");
            sv2=lectura.nextDouble();
            System.out.print("Ingrese sueldo Variable de mes 3 : ");
            sv3=lectura.nextDouble();
            
            sbx3=sb*3;//hallando el sueldo base de los 3 meses
            svx3=sv1+sv2+sv3; //hallando el sueldo variable de los tres meses
            sf=sbx3+svx3; // hallando el sueldo final(basico+variable=
            sprom=sf/3;
            System.out.println("el sueldo promedio del empleado es : "+formato.format(sprom));
            if (sprom>emsp) {
                emsp=sprom;
                Empleadomayorsueldo=Empleado;
          
            } 
            System.out.print("Desea seguir registrando Datos (si o no) ? : ");
            opcion=lectura.next();
            lectura.nextLine();//limpiando el buffer del scaner
            

        } while (opcion.equals("si"));
        System.out.println("El mejor empleado es : "+Empleadomayorsueldo);
        System.out.println("Quien tiene un mejor sueldo promedio de : "+formato.format(emsp));
     
    }
    
}
