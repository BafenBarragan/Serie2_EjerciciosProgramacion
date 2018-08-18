import java.util.*;
/**
 *Este programa convierte diferentes cantidades en diferentes unidades de medida a pulgadas.
 *
 *Variables de entrada: 
 *- Unidad de medida incial. (u_medida)
 *- Cantidad a convertir. (numero)
 *
 *Variables de salidad: 
 *-Valor convertido a pulgadas. (conversion)
 * 
 * @author Bafen Ricardo Barragán Sánchez
 * @version (a version number or a date)
 */
public class Pulgadas
{
    public static void main (String[] args){
        double numero, conversion = 0;
        char u_medida = 0; 
        
        Scanner teclado = new Scanner(System.in);
        
        //Solicitar datos
        
        System.out.println("Conversión a pulgadas. \nPara digitar números decimales utilice la coma (',').");
        
        System.out.println("\nEscoja la unidad de medida que desea convertir así: \nP = Pies, C = Centímetros, L = Leguas o Y = Yardas. ");
        u_medida = teclado.next().charAt(0);
        
        //Calcular datos
        
        switch (u_medida){
            case 'P': case 'p':
            System.out.print("\nDigite la cantidad a convertir de pies a pulgadas: ");
            numero = teclado.nextDouble();
            
            conversion = numero * 0.0833; 
            
            System.out.println(numero + " pies, equivale a " +conversion+ " pulgadas."); 
            break; 
            
            case 'C': case'c':
            System.out.print("\nDigite la cantidad a convertir de centímetros a pulgadas: ");
            numero = teclado.nextDouble();
            
            conversion = numero * 2.54; 
            
            System.out.println(numero + " cms, equivale a " +conversion+ " pulgadas."); 
            break;
            
            case 'L': case'l':
            System.out.print("\nDigite la cantidad a convertir de leguas a pulgadas: ");
            numero = teclado.nextDouble();
            conversion = numero * 190080.02; 
            
            System.out.println(numero + " leguas, equivale a " +conversion+ " pulgadas."); 
            break; 
            
            case 'Y': case'y':
            System.out.print("\nDigite la cantidad a convertir de yardas a pulgadas: ");
            numero = teclado.nextDouble();
            
            conversion = numero * 36; 
            
            System.out.println(numero + " yardas, equivale a " +conversion+ " pulgadas."); 
            
            break; 
            
            default: 
            System.out.println("\nNo es posible identificar la unidad de medida " + u_medida); 
            
            break;
        }             
    }
}
