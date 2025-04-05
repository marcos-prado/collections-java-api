package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();

    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new CompararPorAltura());
        return pessoasPorAltura;

    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Alice", 30, 1.65);
        ordenacaoPessoas.adicionarPessoa("Bob", 25, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 35, 1.75);
        ordenacaoPessoas.adicionarPessoa("Diana", 28, 1.70);

        System.out.println(ordenacaoPessoas.ordernarPorIdade());
        System.out.println(ordenacaoPessoas.ordernarPorAltura());
        // Teste de ordenação por idade
    }
}
