package AgendaTelefonica.program;

import AgendaTelefonica.models.Agenda;
import AgendaTelefonica.models.Contato;

public class Main {
    public static void main(String[] args) {

        Agenda a1 = new Agenda();
        Contato c1 = new Contato("Thalys");
        c1.addTelefone("88889999");
        a1.addContato(c1);

        Contato c2 = new Contato("Henrique");
        a1.addContato(c2);
        c2.addTelefone("77778888");

        System.out.println(a1);
        System.out.println(c1);

        a1.editarContato(c2, "James");

        a1.removeContato(c1);

        System.out.println(a1);
    }
}
