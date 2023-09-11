package org.gaetano.gala;

import org.gaetano.gala.model.StudentStatus;

import java.util.Objects;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args){

        /*Fase 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao!\nInserisci un valore numerico(tax) per sapere lo stato studente:");
        Integer readValue = scanner.nextInt();

        System.out.println("Questo è il tuo stato: "+StudentStatus.getStatusByTax(readValue));

        //Fase 2
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Ciao!\nInserisci un valore numerico(tax) per sapere lo stato studente:");
        readValue = scanner.nextInt();
        StudentStatus foundStatus = StudentStatus.getStatusByTax(readValue);
        if(foundStatus == null)
            System.out.println("Il valore inserito è errato!");
        else
            System.out.println("Questo è il tuo stato: "+foundStatus);*/


        //Fase 3
        Scanner scanner = new Scanner(System.in);

        String escapeChar = "";
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("nserisci un valore numerico(tax) per sapere lo stato studente:");
        getValue(scanner);
        while(!escapeChar.equals("esc")){
            System.out.print("Vuoi continuare la ricerca(Y/N)?");
            String response = scanner.next();
            if(Objects.equals(response, "Y") || Objects.equals(response, "y")) {
                System.out.println("Ciao!\nInserisci un valore numerico(tax) per sapere lo stato studente:");
                getValue(scanner);
            }else if(Objects.equals(response, "N") || Objects.equals(response, "n")){
                System.out.println("Termino l'esecuzione!\nCiao");
                escapeChar = "esc";
            }
        }
    }

    private static void getValue(Scanner scanner){
        Integer readValue = scanner.nextInt();
        StudentStatus foundStatus = StudentStatus.getStatusByTax(readValue);
        if (foundStatus == null)
            System.out.println("Il valore inserito è errato!");
        else
            System.out.println("Questo è il tuo stato: " + foundStatus);
    }
}
