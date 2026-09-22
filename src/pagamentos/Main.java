package pagamentos;

public class Main {

    public static void main(String[] args) {

        ServicoPagamentoLegado servicoLegado =
                new ServicoPagamentoLegado();

        AdaptadorPagamento adaptador =
                new AdaptadorPagamento(servicoLegado);

        SistemaCompras sistema =
                new SistemaCompras(adaptador);

        sistema.finalizarCompra(250.00);
    }
}
