package passante.studenti;

import java.util.Scanner;

public class Studente {
    private String name;
    private String surname;
    private double[] grades = new double[5];

    public Studente(Scanner scanner) {
        scanner.nextLine();

        System.out.println("name >> ");
        this.name = scanner.nextLine();

        System.out.println("Surname >> ");
        this.surname = scanner.nextLine();

        for (var i = 0; i < grades.length; i++) {
            System.out.println("grade >> ");
            double grade = scanner.nextDouble();
            addGrades(i, grade);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String addGrades(int pos, double grade) {
        if (pos < 0 || pos >= grades.length) {
            return "Impossibile aggiungere voto!!";
        }
        if (grades[pos] == 0) {
            grades[pos] = grade;
            return "Succesfull!!";
        }
        return "is already here!!";
    }

    public double media() {
        int sum = 0;
       for (var i = 0; i < grades.length; i++) {
           sum += grades[i];
       }
       return sum/grades.length;
    }

    public void printDetails() {
        System.out.println("name >> " + name + "\nsurname >> " + surname);
        System.out.println("grades >> ");

        for (var i = 0; i < grades.length; i++) {
            if (grades[i] != 0) {
                System.out.println(i + ". " + grades[i]);
            }
        }

        System.out.println("media >> " + media());
    }
}
