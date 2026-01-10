package SpotifyChafa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("He aquí el menú");
        List quincy = new List();
        System.out.println("Ingresa una opción");

        int option;
        

        do {


            System.out.println("Opciones:");
            System.out.println("1. Previsualizar lista");
            System.out.println("2. Agregar canción al inicio");
            System.out.println("3. Agregar canció al final");
            System.out.println("4. Reproducir canción");
            System.out.println("5. Reproducir canción anterior");
            System.out.println("6. Reproducir canción posterior");
            System.out.println("9. Ver Lista");
            System.out.println("0. Exit");

            System.out.println("Ingresa una opción : ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    quincy.settleList();
                    quincy.viewLinkedList();
                    break;
            
                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    quincy.playSong();

                    break;

                case 5:
                    quincy.playPreviousSong();
                    
                    break;

                case 6:
                    quincy.playSong();
                    

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9: 
                    quincy.viewLinkedList();

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



