import java.util.*;
/**
 * Este programa calcula el número de viajes que se deben realizar en un bus para transportar ciertas personas, el costo total de ese 
 * viaje y la cuota que debe pagar el conductor. 
 * 
 * @author Bafen Ricardo Barragán Sánchez
 * 
 */
public class ViajeEnBus
{
    public static void main (String[] args){
        
        int total_pasajeros, pasajeros_bus, costo_viaje, pago_dueno, viajes;
        
        Scanner teclado = new Scanner(System.in);
        
        //Solicitar datos
        System.out.println("Cotización de transporte Aeropuerto-Hotel");
        
        System.out.print("\nSeleccione el tamaño del bus (# de puestos): ");
        pasajeros_bus = teclado.nextInt();
        
        System.out.print("\nDigite el número de personas a transportar: ");
        total_pasajeros = teclado.nextInt();
        
        //Calcular datos de salida
        viajes = total_pasajeros / pasajeros_bus;
        costo_viaje = total_pasajeros * 10000;
        pago_dueno = viajes * 2000; 
        
        //Mostrar datos
        System.out.println("\n- Es necesario realizar " +viajes+ " viajes."); 
        System.out.println("- El costo total a pagar es de $" +costo_viaje + "."); 
        System.out.println("- El conductor debe pagar $" +pago_dueno+ " al propietario del bus."); 
       
       
       
    
    }
}
