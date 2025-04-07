package list.ordenacao;

public class Produto {
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters and Setters
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Produto produto = (Produto) obj;
        return codigo == produto.codigo && Double.compare(produto.preco, preco) == 0 && quantidade == produto.quantidade
                && nome.equals(produto.nome);
    }

    @Override
    public int hashCode() {
        return Long.hashCode(codigo) + nome.hashCode() + Double.hashCode(preco) + Integer.hashCode(quantidade);

    }
}
