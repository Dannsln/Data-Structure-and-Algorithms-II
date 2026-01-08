package Minimarket;

import java.util.Scanner;

import Shikai.Patient;

public class List {

    Node first;
    Node last;

    Scanner sc = new Scanner(System.in);

    public Customer readData(){

        System.out.println("Ingresa turno: ");
        int turn = sc.nextInt();
        Customer x = new Customer(turn);
        return x;
    }

    public boolean isEmpty(){
        return first == null;
    }


    public Customer[] settleList (){

        Customer [] data = new Customer[10];
        data[0] = new Customer(1);
        data[1] = new Customer(2);
        data[2] = new Customer(3);
        data[3] = new Customer(4);
        data[4] = new Customer(5);
        data[5] = new Customer(6);
        data[6] = new Customer(7);
        data[7] = new Customer(8);
        data[8] = new Customer(9);
        data[9] = new Customer(10);

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
        Node arise = new Node();
        if (isEmpty()) {
            first = arise; last = arise;
            arise.linkLeft = arise; arise.linkRigth = arise;  
        } else{
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
