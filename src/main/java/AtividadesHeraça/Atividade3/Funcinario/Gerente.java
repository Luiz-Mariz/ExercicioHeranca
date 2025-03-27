package AtividadesHeraça.Atividade3.Funcinario;

public class Gerente extends Funcionario {

    public Gerente() {

    }

    public Gerente(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario(Double salario){
        super.calcularSalario(salario);
        salarioBase += 1000;
    }

}