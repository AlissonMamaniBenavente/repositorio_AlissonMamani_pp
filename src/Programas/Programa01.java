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
        System.out.println("\n===== RESUMEN DE PAGO =====");
        System.out.println("Empleado: " + empleado);
        System.out.printf("Horas trabajadas: %.2f%n", ht);
        System.out.printf("Tarifa por hora: S/ %.2f%n", th);
        System.out.printf("Sueldo bruto: S/ %.2f%n", sb);
        System.out.printf("Descuento: S/ %.2f%n", d);
        System.out.printf("Sueldo Neto a recibir: S/ %.2f%n", sn);
        System.out.println("===========================");
        
        lectura.close();
    }
    
}
