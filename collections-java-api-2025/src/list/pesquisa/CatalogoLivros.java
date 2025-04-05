package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarProAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }

        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisaPorIntervaloAnos(int anoInicio, int anoFim) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getAnoPublicacao() >= anoInicio && livro.getAnoPublicacao() <= anoFim) {
                    livrosPorIntervalo.add(livro);
                }
            }

        }
        return livrosPorIntervalo;
    }
    public Livro pesquisarPortituLivro(String titulo) {
        Livro livroEncontrado = null;
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroEncontrado = livro;
                    break;
                }
            }

        }
        return livroEncontrado;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogo.adicionarLivro("1984", "George Orwell", 1949);
        catalogo.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);

        List<Livro> livrosPorAutor = catalogo.pesquisarProAutor("J.R.R. Tolkien");
        System.out.println("Livros de J.R.R. Tolkien:");
        for (Livro livro : livrosPorAutor) {
            System.out.println(livro.getTitulo() + " (" + livro.getAnoPublicacao() + ")");
        }

        List<Livro> livrosPorIntervalo = catalogo.pesquisaPorIntervaloAnos(1930, 1950);
        System.out.println("\nLivros publicados entre 1930 e 1950:");
        for (Livro livro : livrosPorIntervalo) {
            System.out.println(livro.getTitulo() + " (" + livro.getAnoPublicacao() + ")");
        }

        Livro livroEncontrado = catalogo.pesquisarPortituLivro("1984");
        if (livroEncontrado != null) {
            System.out.println("\nLivro encontrado: " + livroEncontrado.getTitulo() + " (" + livroEncontrado.getAnoPublicacao() + ")");
        } else {
            System.out.println("\nLivro não encontrado.");
        }
    }
}
