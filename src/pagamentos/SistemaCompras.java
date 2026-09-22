package pagamentos;

public class SistemaCompras {

    private Pagamento pagamento;

    public SistemaCompras(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public final void finalizarCompra(double valor) {
        System.out.println("Finalizando compra...");
        pagamento.pagar(valor);
        System.out.println("Compra concluída com sucesso.");
    }
}
