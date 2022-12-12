package Escola.models;

public class Diretor extends Pessoa {

    private double salario;

    public Diretor(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Diretor{" + super.toString() +
                "salario=" + salario +
                '}';
    }
}
