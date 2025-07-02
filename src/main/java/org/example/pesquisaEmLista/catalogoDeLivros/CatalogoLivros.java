package org.example.pesquisaEmLista.catalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> listLivrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    listLivrosPorAutor.add(livro);
                }
            }
        }
        return listLivrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> listaLivrosPorAno = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livro livro : livrosList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosList.add(livro);
                }
            }
        }
        return  listaLivrosPorAno;
    }

    public Livro pesquisarPorTitulo (String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


}
