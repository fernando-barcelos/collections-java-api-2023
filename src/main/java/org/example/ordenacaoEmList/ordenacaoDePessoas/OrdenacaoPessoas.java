package org.example.ordenacaoEmList.ordenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        //TODO Implementar método
        if (!pessoaList.isEmpty()) {
            pessoaList.add(new Pessoa(nome, idade, altura));
        }
    }

    public List<Pessoa> ordenarPorIdade() {
        //TODO Implementar método
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura() {
        //TODO Implementar método
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }
}
