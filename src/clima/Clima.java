/*
 *El sistema meteorológico local requiere un sistema para capturar 
la temperatura promedio de cada día de la semana e imprimir el nombre
del día y un mensaje de la percepción de la temperatura de acuerdo con 
el valor capturado según la siguiente tabla:

Temperatura	Mensaje
Menor o igual que cero	Congelante
1 a 10°C	Muy frío
11 a 20°C	Frío
21 a 24°C	Templado
25 a 29°C	Agradable
30 a 35°C	Caliente
36°C o más	Muy caliente

 */
package clima;

import java.util.Scanner;

/**
 *
 * josselyne ester chilito galindez, codigo: 20201187434
 */
public class Clima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int temperatura;
        String [][] dia  = new String [7][2];
        dia [0][0] = "Lunes";dia [1][0] = "Martes";dia [2][0] = "Miercoles";
        dia [3][0] = "Jueves";dia [4][0] = "Viernes";dia [5][0] = "Sabado";dia [6][0] = "Domingo";
        for (int c=0;c<=6; c++){
           
            
            System.out.println("ingrese la temperatura del dia "+dia[c][0]);
            temperatura=entrada.nextInt();
            
            if (temperatura <= 0) {
               // System.out.println("La temperatura  es congelante");
                dia [c][1] = "La temperatura  es congelante";
            } else if (temperatura >= 1 && temperatura <= 10) {
               // System.out.println("La temperatura es muy frio");
                dia [c][1] = "La temperatura es muy frio";
            } else if (temperatura >= 11 && temperatura <= 20) {
               // System.out.println("La temperatura es frio");
                dia [c][1] = "La temperatura es frio";
            } else if (temperatura >= 21 && temperatura <= 24) {
                //System.out.println("La temperatura es templado");
                dia [c][1] = "La temperatura es templado";
            } else if (temperatura >= 25 && temperatura <= 29) {
                //System.out.println("La temperatura es agradable");
                dia [c][1] = "La temperatura es agradable";
            } else if (temperatura >= 30 && temperatura <= 35) {
                //System.out.println("La temperatura es caliente");
                dia [c][1] = "La temperatura es caliente";
            } else if (temperatura >= 36) {
               // System.out.println("La temperatura es muy caliente");
                dia [c][1] = "La temperatura es muy caliente";
            }
            
        }
        for (int j=0;j<=6; j++){
             System.out.println("El dia: "+dia[j][0]); 
             System.out.println("Su temperatura es: "+dia[j][1]);
        }
    }
    
}
        