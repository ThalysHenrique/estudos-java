package Escola.program;

import Escola.entities.Disciplina;
import Escola.models.Aluno;
import Escola.models.Professor;

public class Main {
    public static void main(String[] args) {

     Professor p1 = new Professor("Einstein", "Robertson", "44445555", 12000.0);
     Professor p2 = new Professor("Zuckerberg", "DoFace", "22223333", 100000.0);

     Disciplina d1 = new Disciplina("Ciencias", p1);
     Disciplina d2 = new Disciplina("Zuckerberg", p2);

     Aluno a1 = new Aluno("Thalys", "Henrique", "77778888");

     a1.addDisciplina(d1);
     a1.addDisciplina(d2);

     System.out.println(a1);

     a1.removeDisciplina(d2.getNome());

     System.out.println(a1);
    }
}
