package org.gaetano.gala;

import org.gaetano.gala.model.Studente;
import org.gaetano.gala.model.Tutor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        int tutorNumber = 0;
        int studentNumber = 0;

        Scanner scanner = new Scanner(System.in);
        List<Studente> students = new ArrayList<>();
        List<Tutor> tutors = new ArrayList<>();

        List<String> studentParams= new ArrayList<>();

        studentParams.add("matricola");
        studentParams.add("facolta");
        studentParams.add("universita");

        List<String> tutorParams= new ArrayList<>(){{
            add("idTutor");
            add("corso");
            add("sede");
        }};

        System.out.println("Benvenuto!! Iniziamo!");
        System.out.println("Quanti tutor vuoi inserire?");

        tutorNumber = scanner.nextInt();

        while(tutorNumber <= 0){
            System.out.println("Hai inserito un numero di tutor pari a "+tutorNumber+"! Sei sicuro(Y/N):");
            var readResponse = scanner.nextLine();
            while(readResponse.equals("N") || readResponse.equals("n")){
                tutorNumber = scanner.nextInt();
            }
        }

        System.out.println("Quanti studenti vuoi inserire?");

        studentNumber = scanner.nextInt();

        while(studentNumber <= 0){
            System.out.println("Hai inserito un numero di studenti pari a "+studentNumber+"! Sei sicuro(Y/N):");
            var readResponse = scanner.nextLine();
            while(readResponse.equals("N") || readResponse.equals("n")){
                studentNumber = scanner.nextInt();
            }
        }

        System.out.println("Perfetto!\n"+ (studentNumber == 1 ? "Passami i dati dello studente!" : "Passami i dati degli studenti!"));
        for(int i=0; i<studentNumber; i++){

            List<String> studentData = new ArrayList<>();

            getInput(scanner, studentData, studentParams, "studente");
            if(!studentData.isEmpty()){
                Studente studente = new Studente(studentData.get(0), studentData.get(1), studentData.get(2));
                students.add(studente);
            }
        }

        System.out.println("Ottimo! Ancora un altro step!\n"+(studentNumber == 1?"Passami i dati del tutor!":"Passami i dati dei tutor!"));
        for(int i=0; i<tutorNumber; i++){

            List<String> tutorData = new ArrayList<>();
            getInput(scanner, tutorData, tutorParams, "tutor");
            if(!tutorData.isEmpty()){
                Tutor tutor = new Tutor(tutorData.get(0), tutorData.get(1), tutorData.get(2));
                tutors.add(tutor);
            }
        }

        System.out.println("Questa è la lista degli studenti!");
        students.forEach(System.out::println);

        System.out.println("Questa è la lista dei tutor!");
        tutors.forEach(System.out::println);
    }

    private static void getInput(Scanner scanner, List<String> values, List<String> params, String type){

        System.out.println("Iniziamo con l'inserimento dei valori!");
        for (String param: params) {
            System.out.print("Inserire "+param+" "+type+":");
            String value = scanner.nextLine();
            values.add(value);
        }
        System.out.println("Questi sono i valori inseriti:");

        for(String val: values) {
            System.out.println(val);
        }
    }
}