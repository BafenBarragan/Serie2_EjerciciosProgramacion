import java.util.*;
/**
 * Este programa calcula el area sombreada que queda entre un circulo de radio r y un cuadrado cuya diagonal es el doble del radio. 
 * 
 * Datos de entrada: 
 * - Radio del círculo. (radio)
 * 
 * Datos de salida: 
 * - Area sombreada (area_sombreada)
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AreaSombreada
{
    public static void main (String[] args){
        double diagonal, radio, area_cuadrado, area_circulo, area_sombreada;
        
        Scanner teclado = new Scanner(System.in);
        
        //Solicitar datos
        System.out.println("Cálculo de área sombreada. \nPara insertar valores decimales utilice la coma (',')");
        
        System.out.print("\nIngrese el valor del radio del círculo: ");
        radio = teclado.nextDouble();
        
        //Calcular datos
        diagonal = 2 * radio;
        area_cuadrado = (diagonal * diagonal) / 2;
        area_circulo = Math.PI * radio * radio;
        area_sombreada = area_circulo - area_cuadrado; 
        
        //Mostrar datos
        System.out.println("\n- El área del circulo es: " +area_circulo+ ". \n- El área del cuadrado es: " +area_cuadrado+ ".");
        System.out.println("- Por lo tanto, el área sombreada es: " +area_sombreada+ ".");
    }
}
