package pagamentos;

public class AdaptadorPagamento implements Pagamento {

    private ServicoPagamentoLegado servicoLegado;

    public AdaptadorPagamento(ServicoPagamentoLegado servicoLegado) {
        this.servicoLegado = servicoLegado;
    }

    @Override
    public void pagar(double valor) {
        servicoLegado.efetuarPagamento(valor);
    }
}
