package Shikai;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        

        Scanner bankai = new Scanner(System.in);
        System.out.println("He aquí el menú");
        List benihime = new List();


        int option;

        do {
            System.out.println("Opciones:");
            System.out.println("1. Inicializar Lista");
            System.out.println("2. Agregar por inicio");
            System.out.println("3. Agregar por final");
            System.out.println("4. Eliminar Nodo");
            System.out.println("5. Ver Lista predefinida");
            System.out.println("9. Ver Lista");
            System.out.println("0. Exit");

            System.out.println("Ingresa opción");
            option = bankai.nextInt();

            switch (option) {
                case 1:
                    benihime.settleList();;
                    
                    break;
                case 2:
                    benihime.insertAtTheBegin(); 
                    break;
                case 3: benihime.insertAtTheEnd(); 
                break;
                case 4:
                        benihime.deleteNode();
                break;

                case 5: benihime.preSet(); benihime.viewLinkedList(); 
                break;
        
                
                case 9:
                    benihime.viewLinkedList();
                    break;
                case 0:
                    System.out.println("Salida exitosa.");
                    break;
                default:
                    System.out.println("Ingresa una opción válida");
                    break;
            }
            
        } while (option !=0);
    }
}
