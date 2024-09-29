
package tareasemana07;

/*Crear un programa en java, que permita ingresar el nombre de la empresa, Giro 
de negocio,ventas anuales y preguntar al sistema si desea continuar o finalizar
con el proceso de registro de datos.visualizar la cantidad de empresas y 
visualizar la mejor empresa en facturacion con sus ventas promedio en cada mes.
Ejemplo:
nro Empresa           Giro          ventas anuales ( miles)     opcion
1   Bcp              Finanzas          2000000                     si
2   Inkfarma         Serv.Medicos      500000                     si
3   Bbva     4       Finanzas          1100000                     si
4   Transp.Linea      Transporte         350000                     si

Resultados:

Cantidad de empresas= 4
Mejor empresa : Bcp
ventas promedio mensual = 166,666.00
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio03 {
    public static void main(String[]args){
        int va,ce=0;
        double vpm=0,vpmejorempresa=0;
        String empresa="",mejoremp="",giro="",opcion="";
        Scanner lectura=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("#,###.00");
  
        do {            
             System.out.print("Ingrese nombre de la empresa : ");
             empresa=lectura.next();
             System.out.print("Ingrese giro de la empresa : ");
             giro=lectura.next();
             System.out.print("Ingrese ventas anuales : ");
             va=lectura.nextInt();
             vpm=va/12;
             
             System.out.println("Su venta promedio mensual es de : "+formato.format(vpm));

             ce++;
             if (vpm>vpmejorempresa) {
                 vpmejorempresa=vpm;
                 mejoremp=empresa;
                
            }
             System.out.print("Desea conitnuar registrando datos ( si o no) : ");
             opcion=lectura.next();

             
        } while (opcion.equals("si"));
         System.out.println("la canttidad de empresas registradas es : "+ce);
         System.out.println("La mejor empresa es  : "+mejoremp);
         System.out.println(" Con ventas promedio mensual de : "+vpmejorempresa);
         
        
    }
    
}
