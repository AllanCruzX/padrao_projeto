package criacionais;

public class FactoryMethod_3 {

    public void main(String[] args) {
        Categoria3 categoria3 = new Categoria3();
        Produto3 produto3 = categoria3.novoProduto(1);
    }


    interface Produto3 {
    }

    class ProdutoPadrao3 implements Produto3 {
    }

    class ProdutoDigital3 extends ProdutoPadrao3 {
    }

    class ProdutoFisico3 extends ProdutoPadrao3 {
    }

    class Categoria3 {
//  private String nome;
//  private Integer prioridade;

        // ...

        public Produto3 novoProduto(int tipoProduto) {
            switch (tipoProduto) {
                case 1:
                    return new ProdutoPadrao3();
                case 2:
                    return new ProdutoDigital3();
                case 3:
                    return new ProdutoFisico3();
                default:
                    throw new IllegalArgumentException();
            }
        }
    }
}
