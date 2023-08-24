package criacionais.factoryMethod;

public class Cliente {

    public static void main(String[] args) {
        // Criador Abstrato =  Criador Concreto
        FabricaDeCarro fabrica = new FabricaFiat();
        // Produto Abstrato = Produto Concreto
        Carro carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println();

        fabrica = new FabricaWolks();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println();

        fabrica = new FabricaFord();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println();

        fabrica = new FabricaChevrolet();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
    }
}
