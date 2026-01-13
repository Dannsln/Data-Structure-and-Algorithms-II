package Minimarket;

import java.util.Scanner;

public class List {

    Node first;
    Node last;

    Scanner sc = new Scanner(System.in);

    public Customer readData(){

        System.out.println("Ingresa nombre: ");
        String firstName = sc.nextLine();
        System.out.println("Ingresa apellido: ");
        String secondName = sc.nextLine();
        System.out.println("Ingresa DNI: ");
        String dni = sc.nextLine();
        System.out.println("Ingresa email: ");
        String email = sc.nextLine();
     
        Customer x = new Customer(firstName, secondName, dni, email);
        return x;
    }

    public boolean isEmpty(){
        return first == null;
    }


    public Customer[] settleList (){

        Customer [] data = new Customer[5];
        data[0] = new Customer("Pedrito", "Bazar", "50324231", "pedrito.com", 1);
        data[1] = new Customer("Pepito", "Contreras", "43242941", "pepito.com", 2);
        data[2] = new Customer("Londrady", "Ramos", "42142193", "laika.com", 3);
        data[3] = new Customer("Dann", "Pérez", "60880140", "dannsln.lune@gmail.com", 4);
        data[4] = new Customer("Dany", "Mondragon", "60880141", "nott.slc@gmail.com", 5);
        
        for(Customer p : data){
            Node arise = new Node(p);

            if (isEmpty()) {
                first = arise; last = arise;
                arise.linkLeft = arise; arise.linkRigth = arise; 
            } else{
                last.linkRigth = arise; first.linkLeft = arise;
                arise.linkLeft = last; arise.linkRigth = first;
                last = arise;
            }
        }

        return data;


    }

    public void createList(){
        Node arise = new Node();
        first = arise; last = arise;
        arise.linkLeft = arise; arise.linkRigth = arise;
    }

    public void insertAtTheBegin(){
        Node arise = new Node();
        if (isEmpty()) {
            first = arise; last = arise;
            arise.linkLeft = arise; arise.linkRigth = arise;  
        } else{
            arise.linkRigth = first; last.linkRigth = arise;
            arise.linkRigth = first; arise.linkLeft = last;
            first = arise;
        }
    }

    public void insertAtTheEnd(){
        Node arise = new Node(readData());
        if (isEmpty()) {
            first = arise; last = arise;
            arise.linkLeft = arise; arise.linkRigth = arise;  
            arise.data.turn = 1;
        } else{
            arise.data.turn = last.data.turn+1;
            last.linkRigth = arise; first.linkLeft = arise;
            arise.linkLeft = last; arise.linkRigth = first;
            last = arise;
        }
    }

    public void viewLinkedList(){
        if (isEmpty()) {
            System.out.println("La lista está vacía");
            return;
        }
        Node n = first;

        do {
            System.out.println("Nombre Cliente :" +n.data.firstName+" "+n.data.secondName);
            System.out.println("DNI :"+first.data.dni);
            System.out.println("Email : "+first.data.email);
            System.out.println("Cliente con turno: "+n.data.turn);
            

            n= n.linkRigth;
            
        } while (n!=first);
    }


    public void attend(){

        if (isEmpty()) {
            System.out.println("No hay clientes para atender");
            return;
        }

    
        if(first == last){
            System.out.println("Atendiendo customer con turno: " + first.data.turn);
            if (isEmpty()) {
                System.out.println("Lista vacía ahora");
            }
        }

        System.out.println("Atendiendo a :" +first.data.firstName);
        System.out.println("Atendiendo a: "+first.data.secondName);
        System.out.println("Atendiendo a :"+first.data.dni);
        System.out.println("Atendiendo a : "+first.data.email);
        System.out.println("Atendiendo a turno :" +first.data.turn);
        first = first.linkRigth;
        first.linkLeft = last;
        last.linkRigth = first;


        Node n = first;
        int t = 1;
        do {
            n.data.turn = t++;
            n = n.linkRigth;
        } while (n != first);



    }
}
