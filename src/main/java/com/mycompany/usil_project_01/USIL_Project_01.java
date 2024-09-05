
package com.mycompany.usil_project_01;

import java.util.Random;
import java.util.Scanner;

public class USIL_Project_01 {

    public static void main(String[] args) {
        Caseta caseta = new Caseta();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        
        while(!salir){
            System.out.println("Menu Caseta de Peaje");
            System.out.println("====================");
            System.out.println("1. Simular entrada de vehiculo");
            System.out.println("2. Generar reporte");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion");
            int opcion = scanner.nextInt();
            
            switch(opcion){
                case 1 -> {
                    int TipoIndex = random.nextInt(TipoVehiculo.values().length);
                    TipoVehiculo TipoAleatorio = TipoVehiculo.values()[TipoIndex];
                    Vehiculo vehiculo = new Vehiculo(TipoAleatorio);
                    caseta.AgregarVehiculo(vehiculo);
                    System.out.println("Vehiculo de tipo: "+TipoAleatorio +"ingresado. Tarifa S/."+ vehiculo.getTarifa());
                }
                case 2 -> caseta.GenerarReporte();
                case 3 -> salir = true;
                default -> System.out.println("Ingrese un numero de los dados");
            }
        }
        System.out.println("Saliendo del progama... Nos vemos!!!");
    }
}
