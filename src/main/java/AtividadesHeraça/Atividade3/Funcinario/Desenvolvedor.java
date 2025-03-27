package AtividadesHeraça.Atividade3.Funcinario;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario(Double salario){
        super.calcularSalario(salario);
        salarioBase += (salario * 0.10) ;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "salarioBase=" + salarioBase +
                "} " + super.toString();
    }
}