package comportamentais;

import java.math.BigDecimal;

public class Strategy_2 {

    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("10");
        Compra2 compra = new Compra2(valor);

        compra.processarCompra(new PagamentoCartaoCredito2());
        //compra.processarCompra(new PagamentoCartaoDebito2());
    }

}

//----------------------------------------------------

class Compra2 {

    // Long id;
    BigDecimal valor;
    // Tipo


    public Compra2(BigDecimal valor) {
        this.valor = valor;
    }

    void processarCompra(EstrategiaPagamento2 estrategiaPagamento) {
        estrategiaPagamento.pagar(this);
    }

}

//----------------------------------------------------

interface EstrategiaPagamento2 {

    void pagar(Compra2 compra);

}

//----------------------------------------------------

class PagamentoCartaoCredito2 implements EstrategiaPagamento2 {

    @Override
    public void pagar(Compra2 compra) {
        System.out.println("Pagou no crédito " + compra.valor);
        // compra.set...
    }

}

//----------------------------------------------------

class PagamentoCartaoDebito2 implements EstrategiaPagamento2 {

    @Override
    public void pagar(Compra2 compra) {
        System.out.println("Pagou no débito " + compra.valor);
    }

}

