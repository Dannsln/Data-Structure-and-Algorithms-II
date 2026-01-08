package Yumiko;

import java.util.Scanner;

public class Celositas {

 public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa tu nombre: ");
    String name = sc.nextLine();

    System.out.println("Nombre ingresado es: "+name);

    if (name.contains("Yumiko")) {
        System.out.println("Está bloqueda");
        
    } else{ 
        System.out.println("No está bloqueado");
    }
 }

}
