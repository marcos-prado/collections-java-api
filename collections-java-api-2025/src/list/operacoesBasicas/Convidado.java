package list.operacoesBasicas;

public class Convidado {
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    private int codigoConvidado;

    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    public void setCodigoConvidado(int codigoConvidado) {
        this.codigoConvidado = codigoConvidado;
    }

    public Convidado(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvidado = codigoConvidado;
    }
    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvidado=" + codigoConvidado +
                '}';
    }

   


}
