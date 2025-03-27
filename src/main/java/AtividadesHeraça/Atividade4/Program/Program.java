package AtividadesHeraça.Atividade4.Program;

import AtividadesHeraça.Atividade4.Pagamento.Pagamento;
import AtividadesHeraça.Atividade4.Pagamento.PagamentoCartao;
import AtividadesHeraça.Atividade4.Pagamento.PagamentoDinheiro;

public class Program {
    public static void main(String[] args) {

        Pagamento[] pagamentos = new Pagamento[] {new PagamentoCartao(), new PagamentoDinheiro()};


        for (Pagamento pagamento : pagamentos){

            if (pagamento instanceof PagamentoCartao){
                PagamentoCartao pagamentoCartao = (PagamentoCartao) pagamento;
                pagamentoCartao.realizarPagamento();
            }
            if (pagamento instanceof PagamentoDinheiro){
                PagamentoDinheiro pagamentoDinheiro = (PagamentoDinheiro) pagamento;
                pagamentoDinheiro.realizarPagamento();
            }
        }
    }
}
