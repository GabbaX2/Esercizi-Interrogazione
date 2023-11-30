package passante.studenti;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        int nOfStudents = 0;

        try {
            nOfStudents = ipt.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("invalid input");
            System.exit(1);
        }

        Aula a1 = new Aula(nOfStudents);

        for (var i = 0; i < nOfStudents; i++) {
            System.out.println("STUDENTS SPECIFICSSS >> ");
            a1.addStudent(new Studente(ipt));
        }

        System.out.println("STUDENT DETAILSSSSS >> ");
        a1.printStudents();
    }
}