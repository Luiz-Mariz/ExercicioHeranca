package AtividadesHeraça.Atividade3.Program;

import AtividadesHeraça.Atividade3.Funcinario.Desenvolvedor;
import AtividadesHeraça.Atividade3.Funcinario.Funcionario;
import AtividadesHeraça.Atividade3.Funcinario.Gerente;

public class Program {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Luiz", 0.00);
        Funcionario gerente = new Gerente("Fabiano", 0.00);
        Funcionario desenvlovedor = new Desenvolvedor("Bezerra", 0.00);

        funcionario.calcularSalario(1000.00);
        gerente.calcularSalario(1000.00);
        desenvlovedor.calcularSalario(1000.00);

        System.out.println("Funcionario: " + funcionario.getNome() + ", Salario $" + funcionario.getSalarioBase());
        System.out.println("Gerente: " + gerente.getNome() + ", Salario $" + gerente.getSalarioBase());
        System.out.println("Desenvolvedor: " + desenvlovedor.getNome() + ", Salario $" + desenvlovedor.getSalarioBase());
    }
}
