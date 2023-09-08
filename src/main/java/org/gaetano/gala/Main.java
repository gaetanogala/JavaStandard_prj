package org.gaetano.gala;

import org.gaetano.gala.model.Studente;
import org.gaetano.gala.model.Tutor;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> studentData = new ArrayList<>();
        List<String> tutorData = new ArrayList<>();

        System.out.println("Passami i dati dello studente!");
        getInput(scanner, studentData, 3);

        System.out.println("Passami i dati del tutor!");
        getInput(scanner, tutorData, 3);

        Studente studente = new Studente(studentData.get(0), studentData.get(1), studentData.get(2));
        System.out.println(studente);

        Tutor tutor = new Tutor(tutorData.get(0), tutorData.get(1), tutorData.get(2));
        System.out.println(tutor);
    }

    private static void getInput(Scanner scanner, List<String> values, int iterationLimit){

        System.out.println("Enter values('esc' to exit):");
        String value = scanner.nextLine();
        values.add(value);

        if(iterationLimit != 0){
            while(values.size() < iterationLimit){
                System.out.print("Next value: ");
                value = scanner.nextLine();
                values.add(value);
            }
        }else{
            while(!Objects.equals(value, "esc")){
                System.out.print("Next value: ");
                value = scanner.nextLine();
                values.add(value);
            }
        }

        System.out.println("These are the inserted values:");

        for(String val: values) {
            if(!Objects.equals(val, "esc"))
                System.out.println(val);
        }
    }
}