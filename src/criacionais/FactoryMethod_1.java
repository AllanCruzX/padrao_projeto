package criacionais;

public class FactoryMethod_1 {
    //Mais flexibilidade para criação de objetos.
    //Permite trabalhar com hierarquias paralelas.

    // Criador Abstrato
    // Produto Abstrato
    // Criador Concreto
    // Produto Concreto

    @SuppressWarnings("unused")
    public void main(String[] args) {
        Categoria categoria = new Digital();
        Produto produto = categoria.novoProduto();
    }

    // Produto Abstrato
    interface Produto {
    }

    // Produto Concreto
    class ProdutoDigital implements Produto {
    }

    // Produto Concreto
    class ProdutoFisico implements Produto {
    }

    // Criador Abstrato
    interface Categoria {
        Produto novoProduto();
    }

    // Criador Concreto
    class Digital implements Categoria {
        @Override
        public Produto novoProduto() {
            // ...
            return new ProdutoDigital();
        }
    }

    // Criador Concreto
    class Fisico implements Categoria {
        @Override
        public Produto novoProduto() {
            // ...
            return new ProdutoFisico();
        }
    }

}
