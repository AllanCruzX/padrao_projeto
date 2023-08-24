package criacionais;

public class FactoryMethod_2 {


    public void main(String[] args) {
        Categoria2 categoria2 = new Categoria2();
        Produto2 produto2 = categoria2.novoProduto();
    }

    interface Produto2 {
    }

    class ProdutoDigital2 implements Produto2 {
    }

    class ProdutoFisico2 implements Produto2 {
    }

    class Categoria2 {

    //  private String nome;
    //  private Tipo tipo;
    //  private Integer prioridade;

        public Produto2 novoProduto() {
            // ...
            return new ProdutoFisico2();
        }
    }

    class CategoriaDigital extends Categoria2 {
        public Produto2 novoProduto() {
            // ...
            return new ProdutoDigital2();
        }
    }

}
