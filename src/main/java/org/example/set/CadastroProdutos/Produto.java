package org.example.set.CadastroProdutos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String nome;
    private long cod;
    private double preco;
    private double quantidade;

    public Produto(String nome, long cod, double preco, double quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCod());
    }

    @Override
    public int compareTo(Produto produto) {
        return nome.compareToIgnoreCase(produto.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto preco1, Produto preco2) {
        return Double.compare(preco1.getPreco(), preco2.getPreco());
    }
}