package com.sergio.estoque.servico;

import com.sergio.estoque.modelo.Estocavel;

public  class GerenciadorEstoque<T extends Estocavel> {

    private int quantidadeTotal;

    public void adicionar(T estocavel) {
        quantidadeTotal += estocavel.getQuantidadeEstoque();
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }


}
