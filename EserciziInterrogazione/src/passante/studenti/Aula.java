package passante.studenti;

public class Aula {
    private Studente[] studenti;
    private int max;

    public Aula(int max) {
        this.max = max;
        this.studenti = new Studente[max];
    }

    public void addStudent(Studente s) {
        for (var i = 0; i < studenti.length; i++) {
            if (studenti[i] == null) {
                studenti[i] = s;
                break;
            }
        }
    }

    public void printStudents() {
        for (Studente s : studenti) {
            if (s != null) {
                s.printDetails();
                System.out.println("****************************");
            }
        }
    }
}
