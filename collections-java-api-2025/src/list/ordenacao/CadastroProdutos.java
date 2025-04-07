package list.ordenacao;

public class CadastroProdutos {
    private Produto[] produtos;
    private int contador;

    public CadastroProdutos(int tamanho) {
        produtos = new Produto[tamanho];
        contador = 0;
    }

    public void adicionarProduto(Produto produto) {
        if (contador < produtos.length) {
            produtos[contador++] = produto;
        } else {
            System.out.println("Cadastro cheio! Não é possível adicionar mais produtos.");
        }
    }

    public void listarProdutos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(produtos[i]);
        }
    }

    public void ordenarPorNome() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if (produtos[j].getNome().compareTo(produtos[j + 1].getNome()) > 0) {
                    Produto temp = produtos[j];
                    produtos[j] = produtos[j + 1];
                    produtos[j + 1] = temp;
                }
            }
        }
    }

    public void ordenarPorPreco() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if (produtos[j].getPreco() > produtos[j + 1].getPreco()) {
                    Produto temp = produtos[j];
                    produtos[j] = produtos[j + 1];
                    produtos[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos(5);
        
        cadastro.adicionarProduto(new Produto(101, "Produto A", 10.50, 5));
        cadastro.adicionarProduto(new Produto(102, "Produto B", 20.00, 3));
        cadastro.adicionarProduto(new Produto(103, "Produto C", 15.75, 8));
        
        System.out.println("Lista de Produtos:");
        cadastro.listarProdutos();
        
        System.out.println("\nOrdenando por Nome:");
        cadastro.ordenarPorNome();
        cadastro.listarProdutos();
        
        System.out.println("\nOrdenando por Preço:");
        cadastro.ordenarPorPreco();
        cadastro.listarProdutos();
    }
}
