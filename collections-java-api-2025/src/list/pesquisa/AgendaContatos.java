package list.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }
    public void AdicionarContato(String nome, String telefone, String email) {
        contatoSet.add(new Contato(nome, telefone, email));

    }
    public void exibirContato(){
        System.out.println(contatoSet);

    }
    public Set<Contato>pesquisarPorNome(String nome){
        Set<Contato>contatosPorNome = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, String telefone){
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setTelefone(telefone);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContato();
        agenda.AdicionarContato("Pedro Alencar", "123456", "cami@camila");
        agenda.AdicionarContato("Camila", "06", "cami@camila");
        agenda.AdicionarContato("Camila Cavalcante", "11111", "cami@cavalcante");
        agenda.AdicionarContato("Camila Odisseia", "9999", "");
        agenda.AdicionarContato("Joana", "2928", "cami@camila");

        agenda.exibirContato();
    }
}


