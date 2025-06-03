package Programas;

import java.util.Scanner;

public class Programa01 {

    
    public static void main(String[] args) {
        
        // Declaracion de variables
        String empleado;
        double ht, th, sb, d, sn;
        
        // creando el objeto lectura
        Scanner lectura= new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingresar el nombre del empleado: ");
        empleado=lectura.next();
        
        System.out.print("Ingresar las horas trabajadas: ");
        ht=lectura.nextDouble();
        
        System.out.print("Ingresar la tarifa por hora: ");
        th=lectura.nextDouble();
        
        // Proceso de datos
        sb=ht*th;
        d=sb*0.13;
        sn=sb-d;
        
        // Salida de datos
        System.out.println("El Sueldo bruto es: " + sb);
        System.out.println("El Descuento es: " + d);
        System.out.println("El Sueldo Neto es: " + sn);
    }
    
}
