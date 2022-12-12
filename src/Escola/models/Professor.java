package Escola.models;

public class Professor extends Pessoa {

    private double salario;

    public Professor(String nome, String sobrenome, String cpf, double salario) {
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
        return "Professor{" + super.toString() +
                "salario=" + salario +
                '}';
    }
}
