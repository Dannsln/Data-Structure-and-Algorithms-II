package Shikai;

import java.lang.reflect.Array;
import java.util.Scanner;

public class List {
    /*
    *Lista circular doble
     */
    Node first;
    Node last;  

     public List(){
        
    }


    public Patient[] preSet(){

        Patient[] data = new Patient[3];

        data[0] = new Patient("Ichigo", "01", 20, "Multileches");
        data[1] = new Patient("Orihime", "02", 20, "Perfecta");
        data[2] = new Patient("Uryu", "03", 20, "Sucesor");

        for(Patient p : data){

            Node arise = new Node(p);
            if(first==null){
                first = arise; last = arise;
                arise.linkLeft = arise; arise.linkRigth = arise;
            } else {
                arise.linkRigth = first;
                arise.linkLeft = last;
                last.linkRigth = arise;
                first.linkLeft = arise;
                last = arise;
            }


        }



        return data;
    }


    Scanner sc = new Scanner(System.in);

    public Patient readData(){
        System.out.println("Ingresa nombre del paciente: ");
        String name = sc.nextLine();
        System.out.println("Ingresa ID: ");
        String Id = sc.nextLine();
        System.out.println("Ingresa edad: ");
        int age = sc.nextInt(); 
        sc.nextLine();
        System.out.println("Ingresa caso médico ");
        String medicalCase = sc.nextLine();


        Patient x = new Patient(name, Id, age, medicalCase);
        return x;

    }



    public boolean isEmpty(){

        if (first == null) {
            System.out.println("La lista está vacía"); return true;
        } return false;
    }

    public void settleList(){
        Node arise = new Node(readData());
        first = arise; last = arise;
        arise.linkRigth = arise; arise.linkLeft = arise;
    }

    public void insertAtTheBegin(){
        Node arise = new Node(readData());
        if (isEmpty()) {
            first = arise; last = arise; arise.linkLeft = arise; arise.linkRigth = arise;
        } else{
            //redirecciono enlaces primero
            arise.linkRigth = first; arise.linkLeft = last; first.linkLeft = arise;
            last.linkRigth = arise; first = arise;
           
        }

    }
    public void insertAtTheEnd(){
        Node arise = new Node(readData());
        if (isEmpty()) {
            last = arise; first = arise; arise.linkLeft = arise; arise.linkRigth = arise;
        } else{ //Redireccionar enlaces 
            arise.linkRigth = first; first.linkLeft = arise;
            last.linkRigth = arise; arise.linkLeft = last;
             last = arise;

        }

    }
    public void deleteNode(){
        System.out.println("Selecciona una opción: ");
        System.out.println("1. Borrar por posición");
        System.out.println("2. Borrar por ID");

        int option = sc.nextInt(); sc.nextLine();

        switch (option) {
            case 1: 
                    System.out.println("Selecciona posición: ");
                    int positionTarget = sc.nextInt();
                
                break;
            case 2:
                    System.out.println("Selecciona ID: ");
                    String Id = sc.nextLine();

                     Node n = first; Node find;

                    do {
                        if (Id.equals(n.data.Id)) {
                            find = n;
                            Node saveData = find;

                            if (find==first) {
                                saveData.linkRigth = find;
                                find.linkLeft = last;
                                last.linkRigth = find;
                                find = first;
                            } else if(find==last){
                                saveData.linkLeft = find;
                                find.linkRigth = first;
                                first.linkLeft = find;
                                find = last;
                            } else{
                                Node saveDataNodeLeft; Node saveDataRigth;
                                saveDataNodeLeft = find.linkLeft; saveDataRigth = find.linkRigth;
                                saveDataNodeLeft.linkRigth = saveDataRigth;
                                saveDataRigth.linkLeft = saveDataNodeLeft;
                            }
                        
                            
                        }
                       n = n.linkRigth;
                        
                    } while (n!=first);
            break;

        
            default:
                System.out.println("Selecciona alguna opción valida");
                break;
        }

    }
    public void viewLinkedList(){
        if (isEmpty()) {
            
        } else{
             Node n = first; int k = 1; 
            do {
        System.out.println("|Posición|"+k);
        System.out.println("Nombre del paciente: " + n.data.name);
        System.out.println("Caso médico del paciente: " + n.data.medicalCase);
        System.out.println("ID del paciente: " + n.data.Id);
        System.out.println("Edad del paciente: " + n.data.age);
        n = n.linkRigth; k++;
        
       } while (n!=first);

        }

        }
       
    }




