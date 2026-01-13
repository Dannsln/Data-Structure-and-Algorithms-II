package Minimarket;

import java.util.Scanner;

import Shikai.main;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
        System.out.println("He aquí el menú");
        List togame = new List();
        System.out.println("Ingresa una opción");

        int option;
        

        do {


            System.out.println("Opciones:");
            System.out.println("1. Inicializar Lista");
            System.out.println("2. Agregar por inicio");
            System.out.println("3. Agregar por final");
            System.out.println("4. Eliminar Nodo");
            System.out.println("5. Ver Lista predefinida");
            System.out.println("6. Atender turno");
            System.out.println("9. Ver Lista");
            System.out.println("0. Exit");

            System.out.println("Ingresa una opció : ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    togame.settleList();
                    togame.viewLinkedList();
                    
                    break;
            
                case 2:

                    break;
                    

                case 3:
                    togame.insertAtTheEnd();
                    togame.viewLinkedList();

                    break;

                case 4:

                    break;

                case 5:
                    togame.settleList();
                    togame.viewLinkedList();
                    break;

                case 6:
                    togame.attend();

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9: 
                    togame.viewLinkedList();

                    break;

                case 0:
                    System.out.println("Ejecución finalizada.");
                    break;
                default:
                    System.out.println("Ingresa alguna opción válida");
                    break;
            }
            
        } while (option!=0);
    }

}
