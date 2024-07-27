package com.example.filtrojava;

import java.util.Scanner;

import person.infrastructure.in.MenuPersona;
import skill.infrastructure.in.MenuHabilidades;

public class Main {

    

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        MenuPersona menuPersona = new MenuPersona();
        MenuHabilidades menuHabilidades = new MenuHabilidades();

      
        
        while(true){
            System.out.println("Bienvenido al filtro de Java");

            System.out.println("1. Menu Persona");
            System.out.println("2. Menu Habilidades");

            int op = 0;
            try {
                System.out.print("Digite una opcion: ");
                op = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("");
            }

            switch (op) {
                case 1:
                    menuPersona.start(scanner);
                    break;
                case 2:
                    menuHabilidades.start(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo....");
                    scanner.close();
                    return;
            
                default:
                    System.out.println("Error Opcion no valida");
                    break;
            }
        }
        


       


    }
}