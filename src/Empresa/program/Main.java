package Empresa.program;

import Empresa.models.Empregado;

public class Main {
    public static void main(String[] args) {

        Empregado e1 = new Empregado("Thalys", "Henrique", 2500.0);

        e1.aumentoSalario(10);

        System.out.println(e1);
    }
}
