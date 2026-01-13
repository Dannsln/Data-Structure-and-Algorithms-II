package Minimarket;

public class Customer {

    String firstName;
    String secondName;
    String dni;
    String email;
    int turn;

    
    public Customer(String firstName, String secondName, String dni, String email, int turn) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.dni = dni;
        this.email = email;
        this.turn = turn;
    }


    public Customer(String firstName, String secondName, String dni, String email){

        this.firstName = firstName;
        this.secondName = secondName;
        this.dni = dni;
        this.email = email;
    }

   

    

}
