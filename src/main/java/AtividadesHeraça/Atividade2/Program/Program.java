package AtividadesHeraça.Atividade2.Program;

import AtividadesHeraça.Atividade2.Veiculo.Bicicleta;
import AtividadesHeraça.Atividade2.Veiculo.Carro;
import AtividadesHeraça.Atividade2.Veiculo.Veiculo;

public class Program {
    public static void main(String[] args) {

        Veiculo[] veiculo = new Veiculo[] {new Carro(), new Bicicleta()};
        for (Veiculo v : veiculo){

            if (v instanceof Carro){
                Carro carro = (Carro) v;
                carro.mover();
            }
            if (v instanceof Bicicleta){
                Bicicleta bicicleta = (Bicicleta) v;
                bicicleta.mover();
            }
        }
    }
}
