package AgendaTelefonica.models;

import java.util.ArrayList;

public class Contato {

    private String nome;
    private ArrayList<String> telefones;

    public Contato(String nome) {
        this.nome = nome;
        telefones = new ArrayList<>();
    }

    public Contato(){
        telefones = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addTelefone(String telefone){
        telefones.add(telefone);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefones=" + telefones +
                '}';
    }
}
