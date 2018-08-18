import java.util.*;
/**
 * Este programa calcula el impuesto de ciertos vehículos, basado en su precio bruto. Luego, con esos dos datos, calcula el precio neto
 * del vehículo. 
 *  
 * @author Bafen Ricardo Barragán Sánchez 
 * 
 */
public class ImpuestoVehiculo
{
   public static void main (String[] args){
       int p_bruto, p_neto, impuesto;
       char t_vehiculo = 0, control = 'Y';
       
       Scanner teclado = new Scanner(System.in);
           
       //Calcular datos
       while (control == 'Y' || control == 'y' || control == 'S' || control == 's'){
        //Solicitar datos
        System.out.println("Precio neto e impuesto de un vehículo.");
       
        System.out.print("\nEscoja su tipo de vehículo: Si es automóvil, digite A. Si es camioneta, C.");
        t_vehiculo = teclado.next().charAt(0); 
             
           switch (t_vehiculo){
           case 'C': case 'c':
           System.out.print("\nDigite el precio de su camioneta: $ ");
           p_bruto = teclado.nextInt();
           if (p_bruto >= 80){
               impuesto = p_bruto/2;
               p_neto = p_bruto + impuesto;
            } 
            else {
                impuesto = 0; 
                p_neto = p_bruto;
            } 
            System.out.println("\n-El impuesto para su camioneta es de: $ " + impuesto+ ".");
            System.out.println("-El valor neto de su camioneta es de: $ " +p_neto+ ".");
           break;
            
           case 'A': case'a':
           System.out.print("\nDigite el precio de su automóvil: $ ");
           p_bruto = teclado.nextInt();
           if (p_bruto < 20){
               impuesto = 5;
               p_neto = p_bruto + impuesto;               
            }
            else if (p_bruto >= 20 && p_bruto <= 40){
                impuesto = p_bruto / 5; 
                p_neto = p_bruto + impuesto;
            }
            else {
                impuesto = 9; 
                p_neto = p_bruto + impuesto;
            }
            System.out.println("\n-El impuesto para su automóvil es de: $ " + impuesto+ ".");
            System.out.println("-El valor neto de su automóvil es de: $ " +p_neto+ ".");
            break;   
            
            default: 
            System.out.println("\n" +t_vehiculo + " no es un tipo de vehículo válido!");
            break;
        }
        //Preguntar una nueva consulta
        System.out.print("\n¿Desea consultar de nuevo? Si(Y)/No(N)  ");
        control = teclado.next().charAt(0);
        
        if (control == 'Y' || control == 'y' || control == 'S' || control == 's'){
            System.out.print("\n\n\n");
        }
        else{
            System.out.print("\nGracias.");
        }
       }       
   }
}
//Como hacer que se borre el contenido de la consola? Cómo ordenarle al programa saltar a una linea de código? 