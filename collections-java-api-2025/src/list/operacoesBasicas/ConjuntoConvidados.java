package list.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado) {
        {
            convidadoSet.add(new Convidado(nome, codigoConvidado));

        }
    }

    public void removerConvidado(int codigoConvidado) {
        convidadoSet.removeIf(convidado -> convidado.getCodigoConvidado() == codigoConvidado);
    }

    public void listarConvidados() {
        for (Convidado convidado : convidadoSet) {
            System.out.println(convidado);
        }
    }
    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();
        conjunto.adicionarConvidado("João", 1);
        conjunto.adicionarConvidado("Maria", 2);
        conjunto.adicionarConvidado("Pedro", 3);

        System.out.println("Lista de convidados:");
        conjunto.listarConvidados();

        conjunto.removerConvidado(2);
        conjunto.removerConvidado(1);

        System.out.println("Lista de convidados após remoção:");
        conjunto.listarConvidados();
    }
}
