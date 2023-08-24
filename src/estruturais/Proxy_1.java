package estruturais;

public class Proxy_1 {

    // RealSubject / Implementação
    // Proxy

    public static void main(String[] args) {
//        ProdutoDAO produtoDAO = new ProdutoDAO();
        ProdutoDAO produtoDAO = new LogProdutoDAO();
        ProdutoService produtoService = new ProdutoService(produtoDAO);

        produtoService.buscarProduto(1);
        produtoService.buscarProduto(2);
        produtoService.buscarProduto(3);
    }

}

//----------------------------------------------------

class ProdutoService {

    private ProdutoDAO produtoDAO;

    public ProdutoService(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    public Object buscarProduto(long id) {
        return produtoDAO.find(id);
    }

}

//----------------------------------------------------

class ProdutoDAO {

    public ProdutoDAO() {
        simulaTempoAlto();
    }

    public Object find(long id) {
        // Busca produto e retorna
        simulaTempoAlto();
        return new Object();
    }

    private void simulaTempoAlto() {
        try {
            // Cria conexão com o banco
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

//----------------------------------------------------

// Não mexi no Cliente
// Não mexi na Implementação original
// Herança

class LogProdutoDAO extends ProdutoDAO {

    @Override
    public Object find(long id) {
        System.out.println("Buscando produto com id " + id);
        Object find = super.find(id);
        System.out.println("Buscando produto com id " + id);
        return find;
    }

}


