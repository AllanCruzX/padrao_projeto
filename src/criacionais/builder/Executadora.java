package criacionais.builder;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Executadora {

    public static void main(String[] args) {

        deveCalcularValorTotalPedidoParaClienteVipComBuilder();

    }

    private static void deveCalcularValorTotalPedidoParaClienteVipSemBuilder() {
        PedidoVenda pedidoVenda = new PedidoVenda();

        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.setVip(true);
        pedidoVenda.setCliente(cliente);

        ItemPedido item1 = new ItemPedido();
        item1.setNome("Calculadora");
        item1.setValorUnitario(new BigDecimal("200"));
        item1.setQuantidade(2);

        ItemPedido item2 = new ItemPedido();
        item2.setNome("Mochila");
        item2.setValorUnitario(new BigDecimal("200"));
        item2.setQuantidade(1);

        List<ItemPedido> itensPedido = Arrays.asList(item1, item2);
        pedidoVenda.setItensPedido(itensPedido);

        BigDecimal valorTotal = pedidoVenda.getValorTotal();
    }

    private static void deveCalcularValorTotalPedidoParaClienteVipComBuilder() {

        PedidoVenda pedidoVenda = new PedidoVendaBuilder()
                .comClienteVip("João Silva")
                .comItem("Calculadora", 2, "200")
                .comItem("Mochila", 1, "200")
                .comNumero("02020")
                .construir();

        BigDecimal valorTotal = pedidoVenda.getValorTotal();

    }
}
