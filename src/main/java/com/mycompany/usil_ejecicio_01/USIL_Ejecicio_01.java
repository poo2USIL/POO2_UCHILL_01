
package com.mycompany.usil_ejecicio_01;

import java.util.Scanner;

public class USIL_Ejecicio_01 {

    public static void main(String[] args) {
        GestionEmpleados gestionEmpleados = new GestionEmpleados();        
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        
        while(!salir){
            System.out.println("Menu Caseta de Peaje");
            System.out.println("=====================");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Generar reporte");
            System.out.println("3. Salir");
            System.out.println("Selecciona una opción");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion){
                case 1 -> {
                    System.out.println("Ingrese el ID del empleado");
                    int id = scanner.nextInt();
                    System.out.println("Ingrese el nombre del empleado");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el cargo del empleado");
                    String cargo = scanner.nextLine();
                    System.out.println("Ingrese el salario base del empleado");
                    double salarioBase = scanner.nextDouble();
                    System.out.println("Ingrese las horas extras del empleado");
                    int horasExtras = scanner.nextInt();
                    
                    Empleado empleado = new Empleado(id, nombre, cargo, salarioBase, horasExtras);
                    gestionEmpleados.AgregarEmpleados(empleado);
                    System.out.println("empleado registrado");
                }
                
                case 2 -> gestionEmpleados.generarReporteEmpleados();
                case 3 -> salir = true;
                default -> System.out.println("Por favor, debes ingresar un número de opción correcto");
            }                       
        }
        
        System.out.println("Saliendo del programa.....!Nos vemos");
        scanner.close();
    }
}
