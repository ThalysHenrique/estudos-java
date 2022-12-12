package Escola.models;

import Escola.entities.Disciplina;

import java.util.ArrayList;

public class Aluno extends Pessoa {

    private ArrayList<Disciplina> disciplinas;

    public Aluno(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        disciplinas = new ArrayList<>();
    }

    public int encontraDisciplina(String nomeDisciplina){
        for (Disciplina d : disciplinas){
            if(nomeDisciplina.equals(d.getNome())){
                return disciplinas.indexOf(d);
            }
        }
        return -1;
    }

    public void addDisciplina(Disciplina disciplina){
        if(encontraDisciplina(disciplina.getNome()) == -1){
            disciplinas.add(disciplina);
        } else {
            System.out.println("disciplina já existe!");
        }
    }

//    public void removeDisciplina(Disciplina disciplina){
//        if(encontraDisciplina(disciplina.getNome()) == -1){
//            System.out.println("esta disciplina não existe!");
//        } else {
//            disciplinas.remove(disciplina);
//        }
//    }

    public void removeDisciplina(String nomeDisciplina){
        int indice = encontraDisciplina(nomeDisciplina);
        if(indice == -1){
            System.out.println("Esta disciplina não existe!");
        } else {
            disciplinas.remove(indice);
        }
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() +
                "disciplinas=" + disciplinas +
                '}';
    }
}
