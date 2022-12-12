package AgendaTelefonica.models;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<>();
    }

    public int procuraContato(Contato contato){
        return contatos.indexOf(contato);
    }

    public void addContato(Contato contato){
        if (procuraContato(contato) == -1){
            contatos.add(contato);
        } else {
            System.out.println("contato já existe!");
        }
    }

    public void removeContato(Contato contato){
        if(procuraContato(contato) == -1){
            System.out.println("esse contato não existe!");
        } else {
            contatos.remove(contato);
        }
    }

    public void editarContato(Contato contato, String novoNome){
        int indice = procuraContato(contato);
        if(indice == -1){
            System.out.println("esse contato não existe!");
        } else {
            contatos.get(indice).setNome(novoNome);
        }
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }
}
