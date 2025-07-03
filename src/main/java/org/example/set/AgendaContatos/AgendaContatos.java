package org.example.set.AgendaContatos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoEcontrado = new HashSet<>();
        if(nome != null){
            for(Contato contato : contatoSet){
                if(contato.getNome().startsWith(nome)){
                    contatoEcontrado.add(contato);
                }
            }
        }
        return contatoEcontrado;
    }

    public Set<Contato> atualizarNumeroDeContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato contato : contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumeroTelefone(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return Collections.singleton(contatoAtualizado);
    }
}
